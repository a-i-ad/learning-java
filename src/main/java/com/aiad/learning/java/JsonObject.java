package com.aiad.learning.java;

import com.aiad.learning.java.JsonObject.HogeDto;

// [{foo:hako, bar:hashi},{foo:aki, bar:erik}]
public class JsonObject {
    public HogeDto[] hoges;

    public static class HogeDto {
        public String foo;
        public String bar;

    }
}

public class JsonObject {
    public List<HogeDto> hoges;
}