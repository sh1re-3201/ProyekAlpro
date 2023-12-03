/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/*
INGAT UNTUK SELALU PUSH SEBELUM KELUAR
DAN
PULL SAAT PERTAMA KALI MASUK
 */

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Krisna Wiranata, Anugrah Frumensius, Alberth Dody.
 */
public class Project_UAS {
    static Scanner input = new Scanner(System.in);

    static int[] nomorRekaMedis = new int[50];// Array untuk nomor reka medis dengan panjang 50
    static String[] namaPasien = new String[50];// Array untuk nama pasien lama dengan panjang 50
    static String[] jenisKelaminPasien = new String[50];// Array untuk jenis kelamin dengan panjang 50
    static String[] tempatLahirPasien = new String[50];// Array untuk tempat lahir pasien dengan panjang 50
    static String[] alamatPasien = new String[50];
    static String[] agamaPasien = new String[50];
    static String[] pekerjaanPasien = new String[50];
    static String[] tanggalLahirPasien = new String[50];
    static String[] nomorTelponPasien = new String[50];

    static int pilIndexArray;// PENTING BUAT PEMILIHAN ARRAY SEMUA KENA MANTAB JOSSSSSSSS
    static int noRekPasRandom=0;
    static int menuKembali;

    static String noTelpPenanggungJawab;
    // BIODATA PASIEN AKAN DI GANTI MENJADI VARIABEL ARRAY!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    static String
              namaPenanggungJawab,
              alamatPenanggungJawab,
              hubungan,
              poli;

    public static void main(String[] args) {
        isiArray();
        System.out.println(" ");
        System.out.println("==--SELAMAT DATANG DI MENU PENDAFTARAN RSU ETERNA PAINGAN--==");
        System.out.println(nomorRekaMedis.length);
        System.out.println(namaPasien[4]);
        menuUtama();
    }
    // Method untuk membuat nomor reka medis baru seara random dibawah 32767
    static void nomorRekaMedisRandom() {
        int countIndex = 5;
        Random acak = new Random();

        for (int j = 1; j < 10; j++) {
            do {
                for (int i = 1; i < 5; i++) {
                    if (noRekPasRandom <= 10000|| noRekPasRandom > 0){
                        noRekPasRandom = acak.nextInt(32767);
                    }
                }
            }while (noRekPasRandom <= 10000|| noRekPasRandom > 0);
        }
        nomorRekaMedis[countIndex] += noRekPasRandom;
        System.out.println(noRekPasRandom);
        countIndex++;
    }

