package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class CartController extends HelloApplication{

    @FXML
    public HBox library;
    public HBox store;

    public Button btnContinue;

    public void handleLibrary(MouseEvent m) throws IOException {
        super.sceneSwitch("Library.fxml", 1280, 720, m, "Library");
    }
    public void handleStore(MouseEvent m) throws IOException{
        super.sceneSwitch("STORE.fxml", 1280, 720, m, "Store");
    }
    public void handleContinue(ActionEvent e) throws IOException{
        super.sceneSwitch("STORE.fxml", 1280, 720, e, "Store");
    }
}
