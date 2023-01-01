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
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DynamicDescription extends HelloApplication implements Initializable{
    @FXML
    public Label libraryLabel;
    public Label cartLabel;
    public Label storeLabel;
    public Button btnLogout;
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
    private Label currentUser;
    public static int temp;
    public int tempStr=Game.counter;
    public double gamePrice;

    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            Game currentGame = new Game();
            currentGame = Game.gameLoader(Game.counter);
            dynamicTextArea.setText(currentGame.src.description);
            img1.setImage(new Image(currentGame.src.image1));
            price.setText("$" + (currentGame.price));
            labelName.setText(currentGame.name);
            gamePrice = currentGame.price;
            img2.setImage(new Image(currentGame.src.gamePlayImg1));
            img3.setImage(new Image(currentGame.src.gamePlayImg2));
            img4.setImage(new Image(currentGame.src.gamePlayImg3));
        }catch (Exception e){
            e.printStackTrace();
        }
       //Action[Game.counter].Initialize(Action);
        tempStr = Game.counter;
        temp = tempStr;
    }
    public void addCurrentGame(ActionEvent e) throws Exception{

        ArrayList<String> downloadUrl = new ArrayList<>();
        downloadUrl = LibUrls.downloadUrlsMethod(downloadUrl);

        HelloApplication forDownload = new HelloApplication();
        forDownload.downloadGame(downloadUrl.get(Game.counter));
       //User usr = new User(SignInController.currentUser);
        User usr =fileDataFetchGames();
        String h = SignInController.currentUser;
        for(int i =0;i<usr.gamesList.size();i++){
            if(tempStr == usr.gamesList.get(i)){
                System.out.println("Game is added already");
                return;
            }
        }
        usr.gamesList.add(tempStr);
        FileOutputStream fileOut = new FileOutputStream("src\\main\\resources\\"+h+".txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(usr);
        fileOut.close();
        out.close();
    }
    User fileDataFetchGames() throws IOException,ClassNotFoundException {
        String user = SignInController.currentUser;
        User temp;
        File f = new File("src\\main\\resources\\"+user+".txt");
        System.out.println(f.exists());
        FileInputStream filein = new FileInputStream("src\\main\\resources\\"+user+".txt");
        ObjectInputStream in = new ObjectInputStream(filein);

        temp = (User) in.readObject();

        filein.close();
        in.close();
        return temp;
    }


//        while((rdcm = in.readObject()) instanceof END ==false){
//            ((User)rdcm).gamesList.add(temp);
//        }
//        filein.close();
//        in.close();
//
//    }

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


