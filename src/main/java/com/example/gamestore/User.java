package com.example.gamestore;

import java.util.ArrayList;

public class User{
    public String name;
    public String password;
    public String email;

    public User(String name, String password, String email){
        this.name = name;
        this.password = password;
        this.email = email;
    }

    static ArrayList<User> users = new ArrayList<>();
}
