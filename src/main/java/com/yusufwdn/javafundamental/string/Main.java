package com.yusufwdn.javafundamental.string;

public class Main {
    public static void main(String []args)
    {
        String helloWorld = "Hello world";
        System.out.println(helloWorld);

        // Membuat data char di dalam array menjadi satu kesatuan dalam bentuk String.
        char[] ronaldoChars = {'r', 'o', 'n', 'a', 'l', 'd', 'o'};
        String ronaldoString = new String(ronaldoChars);
        System.out.println(ronaldoString);

        // Mencari panjang dari sebuah data String
        String ronaldo = "Ronaldo";
        int stringLength = ronaldo.length();
        System.out.println("'Ronaldo' has " + stringLength + " letters.");

        // Mengambil karakter dari sebuah data String
        char getLetter = ronaldo.charAt(1);
        System.out.println("'Ronaldo' has an " + getLetter + " in the 1st letter.");

        /*
         * String memiliki method lebih banyak lagi, untuk dokumentasi lengkapnya bisa
         * dilihat ke web https://docs.oracle.com/javase/7/docs/api/java/lang/String.html.
         */
    }
}
