package com.yusufwdn.javafundamental.array;

public class BasicArray {
    public static void main(String[] args) {
        // Inisiasi array dalam satu baris
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};

        // Inisiasi array per elemen
        int[] array2 = new int[6]; // membuat array dari integer sebanyak 6 elemen

        // Mengisi array per elemen
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;
        array2[4] = 5;
        array2[5] = 6;

        // Menampilkan tiap elemen dari array1
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        // Menampilkan tiap elemen dari array2
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i++]);
        }
    }
}
