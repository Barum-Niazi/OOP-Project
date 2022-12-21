package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class SignUpController extends HelloApplication {

    @FXML
    public TextField fieldUsername;
    public PasswordField fieldPassword;
    public TextField fieldEmail;
    public Label signInLabel;
    public Button btnSignUp;

    public void handleSignIn(MouseEvent e) throws IOException {
        super.sceneSwitch("Sign in.fxml", 718, 476, e, "Sign in");
    }

    public void handleSignUp(ActionEvent e) throws IOException {
        if (fieldUsername.getText().isEmpty() || fieldPassword.getText().isEmpty() || fieldEmail.getText().isEmpty()) {
            fieldUsername.setText("Enter complete information");
        } else {
            User newUser = new User(fieldUsername.getText(), fieldPassword.getText(), fieldEmail.getText());
            User.users.add(newUser);
            super.sceneSwitch("Sign in.fxml", 718, 476, e, "Sign in");
        }
    }
}