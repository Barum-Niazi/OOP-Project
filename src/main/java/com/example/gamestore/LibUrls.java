package com.example.gamestore;

import java.util.ArrayList;

public class LibUrls {

    ArrayList<String> LibUrlsMethod(ArrayList<String> temp) {

        temp.add("file:Gamepics\\GTAVC.jpg");
        temp.add("file:Gamepics\\Stronghold.jpg");
    return temp;
    }

    public static ArrayList<String> downloadUrlsMethod(ArrayList<String> downloadUrls) throws Exception{
        downloadUrls.add(Game.gameLoader(0).src.downloadUrl);
        downloadUrls.add(Game.gameLoader(1).src.downloadUrl);

        return downloadUrls;
    }
}




