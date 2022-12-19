package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SignInController extends HelloApplication{
    @FXML
    public TextField fieldUsername;
    @FXML
    private TextField fieldPassword;
    @FXML
    public Button btnIn;

    public void handleSignIn(ActionEvent e) throws IOException{
            if(((fieldUsername.getText().toString().equalsIgnoreCase("Anas Asif"))
                    ||(fieldUsername.getText().toString().equalsIgnoreCase("Barum Niazi"))
                    ||(fieldUsername.getText().toString().equalsIgnoreCase("Duaa Abrar")))
                    && fieldPassword.getText().toString().equals("Admin")){
                sceneSwitch("STORE.fxml", 1280, 720, e);
            }
            else if(fieldUsername.getText().isEmpty() || fieldPassword.getText().isEmpty()){
                fieldPassword.setText("Please Enter your credentials");
            }
            else {
                fieldUsername.setText("Wrong Username");
                fieldPassword.setText("or Wrong Password");
            }
    }

}
