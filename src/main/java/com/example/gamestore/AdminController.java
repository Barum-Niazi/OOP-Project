package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class AdminController extends HelloApplication{
    @FXML
    public Label libraryLabel;
    public Label cartLabel;
    public Label storeLabel;
    public Button btnLogout;
    public Button addCartbtn;

    @FXML
    public TextArea dynamicTextArea;

    @FXML
    public ImageView img1;

    @FXML
    public ImageView img2;

    @FXML
    public ImageView img3;

    @FXML
    public ImageView img4;



    public void handleLogout(ActionEvent e) throws Exception {
        super.sceneSwitch("Sign in.fxml", 718, 476, e, "Sign in");
    }

    public void handleLibrary(MouseEvent m) throws IOException{
        super.sceneSwitch("Library.fxml", 1280, 720, m, "Library");
    }
    public void handleStore(MouseEvent m) throws IOException{
        super.sceneSwitch("STORE.fxml", 1280, 720, m, "Store");
    }
    public void handleCart(MouseEvent m) throws IOException{
        super.sceneSwitch("Cart.fxml", 1280, 720, m, "Cart");
    }
//    public void handleAddCart(ActionEvent e) throws IOException{
//        super.sceneSwitch("Cart.fxml", 1280, 720, e, "Cart");
//    }
}
