package com.example.gamestore;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.Serializable;

public class HelloApplication extends Application {
    Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        String command = "powershell.exe \"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        Process powerShellProcess = Runtime.getRuntime().exec(command);
        powerShellProcess.getOutputStream().close();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sign in.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 718, 476);
        stage.setTitle("Sign in");
        stage.setScene(scene);
        stage.show();
    }

    public void sceneSwitch(String sceneName, int x, int y, ActionEvent e, String title) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sceneName));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), x, y);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    public void sceneSwitch(String sceneName, int x, int y, MouseEvent e, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(sceneName));
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load(), x, y);
        //stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    public void downloadGame(String downloadUrl) {

        getHostServices().showDocument(downloadUrl);
    }

    public static void main(String[] args) {
        launch();
    }
}