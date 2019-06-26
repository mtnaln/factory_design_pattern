package com.metin.game.tetris;

public class Z implements Shape {

    @Override
    public void reverse() {
        System.out.println("Z is reversing...");
    }

    @Override
    public String toString() {
        return "Z";
    }
}
