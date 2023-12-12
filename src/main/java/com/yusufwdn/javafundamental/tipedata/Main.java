package com.yusufwdn.javafundamental.tipedata;

public class Main {
    public static void main(String []args)
    {
        // Tipe Data Primitif

        /*
         * Byte
         * Tipe data integer 8 bit digunakan untuk menampung angka dengan range yang kecil.
         * Nilai minimum dan maksimum dari tipe data ini adalah -128 hingga 127. Tipe data
         * ini memiliki nilai default 0.
         *
         */
        byte byteValue = 8;
        byte byteMinusValue = -10;
        System.out.println("Byte value 1 = " + byteValue);
        System.out.println("Byte value 2 = " + byteMinusValue);

        /*
         * Short
         * Tipe data integer 16 bit yang memiliki range antara -32,768 hingga 32,767. Sama
         * seperti tipe data byte, nilai defaultnya adalah 0.
         */
        short shortValue = 22000;
        short minusShortValue = -19200;
        System.out.println("Short value 1 = " + shortValue);
        System.out.println("Short value 2 = " + minusShortValue);

        /*
         * Int
         * Tipe data integer 32 bit dengan ranger antara -2,147,483,648 sampai 2,147,483,647.
         * Tipe data ini yang sering digunakan sebagai representasi dari angka (yang masih dalam cakupannya)
         */
        int intValue = 257000;
        int intMinusValue = -250000;
        System.out.println("Int value 1 = " + intValue);
        System.out.println("Int value 2 = " + intMinusValue);

        /*
         * Long
         * Lebih besar dari int, tipe data ini berukuran 64 bit. Memiliki range value antara
         * -9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807. Tipe data long memiliki nilai default 0L.
         */
        long longValue = 17000L;
        long minusLongValue = -13000L;
        System.out.println("Long value 1 = " + longValue);
        System.out.println("Long value 2 = " + minusLongValue);

        /*
         * Float
         * Sebuah tipe data yang sering kali digunakan untuk keperluan angka desimal.
         * Nilai default dari float adalah 0.0f
         */
        float floatValue = 3.5f;
        System.out.println("Float value = " + floatValue);

        /*
         * Double
         * Sama seperti float, namun memiliki kapasitas yang lebih besar dari float.
         * Tipe data ini memiliki nilai default 0.0d
         */
        double doubleValue = 5.0;
        System.out.println("Double value = " + doubleValue);

        /*
         * Boolean
         * Tipe data ini hanya memiliki dua nilai, yaitu true dan false (atau 1 dan 0).
         * Tipe data ini sering digunakan untuk pengecekan suatu kondisi.
         */
        boolean trueValue = true;
        boolean falseValue = false;
        System.out.println("Boolean true value = " + trueValue);
        System.out.println("Boolean false value = " + falseValue);

        /*
         * Char
         * Data ini biasanya digunakan untuk menampung karakter yang terbungkus dalam
         * dua tanda petik ('ini char')
         */
        char myBag = 'X';
        System.out.println("Char value = " + myBag);

        /*
         * Tipe Data Reference
         *
         * Merupakan sebuah tipe data yang merujuk ke sebuah objek atau instance dari sebuah
         * kelas. Salah satu tipe data yang termasuk ke dalam tipe data reference adalah String.
         * Karena tipe data String merujuk ke instance dari kelas `java.lang.String`.
         */
        User pengguna = new User(); // variabel pengguna berisi objek User
        System.out.println("User = " + pengguna);
    }
}
