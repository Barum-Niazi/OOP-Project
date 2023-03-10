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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class StoreController extends HelloApplication implements Initializable{


    Stage stage;
    @FXML
    private TextField searchBar;
    @FXML
    private Button enter;
    @FXML
    public HBox library;
    @FXML
    public HBox cart;
    @FXML
    public Button btnLogout;
    @FXML
    public Label labelName, labelWallet;
    @FXML
    public VBox  vBox1 ,vBox2, vBox3, vBox4, vBox5, vBox6, vBox7, vBox8, vBox9, vBox10;
    @FXML
    public Label gameNotFound;
    @FXML
    private VBox lvbox1, lvbox2, lvbox3, lvbox4, lvbox5, lvbox6, lvbox7, lvbox8;
    @FXML
    public User current;

    public void handleLogout(ActionEvent e) throws IOException, InterruptedException{
        super.sceneSwitch("Sign in.fxml", 718, 476, e, "Sign in");
    }

    public void handleLibrary(MouseEvent m) throws IOException {
        try {
            sceneSwitch("Library.fxml", 1280, 720, m, "Library");
        } catch (Exception e){
            System.out.println("test");
        }
    }
    public void handleClick(MouseEvent e) throws Exception {
        VBox present = (VBox) e.getSource();
        if(present == vBox1)
            Game.counter=0;
        if(present == vBox2)
            Game.counter=1;
        if(present == vBox3)
            Game.counter=2;
        if(present == vBox4)
            Game.counter=3;
        if(present == vBox5)
            Game.counter=4;
        if(present == vBox6)
            Game.counter=5;
        if(present == vBox7)
            Game.counter=6;
        if(present == vBox8)
            Game.counter=7;

        super.sceneSwitch("DescriptionDynamic.fxml", 1280, 720, e, "Description");
    }
    public void handleLower(MouseEvent e) throws IOException{
        try {
            VBox present = (VBox) e.getSource();
            if (present == lvbox1)
                Game.counter = 6;
            if (present == lvbox2)
                Game.counter = 3;
            if (present == lvbox3)
                Game.counter = 7;
            if (present == lvbox4)
                Game.counter = 2;
            if (present == lvbox5)
                Game.counter = 0;
            if (present == lvbox6)
                Game.counter = 4;
            if (present == lvbox7)
                Game.counter = 5;
            if (present == lvbox8)
                Game.counter = 1;

            super.sceneSwitch("DescriptionDynamic.fxml", 1280, 720, e, "COPTER");
        }catch(Exception exception) {

        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
                try {
                    String user = SignInController.currentUser;
                    File f = new File("src\\main\\resources\\" + user + ".txt");
                    System.out.println(f.exists());
                    FileInputStream filein = new FileInputStream("src\\main\\resources\\" + user + ".txt");
                    ObjectInputStream in = new ObjectInputStream(filein);

                    current = (User) in.readObject();
//                    System.out.println(current.adminStatus);
                    filein.close();
                    in.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
                gameNotFound.setVisible(false);
        labelName.setText(SignInController.currentUser);
        labelWallet.setText("$" + Game.df.format(SignInController.userWallet));

    }

    public void handleClickEvent(ActionEvent e) throws Exception{
        Game.searchGame = searchBar.getText();
        if(Game.gameLoader(Game.searchGame,"banana")!=null) {
            sceneSwitch("SearchDynamic.fxml", 1280, 720, e, "SearchLibrary");
        }
        else{
            gameNotFound.setVisible(true);
            gameNotFound.setText("Game not found!");

        }
    }

}
