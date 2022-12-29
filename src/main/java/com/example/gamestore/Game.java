package com.example.gamestore;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class Game {
    public SimpleStringProperty gName;
    public SimpleStringProperty gPrice;

    Game(String gName, String gPrice){
        this.gName = new SimpleStringProperty(gName);
        this.gPrice = new SimpleStringProperty(gPrice);
    }

    public void setGName(String gName) {
        this.gName = new SimpleStringProperty(gName);

        //this.gName.set(gName);
    }
    public StringProperty gNameProperty() {
        return this.gName;
    }
    public StringProperty gPriceProperty() {
        return this.gPrice;
    }

    public void setGPrice(String gPrice) {

        this.gPrice = new SimpleStringProperty(gPrice);
        //this.gPrice.set(gPrice);
    }

    public String getgPrice()
    {
        return gPrice.get();
    }

    public String getgName() {

        return gName.get();
    }

    static int counter;
    static ArrayList<Integer> counterList = new ArrayList<Integer>();
    URL src = new URL();
    int id;
    int price;
    Game[] games=new Game[2];
}
