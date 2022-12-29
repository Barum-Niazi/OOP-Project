package com.example.gamestore;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class Game {
//    public SimpleStringProperty gName;
//    public SimpleStringProperty gPrice;
//
//    Game(String gName, String gPrice){
//        this.gName = new SimpleStringProperty(gName);
//        this.gPrice = new SimpleStringProperty(gPrice);
//    }
//
//    public void setGName(String gName) {
//        this.gName = new SimpleStringProperty(gName);
//
//        //this.gName.set(gName);
//    }
//    public StringProperty gNameProperty() {
//        return this.gName;
//    }
//    public StringProperty gPriceProperty() {
//        return this.gPrice;
//    }
//
//    public void setGPrice(String gPrice) {
//
//        this.gPrice = new SimpleStringProperty(gPrice);
//        //this.gPrice.set(gPrice);
//    }
//
//    public String getgPrice()
//    {
//        return gPrice.get();
//    }
//
//    public String getgName() {
//
//        return gName.get();
//    }

    static int counter;
     ArrayList<Integer> gamesAdded = new ArrayList<Integer>();
    URL src = new URL();
    int id;
    String name;
    int price;
   // Game[] games=new Game[2];
   public void Initialize(Game[] games){
       System.out.println("before description");
       games[0].src.description ="SNOW BROS. is an arcade game developed by TOAPLAN. In this fun and easy-to-play adventure popular for gaming among couples and with friends, two snowball-hurling snowman brothers power their way through against various enemies.";
       System.out.println("before img1");
       games[0].src.image1 = "C:\\Users\\asif.iqbal\\Desktop\\snowBros.png";
       System.out.println("before img2");
       games[0].src.gamePlayImg1 = "C:\\Users\\asif.iqbal\\Desktop\\gamePlay.jpg";
       System.out.println("before id");
       games[0].id = 1;
       System.out.println("before price");
       games[0].price = 39;

//        Game returnto = new Game();
//        returnto = games[0];

//        return returnto;

   }
}
