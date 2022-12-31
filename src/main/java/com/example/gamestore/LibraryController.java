package com.example.gamestore;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

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
    private Label gameb2;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img3;


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
//    @Override
ArrayList<String> libData = new ArrayList<String>();
    ArrayList<String> libTemp = new ArrayList<String>();
    User TEMP;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        FileInputStream filein = null;
//        String h = SignInController.currentUser;
//        try {
//            filein = new FileInputStream("src\\main\\resources\\"+h+".txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        ObjectInputStream in;
//        try {
//            in = new ObjectInputStream(filein);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        Object rdcm = null;
//
//
//            try {
//                while (((rdcm = in.readObject()) instanceof END == false)){
//
//                    tempGames=((User)rdcm).gamesList;
//                }
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            } catch (ClassNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//            for(int i=0;i<tempGames.size();i++) {
//                gameb1.setText(String.valueOf(tempGames.get(i)));
//
//            }
//
//


        try {
            TEMP = fileTemp();
            LibUrls lib = new LibUrls();
            libTemp = lib.LibUrlsMethod(libData);
            System.out.println(libTemp.get(0));
            ImageView[] imgs = new ImageView[3];
            imgs[0] = img1;
            imgs[1] = img2;
            imgs[2] = img3;

            for (int i = 0; i < TEMP.gamesList.size(); i++) {
                System.out.println("banana");
                String u = libTemp.get(TEMP.gamesList.get(i));
                System.out.println("apple");
                System.out.println(u);
                imgs[i].setImage(new Image(u));
                continue;
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
}
