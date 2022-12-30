package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class DynamicDescription extends HelloApplication implements Initializable {
    @FXML
    public Label libraryLabel;
    public Label cartLabel;
    public Label storeLabel;
    public Button btnLogout;
    public Button addCartbtn;

    public Label labelName;
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
    @FXML
    private Label price;

    @FXML
    private Button downloadbtn;
    @FXML
    private Label currentUser;
    public static int temp;
    public int tempStr;
    public void initialize(URL url, ResourceBundle resourceBundle) {

        System.out.println("test");
        //Game.counterList.add(8);
        Game[] Action=new Game[20];
       Action[Game.counter] = new Game();
       Action[Game.counter].Initialize(Action);
       //Action[Game.counter].Initialize(Action);
         tempStr =Game.counter;
        temp = tempStr;
//        Game g = new Game();

       //System.out.println("action 0" + Action[Game.counter].id);
        dynamicTextArea.setText(Action[Game.counter].src.description);
//        System.out.println(Action[Game.counter].src.image1);
    //Ima = new Image(Action[0].games[Game.counter].src.image1);
        img1.setImage(new Image(Action[Game.counter].src.image1));

        price.setText("$"+(Action[Game.counter].price));
        labelName.setText(Action[Game.counter].name);
       Game.counter = -1;


    }
    public void addCurrentGame(ActionEvent e) throws IOException, ClassNotFoundException {

       // FileOutputStream file = new FileOutputStream("src\\main\\resources\\"+SignInController.currentUser+".txt",true);
        //ObjectOutputStream out = new ObjectOutputStream(file);
        String h = SignInController.currentUser;
        FileInputStream filein = new FileInputStream("src\\main\\resources\\"+h+".txt");
        ObjectInputStream in = new ObjectInputStream(filein);
        Object rdcm = null;

        first:
        while((rdcm = in.readObject()) instanceof END ==false){
            ((User)rdcm).gamesList.add(temp);
        }
        filein.close();
        in.close();

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
    public void handleAddCart(ActionEvent e) throws IOException{
        super.sceneSwitch("Cart.fxml", 1280, 720, e, "Cart");
    }
}


