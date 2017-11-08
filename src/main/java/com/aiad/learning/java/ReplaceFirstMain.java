package com.aiad.learning.java;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;

public class ReplaceFirstMain {
    public static void main(String[] args) {
        // データを作成
        List<String> uris = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            uris.add(RandomStringUtils.randomAlphanumeric(50) + "aiad_request=" + RandomStringUtils.randomAlphabetic(10));
        }

        long start = System.currentTimeMillis();
        for (String v : uris) {
            String result = v.replaceFirst(".*aiad_request=", "");
        }
        long elapsed = System.currentTimeMillis() - start;
        System.out.println(elapsed + " msec");

        final String key = "aiad_request=";
        start = System.currentTimeMillis();
        for (String v : uris) {
            String result = v.substring(v.lastIndexOf(key) + 13);
        }
        elapsed = System.currentTimeMillis() - start;
        System.out.println(elapsed + " msec");

    }
}
