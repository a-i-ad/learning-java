package com.aiad.learning.java.generics;

public class Square {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getPerimeter() {
        return this.sideLength * 4;
    }
}
