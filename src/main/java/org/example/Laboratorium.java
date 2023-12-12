/*
TEMPAT NGETES CODE BELUM PASTI
 */

package org.example;
import java.util.Scanner;

public class Laboratorium {

    static int foundIndex = -1;

    public static void main(String[] args) {
        Scanner aria = new Scanner(System.in);
        short[] nomorRekaMedis = new short[50];

        int i = 0;
        nomorRekaMedis[0] = 12334;
        nomorRekaMedis[1] = 12311;
        nomorRekaMedis[2] = 15334;
        nomorRekaMedis[3] = 12313;
        nomorRekaMedis[4] = 26713;

        boolean nomorRekaTemu = false;

        while (i < 1) {
            System.out.print("Masukkan Nomor Reka Medis Anda: ");
            short rekaMed;

            // memulai operasi exceptions
            try{
                rekaMed = aria.nextShort();

                // Mengecek jika diawali dengan 0 atau tidak
                if (String.valueOf(rekaMed).startsWith("0")){
                    System.out.println("Nomor Reka Medis Tidak Boleh Dimulai Dengan 0");
                    continue;
                }
            }catch (Exception e){
                System.out.println("Format nomor reka medis tidak valid. Silahkan Coba Lagi");
                aria.nextLine();
                continue;
            }

            // Reset the nomorRekaTemu flag and index for each iteration
            nomorRekaTemu = false;
            foundIndex = -1;

            // Iterate through the array to check for a match
            for (int j = 0; j < nomorRekaMedis.length; j++) {
                if (rekaMed == nomorRekaMedis[j]) {
                    nomorRekaTemu = true;
                    foundIndex = j;
                    break; // Exit the loop once a match is nomorRekaTemu
                }
            }

            if (nomorRekaTemu) {
                System.out.println("SELAMAT DATANG");
            } else {
                System.out.println("Nomor Reka Medis tidak ditemukan.");
            }


            i++;
        }
    }


//    static boolean nomorPeserta(short nomorPasien) {// Untuk mengecek jika nomor yang dimasukkan oleh user(pasien lama) benar atau salah
//        for (short nomor : nomorRekaMedis) {
//            if (nomor == nomorPasien) {
//                System.out.println("Selamat Datang Kembali!");
//                return true; // Nomor pasien terdaftar
//            }
//        }
//        return false; // Nomor pasien tidak terdaftar
//
//    }
}