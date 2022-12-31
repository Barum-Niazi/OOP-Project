package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

public class StoreController extends HelloApplication implements Initializable{


    Stage stage;
    @FXML
    public HBox library;
    @FXML
    public HBox cart;
    @FXML
    public Button btnLogout;
    @FXML
    public VBox vboxDesc;
    @FXML
    public Label labelName;
    @FXML
    public VBox game1;

    public void handleLogout(ActionEvent e) throws IOException{
        super.sceneSwitch("Sign in.fxml", 718, 476, e, "Sign in");
    }

    public void handleLibrary(MouseEvent m) throws IOException{
        sceneSwitch("Library.fxml", 1280, 720, m, "Library");
    }
    public void handleCart(MouseEvent e) throws IOException{
        super.sceneSwitch("Cart.fxml", 1280, 720, e, "Cart");
    }
    public void handleDescription(MouseEvent m) throws IOException{
        super.sceneSwitch("Description.fxml", 1280, 720, m, "Description");
    }
    public void ImageCLick(MouseEvent e) throws Exception {
        VBox present = (VBox) e.getSource();
        if(present == vboxDesc) {
            Game.counter=0;
            super.sceneSwitch("DescriptionDynamic.fxml", 1280, 720, e, "Description");

        }

    //VBox present = (VBox) e.getSource();
        if(present == game1) {
            Game.counter=1;
        super.sceneSwitch("DescriptionDynamic.fxml", 1280, 720, e, "Description");


        }
    }
            @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        for(int i = 0; i < User.users.size(); i++){
//            labelName.setText(User.users.get(i).name);
//            if(labelName.getText() != " "){
//                break;
//            }
        labelName.setText(SignInController.currentUser);

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
