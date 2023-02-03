package com.example.andyjonathanmaiwenresibouton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * ResiAppli is a class designate to link the code to the scene builder
 * @date 31/01/2023
 * @author Andy / Jonathan / Maiwen
 */
public class ResiAppli extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("resnew.fxml"));
        /*I'm using these lines becacuse i've started my scene builder with an anchorpane, i did not find a way to make it work,
        so i "converted" my anchorpane into a scene in order to make it works        */
        AnchorPane anchorPane = loader.load();
        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
