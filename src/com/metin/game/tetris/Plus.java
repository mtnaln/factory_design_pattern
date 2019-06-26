package com.metin.game.tetris;

public class Plus implements Shape {

    @Override
    public void reverse() {
        System.out.println("+ is reversing...");
    }

    @Override
    public String toString() {
        return "+";
    }
}
