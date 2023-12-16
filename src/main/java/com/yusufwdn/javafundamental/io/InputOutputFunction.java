package com.yusufwdn.javafundamental.io;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        System.out.println("Program Penjumlahan Sangat Sederhana");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int valueX = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int valueY = scanner.nextInt();

        int result = valueX + valueY;
        System.out.println("Hasilnya adalah : " + result);
    }
}
