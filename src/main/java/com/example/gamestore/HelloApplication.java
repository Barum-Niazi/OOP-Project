package com.example.gamestore;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sign in.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 718, 476);
        stage.setTitle("Sign in");
        stage.setScene(scene);
        stage.show();
    }
    public void sceneSwitch(String sceneName, int x, int y, ActionEvent e) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sceneName));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), x, y);
        stage.setTitle("Sign in");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}