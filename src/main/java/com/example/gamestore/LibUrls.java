package com.example.gamestore;

import java.util.ArrayList;

public class LibUrls {

    ArrayList<String> LibUrlsMethod(ArrayList<String> temp) throws Exception {

        temp.add(Game.gameLoader(0).src.libraryImg);
        temp.add(Game.gameLoader(1).src.libraryImg);
        temp.add(Game.gameLoader(2).src.libraryImg);
        temp.add(Game.gameLoader(3).src.libraryImg);
        temp.add(Game.gameLoader(4).src.libraryImg);
        temp.add(Game.gameLoader(5).src.libraryImg);
        temp.add(Game.gameLoader(6).src.libraryImg);
        temp.add(Game.gameLoader(7).src.libraryImg);
    return temp;
    }

    public static ArrayList<String> downloadUrlsMethod(ArrayList<String> downloadUrls) throws Exception{
        downloadUrls.add(Game.gameLoader(0).src.downloadUrl);
        downloadUrls.add(Game.gameLoader(1).src.downloadUrl);
        downloadUrls.add(Game.gameLoader(2).src.downloadUrl);
        downloadUrls.add(Game.gameLoader(3).src.downloadUrl);
        downloadUrls.add(Game.gameLoader(4).src.downloadUrl);
        downloadUrls.add(Game.gameLoader(5).src.downloadUrl);
        downloadUrls.add(Game.gameLoader(6).src.downloadUrl);
        downloadUrls.add(Game.gameLoader(7).src.downloadUrl);
        return downloadUrls;
    }

    public static ArrayList<String> exePaths(ArrayList<String> exePaths){
        exePaths.add("C:\\Users\\user\\Desktop\\Grand Theft Auto Vice City\\gta-vc.exe");
        exePaths.add("cmd /c C:\\Users\\user\\Desktop\\pepsiman\\Pepsiman.exe");
        exePaths.add("test");
        exePaths.add("test");
        exePaths.add("test");
        exePaths.add("test");
        exePaths.add("test");
        exePaths.add("C:\\Copter\\" + SignInController.currentUser+ "\\Prototype 2\\prototype2.exe");
        exePaths.add("test");
        exePaths.add("test");

        return exePaths;
    }
}




