package com.aiad.learning.java.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>これは昔Java1.4まででよくあった原型を使ったコードの例。L17の変数宣言及び初期化部分をジェネリクス化
 * して型安全性を増してー</p>
 * @author aki
 *
 */
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
