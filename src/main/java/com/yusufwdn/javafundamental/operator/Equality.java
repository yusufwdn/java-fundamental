package com.yusufwdn.javafundamental.operator;

public class Equality {
    public static void main(String[] args) {
        int valueX = 5;
        int valueY = 4;
        boolean result;

        System.out.println("Sama dengan:");
        result = valueX == valueY;
        System.out.println("Hasil 'valueX == valueY' adalah " + result);
        System.out.println();

        System.out.println("Tidak sama dengan:");
        result = valueX != valueY;
        System.out.println("Hasil 'valueX != valueY' adalah " + result);
        System.out.println();

        System.out.println("Lebih besar dari:");
        result = valueX > valueY;
        System.out.println("Hasil 'valueX > valueY' adalah " + result);
        System.out.println();

        System.out.println("Sama dengan atau lebih besar dari:");
        result = valueX >= valueY;
        System.out.println("Hasil 'valueX >= valueY' adalah " + result);
        System.out.println();

        System.out.println("Kurang dari:");
        result = valueX < valueY;
        System.out.println("Hasil 'valueX < valueY' adalah " + result);
        System.out.println();

        System.out.println("Sama dengan atau kurang dari:");
        result = valueX <= valueY;
        System.out.println("Hasil 'result <= valueY' adalah " + result);
        System.out.println();

    }
}
