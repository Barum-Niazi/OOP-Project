package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class StoreController extends HelloApplication {
    @FXML
    public Label libraryLabel;
    @FXML
    public Label cartLabel;
    @FXML
    public Button btnLogout;
    public VBox vboxDesc;
    public void handleLogout(ActionEvent e) throws IOException{
        super.sceneSwitch("Sign in.fxml", 718, 476, e, "Sign in");
    }

    public void handleLibrary(MouseEvent m) throws IOException{
        super.sceneSwitch("Library.fxml", 1280, 720, m, "Library");
    }
    public void handleCart(MouseEvent e) throws IOException{
        sceneSwitch("Cart.fxml", 1280, 720, e, "Cart");
    }
    public void handleDescription(MouseEvent m) throws IOException{
        sceneSwitch("Description.fxml", 1280, 720, m, "Description");
    }

//    public void sceneSwitch(String sceneName, int x, int y, ActionEvent e) throws IOException{
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sceneName));
//        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
//        Scene scene = new Scene(fxmlLoader.load(), x, y);
//        stage.setTitle("Sign in");
//        stage.setScene(scene);
//        stage.show();
//    }

}
