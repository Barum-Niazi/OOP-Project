package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class SignInController extends HelloApplication {
    @FXML
    private TextField fieldUsername;
    @FXML
    private PasswordField fieldPassword;
    @FXML
    public Label signupLabel;
    public Label validateLabel;
    @FXML
    public Button btnIn;

//    public ProgressBar progressSignIn;

    public static String currentUser;
    public static double userWallet;
    public void handleSignIn(ActionEvent e) throws IOException, ClassNotFoundException{
        String userFile = fieldUsername.getText();
        File file = new File("src\\main\\resources\\"+userFile+".txt");
        if (file.exists()){
            FileInputStream filein = new FileInputStream("src\\main\\resources\\" + userFile + ".txt");
            ObjectInputStream in = new ObjectInputStream(filein);
            User user = new User();
            user = (User) in.readObject();
            if ((fieldUsername.getText().toString().equalsIgnoreCase(user.name)) &&
                    fieldPassword.getText().toString().equals(user.password)) {
                validateLabel.setText(null);
                currentUser = fieldUsername.getText();
//                user.wallet = 500;
                user.setAdminStatus(true);
                userWallet = user.wallet;
                super.sceneSwitch("STORE.fxml", 1280, 720, e, "Store");
            } else {
                validateLabel.setText("Wrong username or password!");
            }
        } else{
            if (fieldUsername.getText().isEmpty() || fieldPassword.getText().isEmpty()) {
                validateLabel.setText("Please enter your credentials!");
            } else
            validateLabel.setText("User does not exist!");
        }

    }
    public void handleSignup(MouseEvent m) throws IOException{
        super.sceneSwitch("Sign up.fxml", 718, 476, m, "Sign up");
    }
}
