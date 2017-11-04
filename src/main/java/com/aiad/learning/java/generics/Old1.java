package com.aiad.learning.java.generics;

public class Old1 {
    public static void main(String[] args) {
        OldBeanNormal old = new OldBeanNormal();
        old.setObj("str");
        String val = (String) old.getObj();
        System.out.println("val is " + val);
    }
}
