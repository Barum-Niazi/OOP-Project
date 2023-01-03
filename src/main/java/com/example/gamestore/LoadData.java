package com.example.gamestore;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LoadData implements Serializable {

    static final String fileName = "Games";
    static String serverAddress = "http://39.62.7.8/";

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
                15.59,serverAddress + "ViceCity.zip");

        game1.setGamePlayImages("file:Gamepics\\GTAVC1.jpg",
                "file:Gamepics\\GTAVC2.jpg",
                "file:Gamepics\\GTAVC3.jpg", "file:Gamepics\\GTAVC.jpg");

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
                10.99, serverAddress + "Crusader.zip");

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
                "bonus weapons and costumes may be unlocked as a reward.","file:Gamepics\\residentEvil.png",
                34.19, serverAddress +"ResidentEvil");

        System.out.println(game3.src.downloadUrl);
        game3.setGamePlayImages("file:Gamepics\\residentEvil1.png",
                "file:Gamepics\\residentEvil2.png",
                "file:Gamepics\\residentEvil3.png","file:Gamepics\\Stronghold.jpg" );

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
                "file:Gamepics\\dishonored.png", 22.65, serverAddress + "Dishonored");

        game4.setGamePlayImages("file:Gamepics\\dishonored1.png",
                "file:Gamepics\\dishonored2.png",
                "file:Gamepics\\dishonored3.png","file:Gamepics\\Stronghold.jpg" );

        Game game5 = new Game("Ac Rogue", "Assassin's Creed Rogue is an action-adventure, stealth game set in an open world environment and \n" +
                "played from a third-person perspective. The game features three main areas: the western North \n" +
                "Atlantic, the fictional River Valley, and New York City. The Morrigan, the ship that protagonist Shay \n" +
                "Cormac captains, has a shallower draft than Edward Kenway's Jackdaw, allowing for river travel, \n" +
                "and can be equipped with several new weapons, including Puckle guns, oil slicks which can be \n" +
                "ignited, and an icebreaker. Additionally, enemy ships can board the Morrigan, and certain icebergs \n" +
                "can be destroyed to create waves that damage smaller ships.\n" +
                "\n" +
                "For combat, the game introduces an air rifle, similar to the blowpipe from Black Flag, which allows \n" +
                "the player to silently take out enemies at a distance. Poison gas can now be used as an \n" +
                "environmental weapon, and Shay has a mask that can mitigate its effects. When being stalked by \n" +
                "an enemy, Shay's Eagle Vision changes to reflect this. \n" +
                "\n" +
                "The player can upgrade Shay's equipment through a crafting system, which requires animal pelts \n" +
                "gained from hunting or fishing. In-game collectibles, such as Templar treasures, Native pillars, and \n" +
                "Viking sword fragments, also provide Shay with new outfits and equipment upon finding them. \n" +
                "The Morrigan can also be upgraded. Side missions and activities return, with a number of them \n" +
                "based on those of the previous games. Another returning feature from earlier installments is the \n" +
                "ability to renovate buildings, which then generate income that is deposited in the bank and must \n" +
                "be collected regularly.",
                "file:Gamepics\\acRogue.png", 13.65, "URL");

        game5.setGamePlayImages("file:Gamepics\\acRogue1.png",
                "file:Gamepics\\acRogue2.png",
                "file:Gamepics\\acRogue3.png","file:Gamepics\\Stronghold.jpg" );

        Game game6 = new Game("Ac Rogue 3", "Assassin's Creed III is an action-adventure, stealth game set in an open world environment and played \n" +
                "from a third-person perspective. Assassin's Creed III features new weather simulations such as snow, \n" +
                "fog, and rain. The seasons can also change i.e., Summer and Winter, which not only affect visuals but \n" +
                "also gameplay, as the player will find that they run slower in deep snow. Snowfall can reduce visibility \n" +
                "for the player and enemies, aiding stealth. The game also features a wide variety of animals, both \n" +
                "domestic and wild. \n" +
                "\n" +
                "A revamped version of the recruitment system introduced in Assassin's Creed: Brotherhood returns as \n" +
                "players can enlist citizens to the Assassins' cause by completing optional \"Liberation\" missions. Unlike \n" +
                "previous games, the player is limited to only six Assassin recruits, but these recruits are each given \n" +
                "distinct personalities and backstories, and have a much larger skill set, allowing them to start riots, \n" +
                "provide a cover escort, and set up an ambush, among others.\n" +
                "\n" +
                "The Remastered version of the game features more revamped mechanics. Players can now whistle \n" +
                "from anywhere while hidden, whereas the original version only allowed whistling from corners. \n" +
                "Double assassinations have been improved so as not to require entering high-profile mode to do \n" +
                "so. Free-aiming with ranged weapons was also made possible, allowing Connor more control over \n" +
                "his bow and pistols. The mini-map and the UI were upgraded with better-looking and easier-to-\n" +
                "recognize icons for ease of accessibility, figuring out where enemies will point next.",
                "file:Gamepics\\acRoguep.png", 24.25, "URL");

        game6.setGamePlayImages("file:Gamepics\\acRoguep1.png",
                "file:Gamepics\\acRoguep2.png",
                "file:Gamepics\\acRoguep3.png","file:Gamepics\\Stronghold.jpg" );


        gamesData[0] = game1;
       gamesData[1] = game2;
       gamesData[2] = game3;
       gamesData[3] = game4;
       gamesData[4] = game5;
       gamesData[5] = game6;


       FileOutputStream fileOutputStream = new FileOutputStream(fileName);
       ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
       for(int i = 0; i < gamesData.length; i++) {
           objectOutputStream.writeObject(gamesData[i]);
       }
       objectOutputStream.close();
    }
}
