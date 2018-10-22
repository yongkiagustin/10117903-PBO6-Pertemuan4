/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author yongki
 */
public class PBO610117903Latihan46Tandanyakamu {

    /**
     * @param args the command line arguments
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner inthnLahir = new Scanner(System.in);

        System.out.print("Masukkan Tahun Lahir Anda : ");
        int thnLahir = inthnLahir.nextInt();

        Age age = new Age(2018);
        age.setYearBirth(thnLahir);
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth());
        System.out.println("Tahun Sekarang : " + age.getYearnow());
        System.out.println("Umur kamu sampai hari ini Adalah " + age.hitungUmur() + " Tahun");
        System.out.println("Tandanya kamu " + ANSI_RED + age.tandanyaKamu(age.hitungUmur()) + ANSI_RESET);
    }

}
