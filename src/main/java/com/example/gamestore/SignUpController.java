package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;

//class END implements Serializable{
//    public static final long serialVersionUID = -617565425006163870L;
//}
public class SignUpController extends HelloApplication implements Serializable {

    @FXML
    public TextField fieldUsername;
    public PasswordField fieldPassword;
    public Label signInLabel;
    public Label validateLabel;
    public Button btnSignUp;

    public String fileName;
    public String generalName ="signIN";
    public void handleSignIn(MouseEvent e) throws IOException {
        super.sceneSwitch("Sign in.fxml", 718, 476, e, "Sign in");
    }

    public void handleSignUp(ActionEvent e) throws Exception {
        if (fieldUsername.getText().isEmpty() || fieldPassword.getText().isEmpty() ) {
            validateLabel.setText("Enter complete information!");
        } else {
            User newUser = new User(fieldUsername.getText(), fieldPassword.getText());
            newUser.wallet = 0;
            String password = fieldPassword.getText();
            if (password.length() < 8) {
                validateLabel.setText("Password must be 8 characters or longer!");
            } else {
                User.users.add(newUser);
                fileName = fieldUsername.getText();
                File userFile = new File("src\\main\\resources\\" + fileName + ".txt");
                if (userFile.exists()) {
                    validateLabel.setText("User already exists, please sign in!");
                } else {
                    FileOutputStream file = new FileOutputStream(userFile);
                    ObjectOutputStream out = new ObjectOutputStream(file);
                    out.writeObject(newUser);
                    out.close();
                    file.close();

                    super.sceneSwitch("Sign in.fxml", 718, 476, e, "Sign in");
                }
            }
        }
    }
}