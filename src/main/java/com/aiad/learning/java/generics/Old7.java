package com.aiad.learning.java.generics;

public class Old7 {
    public static void main(String[] args) {
        Long[] longs = new Long[] { 1L, 2L };
        SomeDto someDto = SomeUtil.generateLongSomeDto2(longs);

        String[] strs = new String[] { "val1", "val2" };
        SomeDto someDto2 = SomeUtil.generateStringSomeDto(strs);

    }
}
