/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan45.cetaknama;

import java.util.Scanner;
/**
 * @author Yongki
 * NAMA         : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk mengulang 
 * mencetak nama.
 */
public class PBO610117903Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner innama = new Scanner(System.in);
        Scanner injumlah = new Scanner(System.in);
        Printer printer = new Printer();

        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan Nama Anda :");
        printer.setNama(innama.nextLine());
        System.out.print("Mau Cetak berapa Kali : ");
        printer.setJmlCetak(injumlah.nextInt());
        System.out.println("Hasil Cetak : ");
        printer.cetak(printer.getJmlCetak(), printer.getNama());

    }

}
