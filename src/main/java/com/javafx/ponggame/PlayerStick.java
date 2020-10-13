package com.javafx.ponggame;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PlayerStick extends Rectangle {

    private int speed = 5;

    public PlayerStick(double x, double y) {
        super(20, 100, Color.BLACK);
        this.setX(x);
        this.setY(y);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
