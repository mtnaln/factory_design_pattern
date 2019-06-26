package com.metin.game.tetris;

public class T implements Shape {

    @Override
    public void reverse() {
        System.out.println("T is reversing...");
    }

    @Override
    public String toString() {
        return "T";
    }
}
