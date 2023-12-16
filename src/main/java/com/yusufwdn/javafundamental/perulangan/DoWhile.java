package com.yusufwdn.javafundamental.perulangan;

public class DoWhile {
    public static void main(String[] args) {
        // Inisiasi variabel value
        int value = 1;

        // Terjemahan
        // Jalankan script ini selama value kurang dari/sama dengan 10
        do {
            // Tampilkan angka yang dilooping
            System.out.println("Angka : " + value);

            // Value dijumlahkan agar nantinya memenuhi kondisi untuk memberhentikan looping.
            // Hal ini dilakukan untuk mencegah terjadinya infinity loops (perulangan tak berujung)
            value++;
        } while (value <= 10);
    }
}