    // subprogram untuk menu utama
    static void menuUtama(){
        int menuUtama = 0;
        do {
            System.out.println(" ");
            System.out.println("MENU PENDAFTARAN RSU ETERNA PAINGAN");
            System.out.println("SILAHKAN MEMILIH MENU YANG TERSEDIA DENGAN MEMASUKAN ANGKA SESUAI DENGAN MENU YANG INGIN ANDA PILIH : ");
            System.out.println("1. MENDAFTAR PERTAMA KALI SEBAGAI PASIEN BARU");
            System.out.println("2. MENDAFTAR SEBAGAI PASIEN YANG SUDAH PERNAH MENDAFTAR SEBELUMNYA");
            System.out.println("3. INFO [SILAHKAN MASUK KE MENU INI JIKA ANDA BINGUNG DENGAN MENU YANG DISEDIAKAN]");
            System.out.println("4. KELUAR");
            System.out.print("PILIH : ");
            menuUtama = input.nextInt();

            switch (menuUtama){
                case 1 :
                    menu_1();
                    break;
                case 2 :
                    menu_2();
                    break;
                case 3 :
                    do{
                    System.out.println();
                    System.out.println("PENJELASAN");
                    System.out.println("MENU NOMOR 1 ADALAH MENU UNTUK PASIEN YANG PERTAMA KALI MENDAFTAR DI RSU ETERNA PAINGAN. JIKA ANDA BELUM PERNAH MENDAFTAR SEBELUMNYA MAKA PILIHLAH MENU NOMOR 1");
                    System.out.println("MENU NOMOR 2 ADALAH MENU UNTUK PASIEN YANG SUDAH PERNAH MENJADI PASIAN DI RSU ETERNA PAINGAN SEBELUMNYA.");
                    System.out.println("JADI ANDA TIDAK PERLU MENGISI IDENTITAS ATAU BIODATA PASIEN LAGI. CUKUP MEMASUKAN NOMOR REKA PASIEN SAJA");
                    System.out.println("MENU NOMOR 4 ADALAH UNTUK KELUAR DARI PROGRAM");
                    System.out.println("1. KEMBALI KE MENU UTAMA");
                    System.out.println("2. KELUAR ");
                    System.out.print("PILIH : ");
                    menuKembali = input.nextInt();
                      if (menuKembali == 1){
                          menuUtama();
                     }else if (menuKembali == 2){
                          System.out.println("______________________________");
                          System.out.println("TERIMA KASIH");
                          System.out.println("PROGRAM SELESAI");
                           System.exit(0);
                     }else {
                          System.out.println("MAAF INPUT YANG ANDA MASUKAN TIDAK VALID COBA MASUKAN KEMBALI INPUT YANG BENAR");
                    }
                     }while( menuKembali != 1 && menuKembali != 2 );
                    break;
                case  4 :
                    System.out.println("______________________________");
                    System.out.println("TERIMA KASIH");
                    System.out.println("PROGRAM SELESAI");
                    break;
                default :
                    System.out.println("MAAF INPUT YANG ANDA MASUKAN TIDAK VALID COBA MASUKAN KEMBALI INPUT YANG BENAR");
                    break;
            }
        }while(menuUtama != 4);

}
    // Subprogram untuk pilihan menu utama nomor 1 yaitu pendaftaran pasien baru
    static void menu_1(){
        System.out.println("ANDA MEMILIH MENDAFTAR SEBAGAI PASIEN BARU");
        System.out.println("SILAHKAN MASUKAN BIODATA PASIEN");
        identitas();
        biodataPenanggungJawab();
        menuPoli();
    }

   // subprogram untuk prosedur identitas atau biodata pasien
   static void identitas() {
       int currentIndex = 5; // Starting index

       System.out.print("Nama Pasien           : ");
       namaPasien[currentIndex] = input.nextLine();
       namaPasien[currentIndex] += input.nextLine();

       System.out.print("Tempat lahir          : ");
       tempatLahirPasien[currentIndex] = input.nextLine();
       System.out.print("Tanggal lahir         : ");
       tanggalLahirPasien[currentIndex] = input.nextLine();
       System.out.print("Alamat lengkap        : ");
       alamatPasien[currentIndex] = input.nextLine();
       System.out.print("Agama                 : ");
       agamaPasien[currentIndex] = input.nextLine();
       System.out.print("Pekerjaan             : ");
       pekerjaanPasien[currentIndex] = input.nextLine();



       // Prompt user for No. Telepon input and remove leading zeros
       boolean validInput = false;
       while (!validInput) {
           System.out.print("No. Telepon           : ");
           String nomorTelpInput = input.next();
           // Check if the input contains letters
           if (nomorTelpInput.matches(".*[a-zA-Z]+.*")) {
               System.out.println("Nomor Telepon tidak boleh mengandung huruf. Silakan coba lagi.");
           } else {
               nomorTelponPasien[currentIndex] = nomorTelpInput.replaceFirst("^0+", ""); // Remove leading zeros
               validInput = true;
           }
       }

       // Increment the index for the next iteration
       currentIndex++;
   }

