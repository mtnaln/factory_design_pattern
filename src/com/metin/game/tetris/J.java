package com.metin.game.tetris;

public class J implements Shape {

    @Override
    public void reverse() {
        System.out.println("J is reversing...");
    }

    @Override
    public String toString() {
        return "J";
    }
}
