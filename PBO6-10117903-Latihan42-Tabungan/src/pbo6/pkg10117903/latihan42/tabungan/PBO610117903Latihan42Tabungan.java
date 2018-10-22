/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan42.tabungan;

import java.util.Scanner;

/**
 * @author Yongki
 * NAMA       : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * tabungan.
 */
public class PBO610117903Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner insaldoAwal =  new Scanner(System.in);
        Scanner inkurangSaldo = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang");
        System.out.print("Masukan Saldo Awal : ");
        int saldo = insaldoAwal.nextInt();
        
        System.out.print("Jumlah Uang Yang Diambil : ");
        int ambil = inkurangSaldo.nextInt();
        
        Tabungan tabungan = new Tabungan(saldo);
        System.out.println("Saldo Anda Sekarang : "+tabungan.ambilUang(ambil));
        
    }

}
