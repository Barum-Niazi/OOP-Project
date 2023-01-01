package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;

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
        FileInputStream filein = new FileInputStream("src\\main\\resources\\generalSignIn2.txt");
        ObjectInputStream in = new ObjectInputStream(filein);
        User user[] = new User[2];
        FileReader fileReader = new FileReader("src\\main\\resources\\generalSignIn2.txt");
        System.out.println("eeeee");
        user[0] = (User) in.readObject();
        System.out.println("banana");
        super.sceneSwitch("STORE.fxml", 1280, 720, e, "Store");
        user[1] = (User) in.readObject();
        System.out.println(user[0].name);
        System.out.println(user[1].name);
        filein.close();
        in.close();
//        while(fileReader.read() != -1){
//                rdcm = (User)in.readObject();
//                fieldUsername.setText("lol");
//            System.out.println(fieldUsername.getText().toString());
//            System.out.println(rdcm.name);
//                if ((fieldUsername.getText().toString().equals((rdcm).name)) && (fieldPassword.getText().toString().equals((rdcm).password))) {
//                    currentUser = fieldUsername.getText().toString();
//                    break;
//                } else if (fieldUsername.getText().isEmpty() || fieldPassword.getText().isEmpty()) {
//                    fieldUsername.setText("Please Enter your credentials");
//                } else {
//                    fieldUsername.setText("Wrong Username or Password");
//                }
//            //System.out.println("Name of criminal:"+((Criminal)rdcm).name);
//            //System.out.println("Age of criminal:"+((Criminal)rdcm).age);
//            //System.out.println();
//        }


    }
    public void handleSignup(MouseEvent m) throws IOException{
        super.sceneSwitch("Sign up.fxml", 718, 476, m, "Sign up");
    }
}
