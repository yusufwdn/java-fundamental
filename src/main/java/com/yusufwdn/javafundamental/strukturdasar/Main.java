package com.yusufwdn.javafundamental.strukturdasar;

// Pemanggilan kelas dari beberapa package yang berada di dalam com.yusufwdn.javafundamental.basic
import com.yusufwdn.javafundamental.strukturdasar.music.Guitar; // Mengakses kelas spesifik dari package music
import com.yusufwdn.javafundamental.strukturdasar.vehicle.*;    // Mengakses semua kelas pada package vehicle

// Mengakses library yang berada di folder "lib"
import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String args[])
    {
        // Menampilkan "Hello world"
        System.out.println("Hello world");
        
        // Memanggil kelas Guitar dari package music
        Guitar.sound();
        
        // Memanggil beberapa kelas dari package vehicle
        Mobil.totalTires();
        Motor.totalTires();
        Kereta.totalTires();
        
        // Mencoba mengakses method milik library dalam folder "lib"
        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tommorow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tommorow);
    }
}
