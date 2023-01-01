package com.example.gamestore;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class admin {
    @FXML
    private Button btnLogout;


    @FXML
    private ImageView dynImage;

    @FXML
    private Label dynprice;

    @FXML
    private TextField imagepath;

    @FXML
    private TextField name;

    @FXML
    private Label namedyn;

    @FXML
    private TextField price;



    void fileObj() throws IOException {
        Game g = new Game(name.getText(), imagepath.getText(), price.getText());
        FileOutputStream file = new FileOutputStream("src\\main\\resources\\" + name.getText() + ".txt", true);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(g);
        file.close();
        out.close();
        try {
            readObj();
        }
        catch (Exception e){
            System.out.println("banana");
        }

    }

    void readObj() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("src\\main\\resources\\"+name.getText()+".txt");
        ObjectInputStream out = new ObjectInputStream(file);

        Game o;
        o = (Game) out.readObject();
        dynImage = new ImageView(o.src.image1);
        dynprice.setText(o.adminPrice);
        namedyn.setText(o.name);
        file.close();
        out.close();
        file.close();
        out.close();

    }

   // @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
// try{
//        FileInputStream file = new FileInputStream("src\\main\\resources\\"+name.getText()+".txt");
//        ObjectInputStream out = new ObjectInputStream(file);
//
//        Game o;
//        o = (Game)out.readObject();
//        dynImage =new ImageView(o.src.image1);
//        dynprice.setText(o.price2);
//        namedyn.setText(o.name);
//        file.close();
//        out.close();
//
//    }
// catch (Exception e){
//     System.out.println("banana");
// }
//}}
}
