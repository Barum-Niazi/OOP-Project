package com.example.gamestore;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.*;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Game implements Serializable {
    public static final long serialVersionUID = 6971099465370920165L;
    public static final DecimalFormat df = new DecimalFormat("0.00");
    static int counter;
    ArrayList<Integer> gamesAdded = new ArrayList<Integer>();
    URL src = new URL();
    int id;
    String name;
    double price;
String adminPrice;
    Game(String name, String description, String descImage, double price, String downloadUrl){
        this.name = name;
        this.src.description = description;
        this.src.descImage = descImage;
        this.price = price;
        this.src.downloadUrl = downloadUrl; // http://59.103.17.13/Crusader.zip

    }
    Game(String name, String image1, String price2){
        this.name = name;
        this.src.descImage = image1;
        this.adminPrice = price2;
    }
    Game(){
    }
    public void setGamePlayImages(String img1, String img2, String img3, String libImage){
        this.src.gamePlayImg1 = img1;
        this.src.gamePlayImg2 = img2;
        this.src.gamePlayImg3 = img3;
        this.src.libraryImg = libImage;
    }
   public static Game gameLoader(int counter) throws Exception{
        LoadData.loadData();
        Game gamesRead[] = new Game[10];
        try {
            FileInputStream fileInputStream = new FileInputStream(LoadData.fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            for(int i = 0; i <= counter; i++){
                Object game = (Game) objectInputStream.readObject();
                gamesRead[i] = (Game) game;
            }
            objectInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return gamesRead[counter];
   }
<<<<<<< Updated upstream
}
=======

    public static Game gameLoader(String gameName) throws Exception{
        LoadData.loadData();
        Game searchGameObj=null;
        Game gamesRead[] = new Game[10];
        int i;
        System.out.println("xxx");

            FileInputStream fileInputStream = new FileInputStream(LoadData.fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            first:
            for( i = 0; i < 10; i++){
                Object game = (Game) objectInputStream.readObject();
                gamesRead[i] = (Game) game;
                if(gameName.equalsIgnoreCase(gamesRead[i].name)){
                    searchGameObj = gamesRead[i];
                    System.out.println("Barum");
                    return searchGameObj;
                }
            }


            fileInputStream.close();
            objectInputStream.close();
        System.out.println("huz");

        return searchGameObj;
    }

    public static Game gameLoader(String gameName,String n) throws Exception{
        LoadData.loadData();
        Game searchGameObj=null;
        Game gamesRead[] = new Game[10];
        int i;
        System.out.println("xxx");
        boolean flag;

        FileInputStream fileInputStream = new FileInputStream(LoadData.fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//        first:
//        for( i = 0; i < 10; i++){
//
//            Object game = (Game) objectInputStream.readObject();
//            gamesRead[i] = (Game) game;
//            if(gameName.equalsIgnoreCase(gamesRead[i].name)){
//                searchGameObj = gamesRead[i];
//                System.out.println("Barum");
//                return searchGameObj;
//            }
//        }
        String currentName = gameName.toLowerCase();
        System.out.println(currentName);
        for( i = 0; i < 10; i++){
            Object game = (Game) objectInputStream.readObject();
            gamesRead[i] = (Game) game;
            System.out.println("___________________");
            System.out.println(gamesRead[i].name);
            System.out.println(gameName);

            for(int k = 0;k<= (gamesRead[i].name.length()-gameName.length());k++){
                if(gamesRead[i].name.toLowerCase().regionMatches(k,currentName,0,gameName.length())){
                    System.out.println("potato");
                    searchGameObj = gamesRead[i];
                    return searchGameObj;
                }

            //Object game = (Game) objectInputStream.readObject();
            //gamesRead[i] = (Game) game;
//            if(gameName.equalsIgnoreCase(gamesRead[i].name)){
//                searchGameObj = gamesRead[i];
//                System.out.println("Barum");
//                return searchGameObj;
            }
        }


        fileInputStream.close();
        objectInputStream.close();
        System.out.println("huz");

        return searchGameObj;
    }}



>>>>>>> Stashed changes
