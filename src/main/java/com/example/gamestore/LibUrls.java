package com.example.gamestore;

import java.util.ArrayList;

public class LibUrls {

    ArrayList<String> LibUrlsMethod(ArrayList<String> temp) throws Exception {

        temp.add(Game.gameLoader(0).src.descImage);
        temp.add(Game.gameLoader(1).src.descImage);
    return temp;
    }

    public static ArrayList<String> downloadUrlsMethod(ArrayList<String> downloadUrls) throws Exception{
        downloadUrls.add(Game.gameLoader(0).src.downloadUrl);
        downloadUrls.add(Game.gameLoader(1).src.downloadUrl);

        return downloadUrls;
    }

    public static ArrayList<String> exePaths(ArrayList<String> exePaths){
        exePaths.add("C:\\Program Files (x86)\\Labcenter Electronics\\Proteus 8 Professional\\BIN\\PDS.EXE");
        exePaths.add("cmd /c C:\\Users\\user\\Desktop\\pepsiman\\Pepsiman.exe");

        return exePaths;
    }
}




