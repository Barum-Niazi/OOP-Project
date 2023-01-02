package com.example.gamestore;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LoadData implements Serializable {

    static final String fileName = "Games";

    public static void loadData() throws Exception{
        Game[] gamesData = new Game[10];
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
                "file:Gamepics\\GTAVC.jpg",
                15.59, "http://39.62.7.8/ViceCity.zip");
        game1.setGamePlayImages("file:Gamepics\\GTAVCg1.jpg",
                "file:Gamepics\\GTAVCg2.jpg",
                "file:Gamepics\\GTAVCg3.jpg", "file:Gamepics\\GTAVC.jpg");

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
                "file:Gamepics\\Stronghold.jpg"
                , 10.99, "http://39.62.7.8/Crusader.zip");
        game2.setGamePlayImages("file:Gamepics\\Strongholdg1.jpg",
                "file:Gamepics\\Strongholdg2.jpg",
                "file:Gamepics\\Strongholdg3.jpg","file:Gamepics\\Stronghold.jpg" );

        Game game3 = new Game("Resident Evil 2", "Resident Evil 2, also known as BIOHAZARD RE:2 (バイオハザード RE:2?) in Japan, is a Survival Horror\n" +
                "game developed by Capcom's R&D Division 1 studio. The game is a remake of 1998's Resident Evil 2,\n" +
                "\n" +
                "described by Capcom as a \"reimagining\" and first announced on 12 August 2015 by\n" +
                "Yoshiaki Hirabayashi and released wordwide on 25 January 2019 for the PlayStation, Xbox One and \n" +
                "Windows operating systems.[2]\n" +
                "\n", "file:Gamepics\\ResidentEvil.jpg");

       gamesData[0] = game1;
       gamesData[1] = game2;
       gamesData[2] = game3;
       FileOutputStream fileOutputStream = new FileOutputStream(fileName);
       ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
       for(int i = 0; i < gamesData.length; i++) {
           objectOutputStream.writeObject(gamesData[i]);
       }
       objectOutputStream.close();
    }
}
