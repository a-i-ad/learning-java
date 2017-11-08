package com.aiad.learning.java;

public class EnumApp {
    private enum AIAD {
        Kura, Hakomori
    }

    private enum AIAD2 {
        Kura("倉"), Hakomori("箱守");

        private final String name;

        private AIAD2(String name) {
            this.name = name;
        }

        private String getName() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        System.out.println(AIAD.Kura);
        System.out.println(AIAD2.Kura);
        System.out.println(AIAD2.Kura.getName());

    }
}
