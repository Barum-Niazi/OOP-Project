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
    static ArrayList<String> GameLibUrls = new ArrayList<String>();

    URL src = new URL();
    int id;
    String name;
    double price;
    Game[] games=new Game[99];

    static Game[] arr = new Game[10];
    Game(){
 //Game[] games=new Game[2];
//        this.games[0].src.description ="SNOW BROS. is an arcade game developed by TOAPLAN. In this fun and easy-to-play adventure popular for gaming among couples and with friends, two snowball-hurling snowman brothers power their way through against various enemies.";
//        this.games[0].src.image1 = "C:\\Users\\asif.iqbal\\Desktop\\snowBros.png";
//        this.games[0].src.gamePlayImg1 = "C:\\Users\\asif.iqbal\\Desktop\\gamePlay.jpg";
//        this.games[0].id = 0;
//        this.games[0].price = 39;
//
//        this.games[1].src.description = "Experience GTA Online, a dynamic and ever-evolving online universe for up to 30 players, where you can rise from street-level hustler to become a kingpin of your own criminal empire.\n" +
//                "\n" +
//                "Enjoy new high-performance vehicle upgrades and improvements like the Career Builder as well as all GTA Online gameplay upgrades, expansions, and content released since launch, ready to enjoy solo or with friends. Pull off daring co-operative Heists, enter adrenaline-fueled Stunt Races, compete in unique Adversary Modes, or hang out in social spaces including nightclubs, arcades, penthouse parties, car meetups, and much more.";
//        games[1].src.image1 = "src\\main\\resources\\com\\example\\gamestore\\curve\\game1.jpg";
//        games[1].price = 60.99;
    }
   public void Initialize(Game[] games){
//        games[0] = newGame;
//       System.out.println("lol");
//       games[0].src.description ="SNOW BROS. is an arcade game developed by TOAPLAN. In this fun and easy-to-play adventure popular for gaming among couples and with friends, two snowball-hurling snowman brothers power their way through against various enemies.";
//       System.out.println("before img1");
//       games[0].src.image1 = "C:\\Users\\asif.iqbal\\Desktop\\snowBros.png";
//       System.out.println("before img2");
//       games[0].src.gamePlayImg1 = "C:\\Users\\asif.iqbal\\Desktop\\gamePlay.jpg";
//       System.out.println("before id");
//       games[0].id = 1;
//       System.out.println("before price");
//       games[0].price = 39;

       games[1].src.description = "Experience GTA Online, a dynamic and ever-evolving online universe for up to 30 players, where you can rise from street-level hustler to become a kingpin of your own criminal empire.\n" +
               "Enjoy new high-performance vehicle upgrades and improvements like the Career Builder as well as all GTA Online gameplay upgrades, expansions, and content released since launch, ready to enjoy solo or with friends. Pull off daring co-operative Heists, enter adrenaline-fueled Stunt Races, compete in unique Adversary Modes, or hang out in social spaces including nightclubs, arcades, penthouse parties, car meetups, and much more.";
       games[1].src.image1 = "C:\\Users\\user\\Desktop\\ij\\gamestore\\src\\main\\resources\\com\\example\\gamestore\\curve\\game1.jpg";
       games[1].price = 60.99;
       games[1].name ="Grand Theft Auto 5";
//        Game returnto = new Game();
//        returnto = games[0];

//        return returnto;

   }
}
