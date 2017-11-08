package com.aiad.learning.java.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class SomeUtil {
    // lst をStringで作る
    public static SomeDto generateStringSomeDto(String[] str) {
        SomeDto dto = new SomeDto();
        dto.object = new ChildDto();
        dto.lst = new ArrayList();
        dto.lst.addAll(Arrays.asList(str));
        return dto;
    }

    // lst をLongで作る
    public static SomeDto generateLongSomeDto2(Long[] longs) {
        SomeDto dto = new SomeDto();
        dto.object = new ChildDto2();
        dto.lst = new ArrayList();
        dto.lst.addAll(Arrays.asList(longs));
        return dto;
    }

}
