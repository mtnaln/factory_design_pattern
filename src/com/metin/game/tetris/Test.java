package com.metin.game.tetris;

public class Test {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();
        Shape i = factory.getShape("I");
        i.reverse();
        Shape l = factory.getShape("L");
        l.reverse();
        Shape plus = factory.getShape("+");
        plus.reverse();
        System.out.println("-----------------");
        Shape shapeEasy1 = factory.getShapeRandomly(Gamedifficulty.EASY);
        Shape shapeEasy2 = factory.getShapeRandomly(Gamedifficulty.EASY);
        System.out.println("EASY: " + shapeEasy1);
        System.out.println("EASY: " + shapeEasy2);
        System.out.println("-----------------");
        Shape shapeNormal1 = factory.getShapeRandomly(Gamedifficulty.NORMAL);
        Shape shapeNormal2 = factory.getShapeRandomly(Gamedifficulty.NORMAL);
        System.out.println("NORMAL: " + shapeNormal1);
        System.out.println("NORMAL: " + shapeNormal2);
        System.out.println("-----------------");
        Shape shapeHard1 = factory.getShapeRandomly(Gamedifficulty.HARD);
        Shape shapeHard2 = factory.getShapeRandomly(Gamedifficulty.HARD);
        System.out.println("HARD: " + shapeHard1);
        System.out.println("HARD: " + shapeHard2);
    }
}
