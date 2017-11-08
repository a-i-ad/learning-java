package com.aiad.learning.java.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Old6 {
    public static void main(String[] args) {
        // 参考までにJava1.4までよくあったやつ 原型使う

        // String しか入らない前提なリスト
        List lst = new ArrayList();
        lst.add("val1");
        lst.add("val2");

        // 拡張 for 文も無かったのだよ
        for (Iterator itr = lst.iterator(); itr.hasNext();) {
            String str = (String) itr.next(); // ここでClassCastException出ることがあったみたいな話
            System.out.println(str);
        }
    }
}
