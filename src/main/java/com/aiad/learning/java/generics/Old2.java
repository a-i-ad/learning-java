package com.aiad.learning.java.generics;

import java.util.Arrays;

public class Old2 {
    public static void main(String[] args) {
        String[] strs = { "hoge1", "hoge2" };
        OldBeanArray old = new OldBeanArray();
        old.setArray(strs);
        String[] v = (String[]) old.getArray();
        System.out.println(Arrays.toString(v));
    }
}
