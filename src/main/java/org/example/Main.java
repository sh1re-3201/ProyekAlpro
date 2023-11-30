/*
INGAT SETIAP KALI SELESAI MENGUBAH
JANGAN LUPA COMMIT AND PUSH
DAN
SETIAP KALI MULAI MEMBUKA SEBELUM MENGUBAH FETCH AND PULL TERLEBIH DAHULU
 */

package org.example;

public class Main {
    static short[] nomorRekaMedis = new short[50];

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    static void isiArray(){
        nomorRekaMedis[0] = 12334;
        nomorRekaMedis[1] = 12311;
        nomorRekaMedis[2] = 15334;
        nomorRekaMedis[3] = 12313;
        nomorRekaMedis[4] = 26713;

    }
    static boolean nomorPeserta(short nomorPasien) {// Untuk mengecek jika nomor yang dimasukkan oleh user(pasien lama) benar atau salah
        for (short nomor : nomorRekaMedis) {
            if (nomor == nomorPasien) {
                System.out.println("Selamat Datang Kembali!");
                return true; // Nomor pasien terdaftar
            }
        }
        return false; // Nomor pasien tidak terdaftar

    }
}