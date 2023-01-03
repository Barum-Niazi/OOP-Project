package com.example.gamestore;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LoadData implements Serializable {

    static final String fileName = "Games";

    public static void loadData() throws Exception{
        Game[] gamesData = new Game[10];
        Game game1 = new Game("Grand Theft Auto: Vice City",
                "Grand Theft Auto: Vice City is an action-adventure game played from a third-person perspective.\n" +
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

        Game game2 = new Game("Stronghold Crusader",
                "Stronghold: Crusader is the successor to Firefly Studios's 2001 real-time strategy video game Stronghold.\n" +
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
                "file:Gamepics\\Stronghold.jpg",
                10.99, "http://39.62.7.8/Crusader.zip");

        game2.setGamePlayImages("file:Gamepics\\Strongholdg1.jpg",
                "file:Gamepics\\Strongholdg2.jpg",
                "file:Gamepics\\Strongholdg3.jpg","file:Gamepics\\Stronghold.jpg" );

        Game game3 = new Game("Resident Evil 2", "A survival horror game, Resident Evil 2 features the same basic gameplay mechanics as its predecessor, \n" +
                "Resident Evil. The player explores a fictional city while solving puzzles and fighting monsters. \n" +
                "The game's two protagonists may be equipped with firearms, but limited ammunition adds a tactical \n" +
                "element to weapon use. On the status screen, the player can check the condition of the protagonist \n" +
                "use medicine to heal their wounds, and assign weapons. The characters' current health can also be \n" +
                "determined by their posture and movement speed.\n" +
                "\n" +
                "Resident Evil 2 are composed of real-time generated – and thus movable – polygonal character and \n" +
                "item models, superimposed over pre-rendered backgrounds that are viewed from fixed camera angles.\n" +
                "The game uses tank controls, meaning that pressing up moves the character forward, down reverses, \n" +
                "and left and right rotates, independently of the camera perspective.\n" +
                "\n" +
                "The main addition over the preceding game is the \"Zapping System\", by which each of the two \n" +
                "playable characters are confronted with different puzzles and storylines in their respective scenarios.\n" +
                "After finishing the \"A\" scenario with one protagonist, a \"B\" scenario, in which the events are depicted \n" +
                "from the other character's perspective, is unlocked.\n" +
                "\n" +
                "After each game, the player receives a ranking based on the total time taken to complete the scenario, \n" +
                "and on the number of saves and special healing items. Depending on the player's accomplishments,\n" +
                "bonus weapons and costumes may be unlocked as a reward.","file:Gamepics\\residentEvil.jpg",
                34.19, "lolnourl");

        game3.setGamePlayImages("file:Gamepics\\residentEvil1.jpg",
                "file:Gamepics\residentEvil2.jpg",
                "file:Gamepics\\residentEvil3.jpg","file:Gamepics\\Stronghold.jpg" );

        Game game4 = new Game("Dishonored", "Dishonored is an action-adventure game played from a first-person perspective with an emphasis \n" +
                "on stealth action and the use of gadgets and the environment to eliminate opposing forces.\n" +
                "The game world is a series of self-contained, mission-focused areas designed for multiple avenues \n" +
                "of exploration in terms of in-game movement and powers. Between missions, the player is taken \n" +
                "to a central hub called the Hound Pits pub where the player character Corvo can meet with his allies, \n" +
                "receive mission briefings and alternate objectives, and convert recovered loot into new equipment \n" +
                "and upgrades.\n" +
                "\n" +
                "Dishonored features role-playing game elements, such as the ability to upgrade powers and to make \n" +
                "moral choices with a focus on non-linear consequences. The game is designed to allow the player \n" +
                "to complete it without killing any non-player characters (NPC), including boss characters and mission \n" +
                "targets. The game has four difficulty levels which modify the effectiveness of health and mana (magic) \n" +
                "potions, and enemies' awareness, damage delivered, and responsiveness. In the easy setting, health \n" +
                "regeneration is possible.\n" +
                "\n" +
                "Stealth is based on limiting the player character's visibility; hiding behind objects and buildings, \n" +
                "avoiding the enemies and avoiding lighted areas aid. Guards can become aware of the player's \n" +
                "presence or can actively search for them.Enemy artificial intelligence (AI) will respond to sound \n" +
                "and can be distracted using sound to lure guards away from their positions. If the player remains \n" +
                "concealed from guards, their alertness will drop to \"aware\", but it will not return to normal.",
                "file:Gamepics\\dishonored.jpg", 22.65, "URL");

        game4.setGamePlayImages("file:Gamepics\\dishonored1.jpg",
                "file:Gamepics\\dishonored2.jpg",
                "file:Gamepics\\dishonored3.jpg","file:Gamepics\\Stronghold.jpg" );



       gamesData[0] = game1;
       gamesData[1] = game2;
       gamesData[2] = game3;
       gamesData[3] = game4;


       FileOutputStream fileOutputStream = new FileOutputStream(fileName);
       ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
       for(int i = 0; i < gamesData.length; i++) {
           objectOutputStream.writeObject(gamesData[i]);
       }
       objectOutputStream.close();
    }
}
