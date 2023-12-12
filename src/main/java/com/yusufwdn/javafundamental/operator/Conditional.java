package com.yusufwdn.javafundamental.operator;

public class Conditional {
    public static void main(String[] args) {
        int valueX = 4;
        int valueY = 6;

        System.out.println("== Inisiasi Variabel ==");
        System.out.println("valueX = " + valueX);
        System.out.println("valueY = " + valueY);
        System.out.println();

        System.out.println("== Kondisi AND ==");
        boolean hasilX = (valueX == 4 && valueY == 5);
        boolean hasilY = (valueX != 2 && valueY == 6);
        System.out.println("valueX == 4 && valueY == 5 adalah " + hasilX);
        System.out.println("valueX != 2 && valueY == 6 adalah " + hasilY);
        System.out.println();

        System.out.println("== Kondisi OR ==");
        hasilX = (valueX == 4 || valueY == 5);
        hasilY = (valueX != 4 || valueY == 2);
        System.out.println("valueX == 4 || valueY == 5 adalah " + hasilX);
        System.out.println("valueX != 4 || valueY == 2 adalah " + hasilY);
        System.out.println();
    }
}