    // subprogram untuk prosedur identitas/biodata penanggung jawab
    static void biodataPenanggungJawab(){
        System.out.println();
        System.out.println("SILAHKAN MASUKAN BIODATA PENANGGUNG JAWAB ");
        System.out.print("Nama Penanggung jawab : ");
        namaPenanggungJawab = input.nextLine();
        namaPenanggungJawab += input.nextLine();
        System.out.print("Hubungan              : ");
        hubungan = input.nextLine();
        System.out.print("Alamat                : ");
        alamatPenanggungJawab = input.nextLine();
        // mengecek jika ada huruf di nomor telepon
        boolean validInput = false;
        while (!validInput){
            System.out.print("No. Telp              : ");
            String nomorTelpPenanggungjawabInput = input.next();
            if (nomorTelpPenanggungjawabInput.matches(".*[a-zA-Z]+.*")){
                System.out.println("Nomor Telepon tidak boleh mengandung huruf. Silakan coba lagi.");
            } else {
                noTelpPenanggungJawab = nomorTelpPenanggungjawabInput.replaceFirst("^0+", "");
                validInput = true;
            }
        }
    }
    // subprogram untuk menu tujuan poli, pemilihan dokter, pemilihan jadwal, mengisi keluhan dan menu BPJS
    static void menuPoli(){
        int menu,
            pilihanBPJS;

        double nomorBPJS;

        int dokterAnak,
            dokterUmum,
            dokterSyaraf,
            dokterBedah;

        String jadwal,
               keluhan;

        do{
            System.out.println();
            System.out.println("SILAHKAN PILIH POLI YANG ANDA TUJU");
            System.out.println("1. POLI ANAK");
            System.out.println("2. POLI UMUM");
            System.out.println("3. POLI SYARAF");
            System.out.println("4. POLI BEDAH UMUM");
            System.out.print("PILIH : ");
            menu = input.nextInt(); // input untuk menu pilihan tujuan poli
            System.out.println();

             switch (menu){
                 // menu tujuan poli anak
                 case 1 :
                     System.out.println("SILAHKAN MASUKAN JADWAL KONSULTASI"); 
                     System.out.println("MASUKAN HARI DAN JAM DENGAN FORMAT : hari");
                     System.out.println("CONTOH : jumat/JUMAT/Jumat");
                     System.out.print("MASUKAN : ");
                     jadwal = input.next().toLowerCase();
                   
                     // switch menu untuk jadwal dokter
                switch (jadwal){
                    case "senin" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Alberth Dody,  Sp.A");
                        break;
                    case "selasa" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Alberth Dody, Sp.A");
                        break;
                    case "rabu" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Nurul Mahalini, Sp.A");
                        break;
                    case "kamis" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Nurul Mahalini, Sp.A");
                        break;
                    case "jumat" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Alberth Dody, Sp.A");
                        break;
                    case "sabtu" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Sarah Ozawa, Sp.A");
                        break;
                    case "minggu" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Sarah Ozawa, Sp.A");
                        break;
                }
                
                // menu keluhan penyakit pasien
                     System.out.println();
                     System.out.print("SILAHKAN ISI KELUHKAN PENYAKIT PASIEN : ");
                     keluhan = input.nextLine();
                     keluhan += input.nextLine();

                     do{
                         System.out.println();
                         System.out.println("APAKAH ANDA INGIN MENGGUNAKAN BPJS ? ");
                         System.out.println("JIKA (IYA) KETIK 1 DAN JIKA TIDAK KETIK 2");
                         System.out.print("PILIH : ");
                         pilihanBPJS = input.nextInt();

                         if (pilihanBPJS == 1 ){
                             System.out.print("MASUKAN NOMOR BPJS : ");
                             nomorBPJS = input.nextDouble();
                             
                             int menuBPJS;
                             do{
                                 System.out.println();
                                 System.out.println("TERIMA KASIH KAMI TELAH MENYIMPAN NOMOR BPJS ANDA");
                                 System.out.print("NOMOR REKA MEDIS ANDA ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY

                                 System.out.println(noRekPasRandom);

                                 System.out.println("PENDAFTARAN ANDA TELAH BERHASIL");
                                 System.out.println("PENDAFTARAN TELAH SELESAI");
                                 System.out.println("1. KEMBALI KE MENU UTAMA");
                                 System.out.println("2. KELUAR ");
                                 System.out.print("PILIH : ");
                                 menuBPJS = input.nextInt();
                                 if (menuBPJS == 1){
                                     menuUtama();
                                 }else if (menuBPJS == 2){
                                     System.out.println("______________________________");
                                     System.out.println("TERIMA KASIH");
                                     System.out.println("PROGRAM SELESAI");
                                     System.exit(0);
                                 }else {
                                     System.out.println("MAAF INPUT YANG ANDA MASUKAN TIDAK VALID COBA MASUKAN KEMBALI INPUT YANG BENAR");
                                 }
                             }while(menuBPJS != 1 && menuBPJS !=2  );

                         }else if (pilihanBPJS == 2) {
                             int menuBPJS;
                             do {
                                 System.out.println();
                                 System.out.println("TERIMA KASIH PENDAFTARAN ANDA TELAH BERHASIL");
                                 System.out.print("NOMOR REKA MEDIS ANDA ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY

                                                                  System.out.println(noRekPasRandom);


                                 System.out.println("PENDAFTARAN TELAH SELESAI");
                                 System.out.println("1. KEMBALI KE MENU UTAMA");
                                 System.out.println("2. KELUAR ");
                                 System.out.print("PILIH : ");
                                 menuBPJS = input.nextInt();
                                 if (menuBPJS == 1){
                                     menu_1();
                                 }else if (menuBPJS == 2){
                                     System.out.println("______________________________");
                                     System.out.println("TERIMA KASIH");
                                     System.out.println("PROGRAM SELESAI");
                                     System.exit(0);
                                 }else {
                                     System.out.println("MAAF INPUT YANG ANDA MASUKAN TIDAK VALID COBA MASUKAN KEMBALI INPUT YANG BENAR");
                                 }
                             }while(menuBPJS != 1 && menuBPJS != 2);
                         }
                     }while(pilihanBPJS < 1 || pilihanBPJS > 2);
                break; // break case poli anak
                
                // menu tujuan poli umum
                case 2 :
                     System.out.println("SILAHKAN MASUKAN JADWAL KONSULTASI");
                     System.out.println("MASUKAN HARI DAN JAM DENGAN FORMAT : hari ");
                     System.out.println("CONTOH : jumat/JUMAT/Jumat");
                     System.out.print("MASUKAN : ");
                     jadwal = input.next().toLowerCase();
                     
                     // switch case menu jadwal dokter
                      switch (jadwal){
                    case "senin" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH dr. Laurel Varhana");
                        break;
                    case "selasa" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH dr. Agus Sapiderman");
                        break;
                    case "rabu" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER dr. Gatot Subrojo");
                        break;
                    case "kamis" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH dr. Laurel Varhana");
                        break;
                    case "jumat" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER dr. Asep Anggoro");
                        break;
                    case "sabtu" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER dr. Asep Anggoro");
                        break;
                    case "minggu" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH dr. Agus Sapiderman");
                        break;
                }
                // menu keluhan
                     System.out.println();
                     System.out.print("SILAHKAN ISI KELUHKAN PENYAKIT PASIEN : ");
                     keluhan = input.nextLine();
                     keluhan += input.nextLine();

                     do{
                         System.out.println();
                         System.out.println("APAKAH ANDA INGIN MENGGUNAKAN BPJS ? ");
                         System.out.println("JIKA (IYA) KETIK 1 DAN JIKA TIDAK KETIK 2");
                         System.out.print("PILIH : ");
                         pilihanBPJS = input.nextInt();

                         if (pilihanBPJS == 1 ){
                             System.out.print("MASUKAN NOMOR BPJS : ");
                             nomorBPJS = input.nextDouble();
                              
                             int menuBPJS;
                             do{
                                 System.out.println();
                                 System.out.println("TERIMA KASIH KAMI TELAH MENYIMPAN NOMOR BPJS ANDA");
                                 System.out.print("NOMOR REKA MEDIS ANDA ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY

                                                                  System.out.println(noRekPasRandom);


                                 System.out.println("PENDAFTARAN ANDA TELAH BERHASIL");
                                 System.out.println("PENDAFTARAN TELAH SELESAI");
                                 System.out.println("1. KEMBALI KE MENU UTAMA");
                                 System.out.println("2. KELUAR ");
                                 System.out.print("PILIH : ");
                                 menuBPJS = input.nextInt();
                                 if (menuBPJS == 1){
                                     menuUtama();
                                 }else if (menuBPJS == 2){
                                     System.out.println("______________________________");
                                     System.out.println("TERIMA KASIH");
                                     System.out.println("PROGRAM SELESAI");
                                     System.exit(0);
                                 }else {
                                     System.out.println("MAAF INPUT YANG ANDA MASUKAN TIDAK VALID COBA MASUKAN KEMBALI INPUT YANG BENAR");
                                 }
                             }while(menuBPJS != 1 && menuBPJS != 2);

                         }else if (pilihanBPJS == 2) {
                             int menuBPJS;
                             do {
                                 System.out.println();
                                 System.out.println("TERIMA KASIH PENDAFTARAN ANDA TELAH BERHASIL");
                                 System.out.print("NOMOR REKA MEDIS ANDA ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY

                                                                  System.out.println(noRekPasRandom);


                                 System.out.println("PENDAFTARAN TELAH SELESAI");
                                 System.out.println("1. KEMBALI KE MENU UTAMA");
                                 System.out.println("2. KELUAR ");
                                 System.out.print("PILIH : ");
                                 menuBPJS = input.nextInt();
                                 if (menuBPJS == 1){
                                     menuUtama();
                                 }else if (menuBPJS == 2){
                                     System.out.println("______________________________");
                                     System.out.println("TERIMA KASIH");
                                     System.out.println("PROGRAM SELESAI");
                                     System.exit(0);
                                 }else {
                                     System.out.println("MAAF INPUT YANG ANDA MASUKAN TIDAK VALID COBA MASUKAN KEMBALI INPUT YANG BENAR");
                                 }
                             }while(menuBPJS != 1 && menuBPJS != 2 );
                         }
                     }while(pilihanBPJS < 1 || pilihanBPJS > 2);
                break; // break menu poli umum
                
                // menu tujuan poli syaraf
                case 3 :
                     System.out.println("SILAHKAN MASUKAN JADWAL KONSULTASI");
                     System.out.println("MASUKAN HARI DAN JAM DENGAN FORMAT : hari");
                     System.out.println("CONTOH : jumat/JUMAT/Jumat");
                     System.out.print("MASUKAN : ");
                     jadwal = input.next().toLowerCase();
                     
                     // menu jadwal dokter
                       switch (jadwal){
                    case "senin" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Freyanashifa Jayawardana, Sp.S");
                        break;
                    case "selasa" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Nigarius Alexandro, Sp.S");
                        break;
                    case "rabu" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Tukimin Yoga Yowesben, Sp.S");
                        break;
                    case "kamis" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Nigarius Alexandro, Sp.S");
                        break;
                    case "jumat" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Freyanashifa Jayawardana, Sp.S");
                        break;
                    case "sabtu" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Freyanashifa Jayawardana, Sp.S");
                        break;
                    case "minggu" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Tukimin Yoga Yowesben, Sp.S");
                        break;
                }
                
                // menu keluhan
                     System.out.println();
                     System.out.print("SILAHKAN ISI KELUHKAN PENYAKIT PASIEN : ");
                     keluhan = input.nextLine();
                     keluhan += input.nextLine();
                     
                     //menu pilihan BPJS
                     do{
                         System.out.println();
                         System.out.println("APAKAH ANDA INGIN MENGGUNAKAN BPJS ? ");
                         System.out.println("JIKA (IYA) KETIK 1 DAN JIKA TIDAK KETIK 2");
                         System.out.print("PILIH : ");
                         pilihanBPJS = input.nextInt();

                         if (pilihanBPJS == 1 ){
                             System.out.print("MASUKAN NOMOR BPJS : ");
                             nomorBPJS = input.nextDouble();
                              
                             int menuBPJS;
                             do{
                                 System.out.println();
                                 System.out.println("TERIMA KASIH KAMI TELAH MENYIMPAN NOMOR BPJS ANDA");
                                 System.out.print("NOMOR REKA MEDIS ANDA ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY

                                                                  System.out.println(noRekPasRandom);


                                 System.out.println("PENDAFTARAN ANDA TELAH BERHASIL");
                                 System.out.println("PENDAFTARAN TELAH SELESAI");
                                 System.out.println("1. KEMBALI KE MENU UTAMA");
                                 System.out.println("2. KELUAR ");
                                 System.out.print("PILIH : ");
                                 menuBPJS = input.nextInt();
                                 if (menuBPJS == 1){
                                     menuUtama();
                                 }else if (menuBPJS == 2){
                                     System.out.println("______________________________");
                                     System.out.println("TERIMA KASIH");
                                     System.out.println("PROGRAM SELESAI");
                                      System.exit(0);
                                 }else {
                                     System.out.println("MAAF INPUT YANG ANDA MASUKAN TIDAK VALID COBA MASUKAN KEMBALI INPUT YANG BENAR");
                                 }
                             }while(menuBPJS != 1 && menuBPJS != 2 );

                         }else if (pilihanBPJS == 2) {
                             int menuBPJS;
                             do {
                                 System.out.println();
                                 System.out.println("TERIMA KASIH PENDAFTARAN ANDA TELAH BERHASIL");
                                 System.out.print("NOMOR REKA MEDIS ANDA ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY

                                                                  System.out.println(noRekPasRandom);


                                 System.out.println("PENDAFTARAN TELAH SELESAI");
                                 System.out.println("1. KEMBALI KE MENU UTAMA");
                                 System.out.println("2. KELUAR ");
                                 System.out.print("PILIH : ");
                                 menuBPJS = input.nextInt();
                                 if (menuBPJS == 1){
                                     menu_1();
                                 }else if (menuBPJS == 2){
                                     System.out.println("______________________________");
                                     System.out.println("TERIMA KASIH");
                                     System.out.println("PROGRAM SELESAI");
                                     System.exit(0);
                                 }else {
                                     System.out.println("MAAF INPUT YANG ANDA MASUKAN TIDAK VALID COBA MASUKAN KEMBALI INPUT YANG BENAR");
                                 }
                             }while(menuBPJS != 1 && menuBPJS != 2);
                         }
                     }while(pilihanBPJS < 1 || pilihanBPJS > 2);
                break; // break poli syaraf
                
                // menu tujuan poli bedah
                case 4 :
                     System.out.println("SILAHKAN MASUKAN JADWAL KONSULTASI");
                     System.out.println("MASUKAN HARI DAN JAM DENGAN FORMAT : hari");
                     System.out.println("CONTOH : jumat/JUMAT/Jumat");
                     System.out.print("MASUKAN : ");
                     jadwal = input.next().toLowerCase();
                     
                     // menu jadwal dokter
                      switch (jadwal){
                    case "senin" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Azizi Shafa Asadel, Sp.B");
                        break;
                    case "selasa" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Azizi Shafa Asadel, Sp.B");
                        break;
                    case "rabu" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Azizi Shafa Asadel, Sp.B");
                        break;
                    case "kamis" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Reza Agra Oktovian, Sp.B");
                        break;
                    case "jumat" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Reva Fidela Adel, Sp.B");
                        break;
                    case "sabtu" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Reva Fidela Adel, Sp.B");
                        break;
                    case "minggu" :
                        System.out.println(" ");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Basuki Narendra, Sp.B");
                        break;
                }
                      
                // menu keluhan
                     System.out.println();
                     System.out.print("SILAHKAN ISI KELUHKAN PENYAKIT PASIEN : ");
                     keluhan = input.nextLine();
                     keluhan += input.nextLine();

                     do{
                         System.out.println();
                         System.out.println("APAKAH ANDA INGIN MENGGUNAKAN BPJS ? ");
                         System.out.println("JIKA (IYA) KETIK 1 DAN JIKA TIDAK KETIK 2");
                         System.out.print("PILIH : ");
                         pilihanBPJS = input.nextInt();

                         if (pilihanBPJS == 1 ){
                             System.out.print("MASUKAN NOMOR BPJS : ");
                             nomorBPJS = input.nextDouble();
                              
                             int menuBPJS;
                             do{
                                 System.out.println();
                                 System.out.println("TERIMA KASIH KAMI TELAH MENYIMPAN NOMOR BPJS ANDA");
                                 System.out.print("NOMOR REKA PASIEN ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY

                                                                  System.out.println(noRekPasRandom);


                                 System.out.println("PENDAFTARAN ANDA TELAH BERHASIL");
                                 System.out.println("PENDAFTARAN TELAH SELESAI");
                                 System.out.println("1. KEMBALI KE MENU UTAMA");
                                 System.out.println("2. KELUAR ");
                                 System.out.print("PILIH : ");
                                 menuBPJS = input.nextInt();
                                 if (menuBPJS == 1){
                                     menu_1();
                                 }else if (menuBPJS == 2){
                                     System.out.println("______________________________");
                                     System.out.println("TERIMA KASIH");
                                     System.out.println("PROGRAM SELESAI");
                                      System.exit(0);
                                 }else {
                                     System.out.println("MAAF INPUT YANG ANDA MASUKAN TIDAK VALID COBA MASUKAN KEMBALI INPUT YANG BENAR");
                                 }
                             }while(menuBPJS != 1 && menuBPJS != 2 );

                         }else if (pilihanBPJS == 2) {
                             int menuBPJS;
                             do {
                                 System.out.println();
                                 System.out.println("TERIMA KASIH PENDAFTARAN ANDA TELAH BERHASIL");
                                 System.out.print("NOMOR REKA MEDIS ANDA ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY

                                                                  System.out.println(noRekPasRandom);


                                 System.out.println("PENDAFTARAN TELAH SELESAI");
                                 System.out.println("1. KEMBALI KE MENU UTAMA");
                                 System.out.println("2. KELUAR ");
                                 System.out.print("PILIH : ");
                                 menuBPJS = input.nextInt();
                                 if (menuBPJS == 1){
                                     menuUtama();
                                 }else if (menuBPJS == 2){
                                     System.out.println("______________________________");
                                     System.out.println("TERIMA KASIH");
                                     System.out.println("PROGRAM SELESAI");
                                      System.exit(0);
                                 }else {
                                     System.out.println("MAAF INPUT YANG ANDA MASUKAN TIDAK VALID COBA MASUKAN KEMBALI INPUT YANG BENAR");
                                 }
                             }while(menuBPJS != 1 && menuBPJS != 2);
                         }
                     }while(pilihanBPJS < 1 || pilihanBPJS > 2);
                break;

                default :
                    System.out.println("MAAF INPUT YANG ANDA MASUKAN TIDAK VALID COBA MASUKAN KEMBALI INPUT YANG BENAR");
                    break;
             }
        }while(menu > 5 || menu < 1);

    }

    // subprogram untuk pilihan menu utama nomor 2 yaitu pendaftaran untuk pasien yang sudah pernah berobat di RSU ETERNA PAINGAN SEBELUMNYA
    static void menu_2(){
        Scanner aria = new Scanner(System.in);
        boolean nomorRekaTemu = false;
        int i = 0;

        System.out.println("ANDA MEMILIH MENU 2");
        System.out.println("JIKA ANDA SUDAH PERNAH MENJADI PASIEN DI RSU ETERNA PAINGAN SEBELUMNYA");
        System.out.println("MAKA ANDA TIDAK PERLU MENGISI BIODATA PASIEN LAGI");
        System.out.print("");

        // Mengecek kalau benar atau salah nomor reka medis yang diisi
        while (true) {
            System.out.print("TOLONG MASUKAN NOMOR REKA PASIEN : ");
            short rekaMed = aria.nextShort();

            // Reset the nomorRekaTemu flag and index for each iteration
            nomorRekaTemu = false;
            pilIndexArray = -1;

            // Iterate through the array to check for a match
            for (int j = 0; j < nomorRekaMedis.length; j++) {
                if (rekaMed == nomorRekaMedis[j]) {
                    nomorRekaTemu = true;
                    pilIndexArray = j;
                    break; // Exit the loop once a match is nomorRekaTemu
                }
            }

            if (nomorRekaTemu) {
                System.out.println("SELAMAT DATANG " + namaPasien[pilIndexArray] + "!");
                break;
            } else {
                System.out.println("Nomor Reka Medis tidak ditemukan.");
            }



        }
        // MEMBUAT SCANNER ARRAY UNTUK MEMASUKAN NOMOR REKA
        
        biodataPenanggungJawab(); // memanggil biodata
        
        menuPoli(); // memanggil menu poli
    }
    static void isiArray(){// Untuk mengisi nilai 5 reka medis yang sudah ada dari index 0 s/d 4
        // Nomor reka medis set
        nomorRekaMedis[0] = 12334;
        nomorRekaMedis[1] = 12311;
        nomorRekaMedis[2] = 15334;
        nomorRekaMedis[3] = 12313;
        nomorRekaMedis[4] = 32420;

        // Nama pasien set
        namaPasien[0] = "Sharon Dominika";
        namaPasien[1] = "Antonius Rengginang";
        namaPasien[2] = "Sumanto";
        namaPasien[3] = "Suryono";
        namaPasien[4] = "Snoop Dogg";

        // Tanggal lahir pasien awal
        tanggalLahirPasien[0] = "11 November 1997";
        tanggalLahirPasien[1] = "25 Januari 1999";
        tanggalLahirPasien[2] = "13 Mei 2002";
        tanggalLahirPasien[3] = "28 September 1978";
        tanggalLahirPasien[4] = "20 Oktober 1971";

        // Jenis kelamin pasien
        jenisKelaminPasien[0] = "Perempuan";
        jenisKelaminPasien[1] = "Laki-laki";
        jenisKelaminPasien[2] = "Laki-laki";
        jenisKelaminPasien[3] = "Laki-laki";
        jenisKelaminPasien[4] = "Laki-laki";

        // Tempat lahir pasien
        tempatLahirPasien[0] = "Salatiga, Jawa Tengah";
        tempatLahirPasien[1] = "Bantul, DI Yogyakarta";
        tempatLahirPasien[2] = "Surabaya, Jawa Timur";
        tempatLahirPasien[3] = "Mataram, NTB";
        tempatLahirPasien[4] = "Long Beach, California, AS";

        // Alamat pasien
        alamatPasien[0] = "Maguwoharjo, Depok, Sleman, DI Yogyakarta";
        alamatPasien[1] = "Condongcatur, Depok, Sleman, DI Yogyakarta";
        alamatPasien[2] = "Gondokusuman, Kota Yogyakarta, DI Yogyakarta";
        alamatPasien[3] = "Purwomartani, Kalasan, Sleman, DI Yogyakarta";
        alamatPasien[4] = "EARTH";

        // Agama pasien
        agamaPasien[0] = "Katolik";
        agamaPasien[1] = "Katolik";
        agamaPasien[2] = "Kristen Protestan";
        agamaPasien[3] = "Islam";
        agamaPasien[4] = "WEED";

        // Pekerjaan pasien
        pekerjaanPasien[0] = "Wiraswasta";
        pekerjaanPasien[1] = "TNI/POLRI";
        pekerjaanPasien[2] = "ASN";
        pekerjaanPasien[3] = "Petani";
        pekerjaanPasien[4] = "Doin' good shit";

        //
    }
}