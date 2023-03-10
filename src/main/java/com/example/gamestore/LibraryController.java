package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.*;
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
    private Label labelName, labelWallet;
    @FXML
    private ImageView img1;
    @FXML
    private ImageView img10;
    @FXML
    private ImageView img2;
    @FXML
    private ImageView img3;
    @FXML
    private ImageView img4;
    @FXML
    private ImageView img5;
    @FXML
    private ImageView img6;
    @FXML
    private ImageView img7;
    @FXML
    private ImageView img8;
    @FXML
    private ImageView img9;
    @FXML
    private VBox vbox1;
    @FXML
    private VBox vbox10;
    @FXML
    private VBox vbox2;
    @FXML
    private VBox vbox3;
    @FXML
    private VBox vbox4;
    @FXML
    private VBox vbox5;
    @FXML
    private VBox vbox6;
    @FXML
    private VBox vbox7;
    @FXML
    private VBox vbox8;
    @FXML
    private VBox vbox9;

    ArrayList<Integer> tempGames = new ArrayList<Integer>();
    //    @Override
    ArrayList<String> libData = new ArrayList<String>();
    ArrayList<String> libTemp = new ArrayList<String>();
    ArrayList<String> exePaths = new ArrayList<>();
    User currentUser;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        labelName.setText(SignInController.currentUser);
        labelWallet.setText("$" + Game.df.format(SignInController.userWallet));
        try {
            currentUser = fileTemp();
            for(int i=0;i <currentUser.gamesList.size();i++){
                System.out.println("Game bought "+currentUser.gamesList.get(i));
            }
            LibUrls lib = new LibUrls();
            libTemp = lib.LibUrlsMethod(libData);
            exePaths = LibUrls.exePaths(exePaths);
            System.out.println(libTemp.get(0));
            ImageView[] imgs = new ImageView[10];
            imgs[0] = img1;
            imgs[1] = img2;
            imgs[2] = img3;
            imgs[3] = img4;
            imgs[4] = img5;
            imgs[5] = img6;
            imgs[6] = img7;
            imgs[7] = img8;
            imgs[8] = img9;
            imgs[9]= img10;

            VBox[] vboxArray = new VBox[10];
            vboxArray[0]=vbox1;
            vboxArray[1]=vbox2;
            vboxArray[2]=vbox3;
            vboxArray[3]=vbox4;
            vboxArray[4]=vbox5;
            vboxArray[5]=vbox6;
            vboxArray[6]=vbox7;
            vboxArray[7]=vbox8;
            vboxArray[8]=vbox9;
            vboxArray[9]=vbox10;

        int visibilityCounter = 0;

            for (int i = 0; i < currentUser.gamesList.size(); i++) {
                String libImage = libTemp.get(currentUser.gamesList.get(i));
                String gamePath = exePaths.get(currentUser.gamesList.get(i));
                System.out.println(libImage);
                imgs[i].setImage(new Image(libImage));
                imgs[i].setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        try {
                            Runtime.getRuntime().exec(gamePath);
                        }catch (Exception exception){
                            exception.printStackTrace();
                        }
                    }
                });
                visibilityCounter++;
            }
            for(int i =visibilityCounter ;i<vboxArray.length ;i++){
                imgs[i].setVisible(false);
                vboxArray[i].setVisible(false);
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }

    User fileTemp() throws IOException,ClassNotFoundException {
        String user =SignInController.currentUser;
        User temp;
        File f = new File("src\\main\\resources\\"+user+".txt");
        System.out.println(f.exists());
        FileInputStream filein = new FileInputStream("src\\main\\resources\\"+user+".txt");
        ObjectInputStream in = new ObjectInputStream(filein);

        temp =(User)in.readObject();

        filein.close();
        in.close();
        return temp;
    }

    public void handleStore(MouseEvent m) throws IOException {
        super.sceneSwitch("STORE.fxml", 1280, 720, m, "Store");
    }
    public void handleCart(MouseEvent m) throws IOException{
        super.sceneSwitch("Cart.fxml", 1280, 720, m, "Cart");
    }

    public void handleLogout(ActionEvent e) throws Exception {
        super.sceneSwitch("Sign in.fxml", 718, 476, e, "Sign in");
    }

}
