package com.sqq.design.test;

public class TestClass {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        System.out.println("-------->" + a % b);
        System.out.println("-------->" + Math.floorMod(a, b));
    }
}
