package com.yusufwdn.javafundamental.percabangan;

public class IfCondition {
    public static void main(String[] args) {
        // Inisiasi nilaiUjian
        int nilaiUjian = 80;
        char indeksPrestasi;

        // Pemeriksaan kondisi untuk mendapatkan indeksPrestasi berdasarkan nilai yang diraih
        if (nilaiUjian >= 90) {
            indeksPrestasi = 'A';
        } else if (nilaiUjian >= 80) {
            indeksPrestasi = 'B';
        } else if (nilaiUjian >= 70) {
            indeksPrestasi = 'C';
        } else if (nilaiUjian >= 60) {
            indeksPrestasi = 'D';
        } else if (nilaiUjian >= 50) {
            indeksPrestasi = 'E';
        } else {
            indeksPrestasi = 'F';
        }

        // Tampilkan indeksPrestasi
        System.out.println("Nilai ujian akhir Anda adalah " + indeksPrestasi);
    }
}
