package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.*;

public class AdminController extends HelloApplication{

    public static final long serialVersionUID = 6971099465370920165L;
    @FXML
    private TextField fieldCounter;

    @FXML
    private TextField fieldImage1;

    @FXML
    private TextField fieldImage2;

    @FXML
    private TextField fieldImage3;

    @FXML
    private TextField fieldDesc;

    @FXML
    private TextField fieldName;

    @FXML
    private TextField fieldPrice;

    public Label libraryLabel;
    public Label cartLabel;
    public Label storeLabel;
    public Button btnLogout;
    public Button addStorebtn;
    @FXML
    public TextArea dynamicTextArea;

    public TextField fieldDownload;

    public void addToFile() throws Exception{
        Game newGame = new Game(fieldName.getText(), dynamicTextArea.getText(), fieldDesc.getText(), Double.parseDouble(fieldPrice.getText()),
                            LoadData.serverAddress + fieldDownload.getText(), Integer.parseInt(fieldCounter.getText()));
        newGame.setGamePlayImages(fieldImage1.getText(), fieldImage2.getText(), fieldImage3.getText(), fieldDesc.getText());
        FileOutputStream fileOutputStream = new FileOutputStream(LoadData.fileName, true);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(newGame);
        objectOutputStream.close();
        fileOutputStream.close();
//
//        Game gamesRead[] = new Game[9];
//        FileInputStream fileInputStream = new FileInputStream(LoadData.fileName);
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        for(int i = 0; i < gamesRead.length ; i++){
//            Object game = (Game) objectInputStream.readObject();
//            gamesRead[i] = (Game) game;
//            System.out.println(gamesRead[i].name);
//        }
    }
    public void handleLogout(ActionEvent e) throws Exception {
        super.sceneSwitch("Sign in.fxml", 718, 476, e, "Sign in");
    }

    public void handleLibrary(MouseEvent m) throws IOException{
        super.sceneSwitch("Library.fxml", 1280, 720, m, "Library");
    }
    public void handleStore(MouseEvent m) throws IOException{
        super.sceneSwitch("STORE.fxml", 1280, 720, m, "Store");
    }
}
