package com.yusufwdn.javafundamental.operator;

public class Unary {
    public static void main(String[] args) {
        System.out.println("== Operator Unary Plus ==");
        int nilaiA = 5;
        int hasilA = +nilaiA; // memberikan nlaiA ke hasilA (bilangan positif)
        System.out.println("Hasil +5 = " + hasilA);
        System.out.println();

        System.out.println("== Operator Unary Minus ==");
        int nilaiB = 5;
        nilaiB = -nilaiB; // mengganti nilaiB menjadi nilai negative (minus)
        System.out.println("Hasil -5 = " + nilaiB);
        System.out.println();

        System.out.println("== Operator Increment ==");
        int nilaiC = 5;
        nilaiC++; // bernilai 6 (5 + 1)
        System.out.println("Hasil 5++ = " + nilaiC);
        System.out.println();

        System.out.println("== Operator Decrement ==");
        int nilaiD = 5;
        nilaiD--; // bernilai 4 (5-1)
        System.out.println("Hasil 5-- = " + nilaiD);
        System.out.println();

        System.out.println("== Operator Komplemen Logika ==");
        boolean status = false;
        System.out.println("Hasil !false = " + !status); // kebalikan dari vairabel status
        System.out.println();
    }
}
