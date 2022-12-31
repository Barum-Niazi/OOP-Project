package com.example.gamestore;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game implements Serializable {
    public static final long serialVersionUID = 6971099465370920165L;
    static int counter;
    ArrayList<Integer> gamesAdded = new ArrayList<Integer>();
    URL src = new URL();
    int id;
    String name;
    double price;
String price2;
    Game(String name, String description, String image1, double price){
        this.name = name;
        this.src.description = description;
        this.src.image1 = image1;
        this.price = price;
    }
    Game(String name,String image1, String price2){
        this.name = name;
        this.src.image1 = image1;
        this.price2 = price2;
    }
    Game(){
    }
    public void setGamePlayImages(String img1, String img2, String img3){
        this.src.gamePlayImg1 = img1;
        this.src.gamePlayImg2 = img2;
        this.src.gamePlayImg3 = img3;
    }
   public static Game gameLoader(int counter) throws Exception{
        LoadData.loadData();
        Game gamesRead[] = new Game[10];
        try {
            FileInputStream fileInputStream = new FileInputStream(LoadData.fileName);
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
