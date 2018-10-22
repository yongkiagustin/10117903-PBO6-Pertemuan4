/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan46.tandanyakamu;

/**
 *
 * @author yongki
 */
public class Age {

    private int yearBirth, yearnow;
    private String red;

    public Age(int yearnow) {
        this.yearnow = yearnow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearnow() {
        return yearnow;
    }

    public int hitungUmur() {
        return this.yearnow - this.yearBirth;
    }

    public String tandanyaKamu(int umur) {
        if (umur >= 0 && umur <= 5) {
            this.red = "LAGI LUCU-LUCUNYA";
            return red;
        } else if (umur <= 10) {
            this.red = "MASIH ANAK-ANAK";
            return red;
        } else if (umur <= 13) {
            this.red = "MASIH REMADJA";
            return red;
        } else if (umur <= 19) {
            this.red = "ALAY";
            return red;
        } else if (umur <= 29) {
            this.red = "LAGI GALAU NYARI JODOH";
            return red;
        } else if (umur <= 35) {
            this.red = "LAGI SIBUK NYARI UANG";
            return red;
        } else if (umur <= 150) {
            this.red = "SUDAH TUA";
            return red;
        } else {
            this.red = "TIDAK TERDETEKSI DI KEHIDUPAN";
            return red;
        }
    }
}
