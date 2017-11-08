package com.aiad.learning.java;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

@Spring
public class EnumMapApp {
    private enum Hoge {
        Huga
    }

    private Map<Hoge, String> map1 = new HashMap<>();

    private Map<Hoge, String> map2 = new EnumMap<>(Hoge.class);

}

@Test(expected=NullPointerException.class)
public void test_hoge(){}

public void test_NullPointerException_hoge(){}

public 