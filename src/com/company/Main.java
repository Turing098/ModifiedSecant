package com.company;

public class Main {

    public static void main(String[] args) {
        float x1 = 0, x2 = 1, E = 0.0001f;
        ModifiedSecant.secant(x1, x2, E);
    }
}
