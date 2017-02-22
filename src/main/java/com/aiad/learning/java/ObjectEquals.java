package com.aiad.learning.java;

public class ObjectEquals {

    public static final void main(String[] args) {
        String str1 = "Hako";
        String str2 = str1;
        boolean ret = str1.equals(str2);
        if (ret) {
            System.out.println("str1 と str2 は String 的に同じ"); // ここは来る
        }
        if (str1 == str2) {
            System.out.println("str1 と str2 は Object 的に同じ"); // ここは来る
        }
        String str3 = "Hako";
        if (str3.equals(str1)) {
            System.out.println("str1 と str3 は String 的に同じ"); // ここは来る
        }
        if (str3 == str1) {
            System.out.println("str1 と str3 は Object 的に同じ"); // ここは来る
        }
        String str4 = new String("Hako");
        if (str4.equals(str1)) {
            System.out.println("str1 と str4 は String 的に同じ"); // ここは来る
        }
        if (str4 == str1) {
            System.out.println("str1 と str4 は Object 的に同じ"); // ここは来ない
        }
    }

}
