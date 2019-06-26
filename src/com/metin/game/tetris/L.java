package com.metin.game.tetris;

public class L implements Shape {

    @Override
    public void reverse() {
        System.out.println("L is reversing...");
    }

    @Override
    public String toString() {
        return "L";
    }
}
