package com.example.gamestore;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    public String name;
    public String password;

    public boolean adminStatus = true;
    public ArrayList<Integer> gamesList = new ArrayList<Integer>();

    public static final long serialVersionUID = -617565425006163870L;
    public double wallet;

    public void setAdminStatus(boolean adminStatus) {
        this.adminStatus = adminStatus;
    }

    public User(String name, String password){
        this.name = name;
        this.password = password;
        this.setAdminStatus(true);
    }
    public User(String name){

        this.name =name;
    }

    public User(){
    }
    static ArrayList<User> users = new ArrayList<>();
}