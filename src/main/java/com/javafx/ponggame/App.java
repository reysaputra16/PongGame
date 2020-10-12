package com.javafx.ponggame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

    private final PlayerStick leftPlayer = new PlayerStick(0, 325);
    private final PlayerStick rightPlayer = new PlayerStick(1260, 325);

    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();
        Scene scene = new Scene(root);
        root.getChildren().add(leftPlayer);
        root.getChildren().add(rightPlayer);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pong Game");
        primaryStage.show();
        primaryStage.setFullScreen(true);

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
