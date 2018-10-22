/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10117903.latihan49.emaskawin;
/**
 * @author Yongki
 * NAMA         : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk menhitung 
 * total harga emas.
 */
public class Latihan49EmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas mas = new Emas();
        mas.setHargaEmas(570000);
        mas.setBeli(15.7);
        System.out.println("Harga Emas Bulan Ini : "+mas.getHargaEmas());
        System.out.println("Emas yang Dibeli : "+mas.getBeli()+" Gram");
        System.out.println("Total yang harus Di Bayar "+mas.totalHarga(mas.getHargaEmas(), mas.getBeli()));
    }
    
}
