package com.arfiz.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        String input = "(13+4)-(12+1)";
        var tokens = Lex(input);
        System.out.println(tokens.toString());
        var parse = parse(tokens);
        System.out.println(input +" = "+ parse.getValue());
    }

    static List<Token> Lex(String input) {
        var array = input.toCharArray();
        List<Token> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            switch (array[i]){
                case '+':
                    result.add(new Token(Token.Type.PLUS, "+"));
                    break;
                case '-':
                    result.add(new Token(Token.Type.MINUS, "-"));
                    break;
                case '(':
                    result.add(new Token(Token.Type.LPAREN, "("));
                    break;
                case ')':
                    result.add(new Token(Token.Type.RPAREN, ")"));
                    break;
                default:
                    var sb = new StringBuilder(Character.toString(array[i]));
                    for (int j = i + 1; j < array.length; ++j){
                        if (Character.isDigit(array[j])){
                            sb.append(array[j]);
                            ++i;
                        } else {
                            result.add(new Token(Token.Type.INTEGER, sb.toString()));
                            break;
                        }
                    }
                    break;
            }
        }
        return result;
    }

    static IElement parse(List<Token> tokens) {
        var result = new BinaryOperation();
        boolean haveLHS = false;
        for (int i = 0; i < tokens.size(); i++){
            var token = tokens.get(i);
            switch (token.type) {
                case INTEGER:
                    var integer = new Int(Integer.parseInt(token.text));
                    if (!haveLHS){
                        result.left = integer;
                        haveLHS = true;
                    }else {
                        result.right = integer;
                    }
                    break;
                case PLUS:
                    result.type = BinaryOperation.Type.ADDITION;
                    break;
                case MINUS:
                    result.type = BinaryOperation.Type.SUBTRACTION;
                    break;
                case LPAREN:
                    int j = i;
                    for (; j < tokens.size(); ++j)
                        if (tokens.get(j).type == Token.Type.RPAREN)
                            break;
                    var subexpression = tokens.stream().skip(i + 1).limit(j - i -1).collect(Collectors.toList());
                    var element = parse(subexpression);
                    if (!haveLHS){
                        result.left = element;
                        haveLHS = true;
                    }else {
                        result.right = element;
                    }
                    i=j;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
        return result;
    }
}
