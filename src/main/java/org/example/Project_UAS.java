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
/**
 *
 * @author Krisna Wiranata, Anugrah Frumensius, Alberth Dody.
 */
public class Project_UAS {
    static Scanner input = new Scanner(System.in);

    static short[] nomorRekaMedis = new short[50];// Array untuk nomor reka medis berkapasitas 50 entries

    static int menuUtama,
             umur,
             menuKembali;
  
  static double nomorTelp,
                noTelpPenanggungJawab;

static String nama,
              jenisKelamin,
              tempatLahir,
              tanggalLahir,
              alamat,
              agama,
              pekerjaan,
              namaPenanggungJawab,
              alamatPenanggungJawab,
              hubungan,
              poli;

    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("==--SELAMAT DATANG DI MENU PENDAFTARAN RSUD ANUGRAH PAINGAN--==");
       menuUtama();
    }
    
    // subprogram untuk menu utama
    static void menuUtama(){
        do {
            System.out.println(" ");
            System.out.println("MENU PENDAFTARAN RSUD ANUGRAH PAINGAN");
            System.out.println("SILAHKAN MEMILIH MENU YANG TERSEDIA DENGAN MEMASUKAN ANGKA SESUAI DENGAN MENU YANG INGIN ANDA PILIH : ");
            System.out.println("1. MENDAFTAR PERTAMA KALI SEBAGAI PASIEN BARU");
            System.out.println("2. MENDAFTAR SEBAGAI PASIEN YANG SUDAH PERNAH MENDAFTAR SEBELUMNYA");
            System.out.println("3. INFO [SILAHKAN MASUK KE MENU INI JIKA ANDA BINGUNG DENGAN MENU YANG DISEDIAKAN");
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
                    System.out.println("MENU NOMOR 1 ADALAH MENU UNTUK PASIEN YANG PERTAMA KALI MENDAFTAR DI RSUD ANUGRAH PAINGAN. JIKA ANDA BELUM PERNAH MENDAFTAR SEBELUMNYA MAKA PILIHLAH MENU NOMOR 1");
                    System.out.println("MENU NOMOR 2 ADALAH MENU UNTUK PASIEN YANG SUDAH PERNAH MENJADI PASIAN DI RSUD ANUGRAH PAINGAN SEBELUMNYA.");
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
    static void identitas(){
         System.out.print("Nama Pasien           : ");
        nama = input.nextLine();
        nama += input.nextLine();
        System.out.print("Umur                  : ");
        umur = input.nextInt();
        System.out.print("Tempat lahir          : ");
        tempatLahir = input.nextLine();
        tempatLahir += input.nextLine();
        System.out.print("Tanggal lahir         : ");
        tanggalLahir = input.nextLine();
        System.out.print("Alamat lengkap        : ");
        alamat = input.nextLine();
        System.out.print("Agama                 : ");
        agama = input.nextLine();
        System.out.print("Pekerjaan             : ");
        pekerjaan = input.nextLine();
        System.out.print("No. Telepon           : ");
        nomorTelp = input.nextDouble();
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
        System.out.print("No. Telp              : ");
        noTelpPenanggungJawab = input.nextDouble();
    }
    // subprogram untuk menu tujuan poli, pemilihan dokter, pemilihan jadwal, mengisi keluhan dan menu BPJS
    static void menuPoli(){
        int menu,
            pilihanBPJS;
        
        double nomorBPJS;  
        
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
            menu = input.nextInt();
            System.out.println();
            
             switch (menu){
                 // menu tujuan poli anak
                 case 1 :
                     System.out.println("SILAHKAN MASUKAN JADWAL KONSULTASI"); 
                     System.out.println("MASUKAN HARI DAN JAM DENGAN FORMAT : hari");
                     System.out.println("CONTOH : jumat/JUMAT/Jumat");
                     System.out.print("MASUKAN : ");
                     jadwal = input.next().toLowerCase();
                   
                switch (jadwal){
                    case "senin" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Alberth Dody,  Sp.A");
                        break;
                    case "selasa" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Alberth Dody, Sp.A");
                        break;
                    case "rabu" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Nurul Mahalini, Sp.A");
                        break;
                    case "kamis" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Nurul Mahalini, Sp.A");
                        break;
                    case "jumat" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Alberth Dody, Sp.A");
                        break;
                    case "sabtu" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Sarah Ozawa, Sp.A");
                        break;
                    case "minggu" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Sarah Ozawa, Sp.A");
                        break;
                }
                
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
                                 System.out.println("NOMOR REKA PASIEN ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY
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
                                 System.out.println("NOMOR REKA PASIEN ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY
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
                break;
                
                // menu tujuan poli umum
                case 2 :
                     System.out.println("SILAHKAN MASUKAN JADWAL KONSULTASI");
                     System.out.println("MASUKAN HARI DAN JAM DENGAN FORMAT : hari ");
                     System.out.println("CONTOH : jumat/JUMAT/Jumat");
                     System.out.print("MASUKAN : ");
                     jadwal = input.next().toLowerCase();
                     
                     
                      switch (jadwal){
                    case "senin" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH dr. Laurel Varhana");
                        break;
                    case "selasa" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH dr. Agus Sapiderman");
                        break;
                    case "rabu" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER dr. Gatot Subrojo");
                        break;
                    case "kamis" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH dr. Laurel Varhana");
                        break;
                    case "jumat" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER dr. Asep Anggoro");
                        break;
                    case "sabtu" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER dr. Asep Anggoro");
                        break;
                    case "minggu" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH dr. Agus Sapiderman");
                        break;
                }
                
                
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
                                 System.out.println("NOMOR REKA PASIEN ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY
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
                                 System.out.println("NOMOR REKA PASIEN ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY
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
                break;
                
                // menu tujuan poli syaraf
                case 3 :
                     System.out.println("SILAHKAN MASUKAN JADWAL KONSULTASI");
                     System.out.println("MASUKAN HARI DAN JAM DENGAN FORMAT : hari");
                     System.out.println("CONTOH : jumat/JUMAT/Jumat");
                     System.out.print("MASUKAN : ");
                     jadwal = input.next().toLowerCase();
                     
                     
                       switch (jadwal){
                    case "senin" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Freyanashifa Jayawardana, Sp.S");
                        break;
                    case "selasa" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Nigarius Alexandro, Sp.S");
                        break;
                    case "rabu" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Tukimin Yoga Yowesben, Sp.S");
                        break;
                    case "kamis" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Nigarius Alexandro, Sp.S");
                        break;
                    case "jumat" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Freyanashifa Jayawardana, Sp.S");
                        break;
                    case "sabtu" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Freyanashifa Jayawardana, Sp.S");
                        break;
                    case "minggu" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Tukimin Yoga Yowesben, Sp.S");
                        break;
                }
                
                
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
                                 System.out.println("NOMOR REKA PASIEN ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY
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
                                 System.out.println("NOMOR REKA PASIEN ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY
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
                break;
                
                // menu tujuan poli bedah
                case 4 :
                     System.out.println("SILAHKAN MASUKAN JADWAL KONSULTASI");
                     System.out.println("MASUKAN HARI DAN JAM DENGAN FORMAT : hari");
                     System.out.println("CONTOH : jumat/JUMAT/Jumat");
                     System.out.print("MASUKAN : ");
                     jadwal = input.next().toLowerCase();
                     
                     
                      switch (jadwal){
                    case "senin" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Azizi Shafa Asadel, Sp.B");
                        break;
                    case "selasa" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Azizi Shafa Asadel, Sp.B");
                        break;
                    case "rabu" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Azizi Shafa Asadel, Sp.B");
                        break;
                    case "kamis" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Reza Agra Oktovian, Sp.B");
                        break;
                    case "jumat" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Reva Fidela Adel, Sp.B");
                        break;
                    case "sabtu" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Reva Fidela Adel, Sp.B");
                        break;
                    case "minggu" :
                        System.out.println("");
                        System.out.println("DOKTER YANG AKAN MENANGANI ANDA ADALAH DOKTER Basuki Narendra, Sp.B");
                        break;
                }
                

                
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
                                 System.out.println("NOMOR REKA PASIEN ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY
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
                                 System.out.println("NOMOR REKA PASIEN ADALAH : ");//MEMANGGIL NOMOR REKA YANG SUDAH DI CETAK RANDOM DARI ARRAY
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
    
    // subprogram untuk pilihan menu utama nomor 2 yaitu pendaftaran untuk pasien yang sudah pernah berobat di RSUD ANUGRAH PAINGAN SEBELUMNYA
    static void menu_2(){
        System.out.println("ANDA MEMILIH MENU 2");
        System.out.println("JIKA ANDA SUDAH PERNAH MENJADI PASIEN DI RSUD ANUGRAH PAINGAN SEBELUMNYA");
        System.out.println("MAKA ANDA TIDAK PERLU MENGISI BIODATA PASIEN LAGI");
        System.out.print("TOLONG MASUKAN NOMOR REKA PASIEN : ");
        // MEMBUAT SCANNER ARRAY UNTUK MEMASUKAN NOMOR REKA
        
        biodataPenanggungJawab();
        
        menuPoli();
    }
    static void isiArray(){// Untuk mengisi nilai 5 reka medis yang sudah ada dari index 0 s/d 4
        nomorRekaMedis[0] = 12334;
        nomorRekaMedis[1] = 12311;
        nomorRekaMedis[2] = 15334;
        nomorRekaMedis[3] = 12313;
        nomorRekaMedis[4] = 26713;

    }
}
