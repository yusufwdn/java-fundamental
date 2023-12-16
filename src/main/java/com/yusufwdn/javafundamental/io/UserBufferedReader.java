package com.yusufwdn.javafundamental.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args) {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        int value = 0;
        int anotherValue = 0;

        System.out.println("Program penjumlahan sangat sederhana");
        try {
            System.out.print("Masukan angka pertama : ");
            value = Integer.parseInt(bufferedReader.readLine());

            System.out.print("Masukan angka kedua : ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}
