package com.metin.game.tetris;

public class U implements Shape {

    @Override
    public void reverse() {
        System.out.println("U is reversing...");
    }

    @Override
    public String toString() {
        return "U";
    }
}
