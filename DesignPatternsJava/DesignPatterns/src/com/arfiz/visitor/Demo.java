package com.arfiz.visitor;

import com.arfiz.SOLIDDesignPriciple.singleResponsibilityPriciple.Journal;

public class Demo {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new PlainTextOperation());

    }
}
