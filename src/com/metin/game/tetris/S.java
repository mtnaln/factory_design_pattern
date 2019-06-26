package com.metin.game.tetris;

public class S implements Shape {

    @Override
    public void reverse() {
        System.out.println("S is reversing...");
    }

    @Override
    public String toString() {
        return "S";
    }
}
