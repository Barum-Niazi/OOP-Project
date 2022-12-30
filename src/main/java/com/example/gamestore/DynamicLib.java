package com.example.gamestore;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class DynamicLib implements Initializable {
    @FXML
    private Label gmLabel;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            toFile();
        } catch (Exception e) {
            System.out.println(e);
        }
//        String userFile = SignInController.currentUser;
//        FileInputStream file;
//        try {
//            file = new FileInputStream("src\\main\\resources\\" + userFile + ".txt");
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            ObjectInputStream in = new ObjectInputStream(file);
//            //User u=in.readObject();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
        public void toFile() throws Exception{
            String userFile = SignInController.currentUser;
            FileInputStream file;

                file = new FileInputStream("src\\main\\resources\\"+userFile+".txt");
                ObjectInputStream in = new ObjectInputStream(file);
            User LA=(User)in.readObject();
            //gmLabel.setText(LA.gamesList(1));
                //User u=in.readObject()

        }


        //gmLabel.setText(());

    }
}
