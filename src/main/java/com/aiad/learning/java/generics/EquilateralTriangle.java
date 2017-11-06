package com.aiad.learning.java.generics;

public class EquilateralTriangle {
    private int sideLength;

    public EquilateralTriangle(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getPerimeter() {
        return this.sideLength * 3;
    }

}
