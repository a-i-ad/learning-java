package com.aiad.learning.java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Generics {
    public void hoge() {
        Set<?> set = new HashSet<>();
        set.add("String"); // 型 Set<capture#1-of ?> のメソッド add(capture#1-of ?) は引数 (String) に適用できません
        set.add(null);

        Set rawSet = new HashSet();
        rawSet.add("String"); // 警告出るけどコンパイルエラーじゃないよ
    }

    public static void main(String[] args) {
        Set<Long> set = new HashSet<>();
        set.add(1L);
        something(set);
    }

    public static void doSomething(List<? extends String> lst) {
        for (String v : lst) {
            v.indexOf("hoge");
        }
    }

    public static void doSomething2(List<?> lst) {
        for (String v : lst) {
            v.indexOf("hoge");
        }
    }

    public static void something(Object o) {
        if (o instanceof Set) {
            Set<?> m = (Set<?>) o; // ワイルドカード型
            m.contains("Hoge");

            Set<String> m2 = (Set<String>) o; // これが通っちゃうのがねぇ
            String str = m2.iterator().next(); // ClassCastException 出るよ
        }
    }
}
