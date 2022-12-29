package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LibraryController extends HelloApplication implements Initializable {
    @FXML
    public HBox store;
    public HBox cart;
    public Button btnLogout;

    @FXML
    private Label gameb1;

    @FXML
    private Label gameb2;



    public void handleStore(MouseEvent m) throws IOException {
        super.sceneSwitch("STORE.fxml", 1280, 720, m, "Store");
    }
    public void handleCart(MouseEvent m) throws IOException{
        super.sceneSwitch("Cart.fxml", 1280, 720, m, "Cart");
    }

    public void handleLogout(ActionEvent e) throws IOException {
        super.sceneSwitch("Sign in.fxml", 718, 476, e, "Sign in");
    }
ArrayList<Integer> tempGames = new ArrayList<Integer>();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        FileInputStream filein = null;
        String h = SignInController.currentUser;
        try {
            filein = new FileInputStream("src\\main\\resources\\"+h+".txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectInputStream in;
        try {
            in = new ObjectInputStream(filein);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Object rdcm = null;


            try {
                while (((rdcm = in.readObject()) instanceof END == false)){

                    tempGames=((User)rdcm).gamesList;
                }



            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            for(int i=0;i<tempGames.size();i++) {
                gameb1.setText(String.valueOf(tempGames.get(i)));

            }


    }
}
