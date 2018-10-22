/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan47.nilaimahasiswa;
/**
 * @author Yongki
 * NAMA         : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk menhitung 
 * nilai seorang mahasiswa.
 */
public class NilaiMHS {

    private double quiz, uts, uas;
    private char indexNilai, keterangan;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double NilaiAkhir() {
        return (this.quiz * 0.2) + (this.uts * 0.30) + (this.uas * 0.5);
    }

    public char indexNilai(double na) {
        char idx = ' ';
        if (na>80 && na<=100) {idx='A';}
        else if (na>=68) {idx='B';}
        else if (na>=56) {idx='C';}
        else if (na>=45) {idx='D';}
        else if (na>=0) {idx='E';}
        else {idx = '-';}
    return this.indexNilai=idx;}

    public String ketereangan() {
        String ket = " ";
        switch (indexNilai) {
            case 'A':  ket="Sangat Baik"; break;
            case 'B':  ket="Baik"; break;
            case 'C':  ket="Cukup"; break;
            case 'D':  ket="Kurang"; break;
            case 'E':  ket="Sangat Kurang"; break;
        }
    return ket;}


}
