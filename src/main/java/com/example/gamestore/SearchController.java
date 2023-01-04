package com.example.gamestore;

import javafx.fxml.Initializable;
import javafx.scene.image.Image;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class SearchController extends HelloApplication implements Initializable {
    @FXML
    private Button btnLogout;

    @FXML
    private Label cartLabel;

    @FXML
    private Label currentUser;

    @FXML
    private TextArea dynamicTextArea;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img3;

    @FXML
    private ImageView img4;

    @FXML
    private Label labelName;

    @FXML
    private Label libraryLabel;

    @FXML
    private Label price;

    @FXML
    private Label storeLabel;

    @FXML


    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            Game search = new Game();
            System.out.println("test");
            search = Game.gameLoader(Game.searchGame);
            System.out.println(search.name);
            dynamicTextArea.setText(search.src.description);
            img1.setImage(new Image(search.src.descImage));
            price.setText("$" + (search.price));
            labelName.setText(search.name);
            img2.setImage(new Image(search.src.gamePlayImg1));
            img3.setImage(new Image(search.src.gamePlayImg2));
            img4.setImage(new Image(search.src.gamePlayImg3));
        }
        catch (Exception e){
            System.out.println("HUUUZZZKUUTTA");
        }

    }
    public void handleLogout(ActionEvent e) throws IOException {
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
}
