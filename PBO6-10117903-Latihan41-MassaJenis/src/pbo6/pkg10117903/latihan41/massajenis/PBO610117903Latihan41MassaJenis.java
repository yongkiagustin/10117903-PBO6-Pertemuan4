/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan41.massajenis;

import java.util.Scanner;

/**
 * @author Yongki
 * NAMA       : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * massa jenis kubus.
 */
public class PBO610117903Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    
            
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        Scanner vol = new Scanner (System.in);
        System.out.println("Masukan Sisi :");
        kubus.setSisi(vol.nextInt());
        
        System.out.println("Sisinya :".concat(String.valueOf(kubus.hitungVolume(0))));
    }
    
}
