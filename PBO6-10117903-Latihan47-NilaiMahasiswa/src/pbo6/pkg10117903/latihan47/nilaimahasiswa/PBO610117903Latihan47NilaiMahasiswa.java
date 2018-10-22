/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author yongki
 */
public class PBO610117903Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inQuiz = new Scanner(System.in);
        Scanner inUts = new Scanner(System.in);
        Scanner inUas = new Scanner(System.in);
        NilaiMHS nilai = new NilaiMHS();
        System.out.print("quiz \t\t= ");
        nilai.setQuiz(inQuiz.nextFloat());
        System.out.print("uts \t\t= ");
        nilai.setUts(inUts.nextFloat());
        System.out.print("UAS \t\t= ");
        nilai.setUas(inUas.nextFloat());
        
        System.out.println("Nilai Akhir \t= "+nilai.NilaiAkhir());
        System.out.println("Index \t\t= "+nilai.indexNilai(nilai.NilaiAkhir()));
        System.out.println("Keterangan \t= "+nilai.ketereangan());
        
    }

}
