/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan44.hukumohm;
/**
 * @author Yongki
 * NAMA         : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * kuat arus listrik.
 */
public class PBO610117903Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai baterai = new Baterai();
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar\n"
                + "akan berbanding lurus dengan beda potensial pada ujung ujung\n"
                + "kawat penghantar tersebut asalkan suhu kawat dijaga konstan.");

        baterai.getKuatArus();
        baterai.getHambatan();
        System.out.println("Hasil Tegangan : " + baterai.hitungTegangan() + " volt ");

    }

}
