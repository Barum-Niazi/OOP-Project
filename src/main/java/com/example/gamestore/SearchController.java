package com.example.gamestore;

import javafx.fxml.Initializable;
import javafx.scene.image.Image;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
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

    public Label labelWallet;
    public static int temp;
    public int tempStr;
    public double gamePrice;
    public Label labelExist;
    double gPrice;
    Game search = new Game();
    public void initialize(URL url, ResourceBundle resourceBundle) {

        String user = SignInController.currentUser;
        labelExist.setVisible(false);
        dynamicTextArea.setEditable(false);
        labelName.setText(user);
        labelWallet.setText("$" + Game.df.format(SignInController.userWallet));
        try {
            Game search = new Game();
            System.out.println("test");
            System.out.println(Game.searchGame);
            //System.out.println("initilialize"+tempStr);
            search = Game.gameLoader(Game.searchGame,"banana");
            tempStr= search.gCounter;
            System.out.println("initilialize"+tempStr);
            System.out.println(search.name);
            dynamicTextArea.setText(search.src.description);
            img1.setImage(new Image(search.src.descImage));
            price.setText("$" + (search.price));
            labelName.setText(search.name);
            img2.setImage(new Image(search.src.gamePlayImg1));
            img3.setImage(new Image(search.src.gamePlayImg2));
            img4.setImage(new Image(search.src.gamePlayImg3));
            gPrice = search.price;
            User usr = fileDataFetchGames();
            for (int i = 0; i < usr.gamesList.size(); i++) {
                if (Game.counter == usr.gamesList.get(i)) {
                    labelExist.setVisible(true);
                    return;
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void addCurrentGame(ActionEvent e) throws Exception{

        User usr = fileDataFetchGames();
        usr.wallet = SignInController.userWallet;
//        System.out.println(usr.wallet);
        System.out.println("Counter:"+tempStr);
        System.out.println(gPrice);
        if(usr.wallet < gPrice){
            labelExist.setVisible(true);
            labelExist.setText("You do not have enough funds!");
        } else {
            ArrayList<String> downloadUrl = new ArrayList<>();
            downloadUrl = LibUrls.downloadUrlsMethod(downloadUrl);
            if(!labelExist.isVisible()) {
                HelloApplication forDownload = new HelloApplication();
                forDownload.downloadGame(downloadUrl.get(Game.counter));
                labelExist.setVisible(true);
                labelExist.setText("Game is downloading!");
            }
            File f = new File("C:\\Copter\\" + SignInController.currentUser);
            if(!f.exists())
                f.mkdir();
            //User usr = new User(SignInController.currentUser);
            String h = SignInController.currentUser;
            for (int i = 0; i < usr.gamesList.size(); i++) {
                if (tempStr == usr.gamesList.get(i)) {
                    labelExist.setVisible(true);
                    return;
                }
            }
            usr.gamesList.add(tempStr); // tempStr is game.counter
            usr.wallet = usr.wallet - gPrice;
            System.out.println(usr.wallet);
            SignInController.userWallet = usr.wallet;
            FileOutputStream fileOut = new FileOutputStream("src\\main\\resources\\" + h + ".txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(usr);
            fileOut.close();
            out.close();
        }
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
        System.out.println(temp.wallet);
        return temp;
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
