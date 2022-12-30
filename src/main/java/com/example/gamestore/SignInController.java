package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SignInController extends HelloApplication {
    @FXML
    private TextField fieldUsername;
    @FXML
    private PasswordField fieldPassword;
    @FXML
    public  Label signupLabel;
    @FXML
    public Button btnIn;

    public static String currentUser;
    public void handleSignIn(ActionEvent e) throws IOException, ClassNotFoundException {
//        for(int i = 0; i < User.users.size(); i++){
//            System.out.println(User.users.get(i));
//        }
//        for (int i = 0; i < User.users.size(); i++) {
////            if(((fieldUsername.getText().toString().equalsIgnoreCase("Anas Asif"))
////                    ||(fieldUsername.getText().toString().equalsIgnoreCase("Barum Niazi"))
////                    ||(fieldUsername.getText().toString().equalsIgnoreCase("Duaa Abrar")))
////                    && fieldPassword.getText().toString().equals("Admin")){
////                sceneSwitch("STORE.fxml", 1280, 720, e, "Store");
////            }
//            if(fieldUsername.getText().toString().equalsIgnoreCase(User.users.get(i).name)
//                    && fieldPassword.getText().toString().equalsIgnoreCase(User.users.get(i).password)) {
//                sceneSwitch("STORE.fxml", 1280, 720, e, "Store");
//                break;
//            }
//        }
        //Criminal rdcm = null;
        FileInputStream filein = new FileInputStream("src\\main\\resources\\generalSignIn.txt");
        ObjectInputStream in = new ObjectInputStream(filein);
        Object rdcm = null;

        first:
        while((rdcm = in.readObject()) instanceof END ==false){
            if((fieldUsername.getText().toString().equals(((User)rdcm).name)) && (fieldPassword.getText().toString().equals(((User)rdcm).password)));
            currentUser = fieldUsername.getText().toString();

            sceneSwitch("STORE.fxml", 1280, 720, e, "Store");
            break first;
            //System.out.println("Name of criminal:"+((Criminal)rdcm).name);
            //System.out.println("Age of criminal:"+((Criminal)rdcm).age);
            //System.out.println();


        }

        if (fieldUsername.getText().isEmpty() || fieldPassword.getText().isEmpty()) {
                fieldPassword.setText("Please Enter your credentials");
            } else {
                fieldUsername.setText("Wrong Username or Password");
            }

    }
    public void handleSignup(MouseEvent m) throws IOException{
        super.sceneSwitch("Sign up.fxml", 718, 476, m, "Sign up");
    }
}
