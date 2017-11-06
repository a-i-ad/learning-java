package com.aiad.learning.java.generics;

public class Old3 {
    public static void main(String[] args) {
        Square sq = new Square(1);
        int squarePerimeter = SideUtil.getPerimeter(sq);
        System.out.println("square perimeter is " + squarePerimeter);

        EquilateralTriangle tr = new EquilateralTriangle(2);
        int trianglePerimeter = SideUtil.getPerimeter(tr);
        System.out.println("equilateral triangle perimeter is " + trianglePerimeter);
    }
}
