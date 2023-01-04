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
    public void handleSignIn(ActionEvent e) throws IOException, ClassNotFoundException, InterruptedException {
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
//        filein.close();
//        in.close();
    }

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
//             //System.out.println();
//        }

    public void handleSignup(MouseEvent m) throws IOException{
        super.sceneSwitch("Sign up.fxml", 718, 476, m, "Sign up");
    }
}
