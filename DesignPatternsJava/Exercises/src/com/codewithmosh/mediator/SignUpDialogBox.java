package com.codewithmosh.mediator;

public class SignUpDialogBox {
    private TextBox userNameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();
    private Button signUpButton = new Button();
    private CheckBox agreeCheckBox = new CheckBox();

    public SignUpDialogBox() {
        userNameTextBox.attach(this::controlChanged);
        passwordTextBox.attach(this::controlChanged);
        agreeCheckBox.attach(this::controlChanged);
    }

    public void simulateFormFillUp(){
        userNameTextBox.setContent("Arfiz");
        passwordTextBox.setContent("Arfiz");
        agreeCheckBox.setChecked(false);
        System.out.println("Button: " + signUpButton.isEnabled());
    }

    private void controlChanged(){
        signUpButton.setEnabled(isFormValid());
    }

    private boolean isFormValid(){
        return !isPasswordTextBoxEmpty() && !isUserNameTextBoxEmpty() && agreeCheckBox.isChecked();
    }

    private boolean isUserNameTextBoxEmpty(){
        return userNameTextBox.getContent() == "" || userNameTextBox.getContent() == null;
    }

    private boolean isPasswordTextBoxEmpty(){
        return passwordTextBox.getContent() == "" || passwordTextBox.getContent() == null;
    }
}
