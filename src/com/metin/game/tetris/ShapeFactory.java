package com.metin.game.tetris;

import java.util.Random;

public class ShapeFactory {

    private String[] onlyModeAShapes = {"I", "J", "L", "O", "S", "T", "Z"};
    private String[] onlyModeBShapes = {"Z2", "+", "U"};
    private String[] allModesShapes = {"I", "J", "L", "O", "S", "T", "Z", "Z2", "+", "U"};

    public Shape getShape(String shape){
        if ("I".equals(shape)){
            return new I();
        } else if ("J".equals(shape)){
            return new J();
        } else if ("L".equals(shape)){
            return new L();
        } else if ("O".equals(shape)){
            return new O();
        } else if ("S".equals(shape)){
            return new S();
        } else if ("T".equals(shape)){
            return new T();
        } else if ("Z".equals(shape)){
            return new Z();
        } else if ("Z2".equals(shape)){
            return new Z2();
        } else if ("+".equals(shape)){
            return new Plus();
        } else if ("U".equals(shape)){
            return new U();
        }
        return null;
    }

    public Shape getShapeRandomly(Gamedifficulty gamedifficulty){
        if (gamedifficulty == Gamedifficulty.EASY){
            int index = new Random().nextInt(onlyModeAShapes.length);
            return getShape(onlyModeAShapes[index]);
        } else if (gamedifficulty == Gamedifficulty.NORMAL){
            int index = new Random().nextInt(allModesShapes.length);
            return getShape(allModesShapes[index]);
        } else if (gamedifficulty == Gamedifficulty.HARD){
            int index = new Random().nextInt(onlyModeBShapes.length);
            return getShape(onlyModeBShapes[index]);
        }
        return null;
    }
}
