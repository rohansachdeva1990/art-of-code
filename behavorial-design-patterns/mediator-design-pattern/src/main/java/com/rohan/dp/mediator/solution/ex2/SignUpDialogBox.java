package com.rohan.dp.mediator.solution.ex2;

// Mediator (with Observer Implementation)
public class SignUpDialogBox {

    private final TextBox usernameTextBox = new TextBox();
    private final TextBox passwordTextBox = new TextBox();
    private final CheckBox agreeToTermsCheckBox = new CheckBox();
    private final Button signUpButton = new Button();

    public SignUpDialogBox() {
        usernameTextBox.addEventHandler(this::onControlChanged);
        passwordTextBox.addEventHandler(this::onControlChanged);
        agreeToTermsCheckBox.addEventHandler(this::onControlChanged);
    }

    private void onControlChanged() {
        signUpButton.setEnabled(isFormValid());
    }

    private boolean isFormValid() {
        return !usernameTextBox.isEmpty() && !passwordTextBox.isEmpty() && agreeToTermsCheckBox.isChecked();
    }

    public void simulateUserInteraction() {
        // Initially the button should be disabled
        System.out.println("Initially: " + signUpButton.isEnabled());

        // The user enters their username, the button is still disabled
        usernameTextBox.setContent("username");
        System.out.println("After setting the username: " + signUpButton.isEnabled());

        // The user enters their password, the button is still disabled
        passwordTextBox.setContent("password");
        System.out.println("After setting the password: " + signUpButton.isEnabled());

        // The agrees to the terms, the button becomes enabled
        agreeToTermsCheckBox.setChecked(true);
        System.out.println("After agreeing to terms: " + signUpButton.isEnabled());

        // The user removes the password, the button becomes disabled
        passwordTextBox.setContent("");
        System.out.println("After removing the password: " + signUpButton.isEnabled());

        // The user enters the password again, the button becomes enabled
        passwordTextBox.setContent("password");
        System.out.println("After re-setting the password: " + signUpButton.isEnabled());
    }
}
