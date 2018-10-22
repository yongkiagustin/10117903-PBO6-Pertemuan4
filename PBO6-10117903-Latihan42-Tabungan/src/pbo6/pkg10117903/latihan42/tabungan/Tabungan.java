/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan42.tabungan;

/**
 * @author Yongki
 * NAMA       : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * tabungan.
 */
public class Tabungan {

       private int saldo;

    public int getSaldo() {
        return saldo;
    }
    
    public Tabungan (int saldo){
        this.saldo = saldo;
    }

    public int ambilUang (int jumlah){
        return saldo - jumlah;
       
    }
}
