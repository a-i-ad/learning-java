package com.aiad.learning.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Old4 {
    public static void main(String[] args) {
        // 下手なコード書くの大変
        // 原型使った感じの

        // Integer または Long が入る前提
        List lst = new ArrayList();
        lst.add(Long.valueOf(1L));
        lst.add(Integer.valueOf(11));

        // Integer,Long の場合は出力してその他の場合は例外を投げる
        for (Object e : lst) {
            if (e instanceof Long) {
                System.out.println("long value " + e.toString());
            } else if (e instanceof Integer) {
                System.out.println("integer value " + e.toString());
            } else {
                throw new RuntimeException();
            }
        }
    }
}
