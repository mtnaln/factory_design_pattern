package com.metin.game.tetris;

public class O implements Shape {

    @Override
    public void reverse() {
        System.out.println("O is reversing...");
    }

    @Override
    public String toString() {
        return "O";
    }
}
