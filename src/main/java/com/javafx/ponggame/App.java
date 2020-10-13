package com.javafx.ponggame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
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

        scene.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.UP && rightPlayer.getY() > 0) {
                rightPlayer.setY(rightPlayer.getY() - 5);
            } else if(e.getCode() == KeyCode.DOWN &&
                    rightPlayer.getY() < scene.getHeight() - rightPlayer.getHeight()) {
                rightPlayer.setY(rightPlayer.getY() + 5);
            }
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pong Game");
        primaryStage.show();
        primaryStage.setFullScreen(true);

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
