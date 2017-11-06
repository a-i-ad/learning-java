package com.aiad.learning.java.generics;

public class SideUtil {
    /**
     * 図形の周の長さを戻す。とりあえず正方形と正三角形のみ対応。
     * @param shape
     * @return
     */
    public static int getPerimeter(Object shape) {
        if (shape instanceof Square) { // 正方形
            Square square = (Square) shape;
            return square.getPerimeter();
        } else if (shape instanceof EquilateralTriangle) { // 正三角形
            EquilateralTriangle t = (EquilateralTriangle) shape;
            return t.getPerimeter();
        } else {
            throw new RuntimeException();
        }
    }
}
