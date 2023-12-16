package com.yusufwdn.javafundamental.perulangan;

public class While {
    public static void main(String[] args) {
        int value = 1;

        // Selama nilai dari variabel value kurang dari/sama dengan 10, maka tersulah lakukan looping
        while (value <= 15) {
            // Tampilkan angka dari variabel value
            System.out.print("Angka : " + value);

            // Value dijumlahkan agar nantinya memenuhi kondisi untuk memberhentikan looping.
            // Hal ini dilakukan untuk mencegah terjadinya infinity loops (perulangan tak berujung)
            value++;

            System.out.print("\n");
        }
    }
}
