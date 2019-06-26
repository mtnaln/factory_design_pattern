package com.metin.game.tetris;

public class I implements Shape {

    @Override
    public void reverse() {
        System.out.println("I is reversing...");
    }

    @Override
    public String toString() {
        return "I";
    }
}
