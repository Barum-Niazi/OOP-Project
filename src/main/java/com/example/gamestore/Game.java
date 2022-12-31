package com.example.gamestore;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game implements Serializable {
    static int counter;
     ArrayList<Integer> gamesAdded = new ArrayList<Integer>();
    URL src = new URL();
    int id;
    String name;
    double price;

    static final String fileName = "Games";
    Game(String name, String description, String image1, double price){
        this.name = name;
        this.src.description = description;
        this.src.image1 = image1;
        this.price = price;
    }
//    Game[] games=new Game[99];

//    static Game[] arr = new Game[10];
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

   public static Game gameLoader(int counter) throws Exception{
//       Game[] gamesData = new Game[10];
       Game gamesRead[] = new Game[10];
       Game game1 = new Game("Grand Theft Auto: Vice City", "Grand Theft Auto: Vice City is an action-adventure game played from a third-person perspective.\n" +
               "\n" +
               "The player controls criminal Tommy Vercetti and completes missions\n" +
               "linear scenarios with set objectives—to progress through the story.\n" +
               " It is possible to have several missions available at a time, as some missions require the player to\n" +
               " wait for further instructions or events.\n" +
               "\n" +
               " Outside of missions, the player can freely roam the game's open world\n" +
               " and has the ability to complete optional side missions.\n" +
               "\n" +
               " Composed of two main islands and several smaller areas, the world is much larger in area than \n" +
               "earlier entries in the series. The islands are unlocked for the player as the story progresses.",
               "C:\\Users\\user\\Desktop\\ij\\gamestore\\src\\main\\resources\\com\\example\\gamestore\\Games\\GTAVC.jpg",
               15.59);
       Game game2 = new Game("Stronghold Crusader", "Stronghold: Crusader is the successor to Firefly Studios's 2001 real-time strategy video game Stronghold.\n" +
               "\n" +
               "Crusader has much in common with the original Stronghold, but differs from its predecessor in the fact \n" +
               "that the game is no longer set in England, instead being set in the Middle East during the Crusades. \n" +
               "\n" +
               "Another prominent addition not found in its predecessor is a skirmish mode in single-player, \n" +
               "allowing customized battles with AI opponents instead of the linear campaign. \n" +
               "\n" +
               "The game was also released as Stronghold Warchest.\n" +
               "This version was a compendium of Stronghold and an enhanced version of Stronghold: Crusader,\n" +
               "containing additional characters and an additional Crusader Trail.\n" +
               "\n" +
               "The gameplay is similar to the original Stronghold, the major difference being that the game is set in \n" +
               "the Middle East. As a consequence, farms can only be built on oasis grass, which leads to rivalry among\n" +
               "players for limited farmland and resources.\n" +
               "\n" +
               "The game adds new AI opponents and several new Arabian units purchasable from a mercenary post.",
                "C:\\Users\\user\\Desktop\\ij\\gamestore\\src\\main\\resources\\com\\example\\gamestore\\Games\\Stronghold.jpg"
               , 10.99);

//       gamesData[0] = game1;
//       gamesData[1] = game2;
//       FileOutputStream fileOutputStream = new FileOutputStream(fileName);
//       ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//       for(int i = 0; i < 2; i++) {
//           objectOutputStream.writeObject(gamesData[i]);
//       }
//       objectOutputStream.close();
       try {
            FileInputStream fileInputStream = new FileInputStream(Game.fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            for(int i = 0; i < 2; i++){
                Object game = (Game) objectInputStream.readObject();
                gamesRead[i] = (Game) game;
            }
            System.out.println(gamesRead[0].name);
            System.out.println(gamesRead[1].name);

            objectInputStream.close();
//           return gamesData[counter];
       }catch (Exception e){
             e.printStackTrace();
       }
       return gamesRead[counter];
   }
}
