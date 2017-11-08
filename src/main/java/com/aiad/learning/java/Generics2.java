package com.aiad.learning.java;

import java.util.ArrayList;
import java.util.List;

public class Generics2 {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<String>();

        List<Object> objectList2;
        List<String> stringList = new ArrayList<>();

        objectList2.add("string");
        stringList.add("string");

        objectList2 = stringList;
        unsafeAdd(stringList);

        String[] strs = new String[5];
        unsafeAdd2(strs);

        System.out.println("start");
        Parent[] ps = new Parent[3];
        ps[0] = new Child1();
        ps[0] = new Child2(); // これは有り

        List<Parent> parentList = new ArrayList<>();
        parentList.add(new Child1());
        System.out.println("end");

        Parent[] parentsChild1 = new Child1[3];
        parentsChild1[0] = new Child2(); // これは無しで例外発生

        Object[] objectArray = new Long[1];
        objectArray[0] = "I dont fit in"; // Exception
    }

    private static void unsafeAdd2(Object[] hoge) {

    }

    private static void unsafeAdd(List<Object> ol) {

    }

    private static class Parent {
        private void doSomethind() {}
    }

    private static class Child1 extends Parent {
        private void doAnything() {}
    }

    private static class Child2 extends Parent {
        private void doAnything() {}
    }
}
