/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg19117903.latihan43gaji.pegawai;
/**
 * @author Yongki
 * NAMA         : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * gaji pegawai.
 */
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(){
      totalGaji = uangTunjangan+uangTransport+gajiPokok; 
      return totalGaji;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan,
            int uangTransport, int gajiPokok, int totalGaji){
        
        GajiPegawai gajiPegawai = new GajiPegawai();
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        gajiPegawai.setNama("Rizki Adam Kurniawan");
        gajiPegawai.setAlamat("Jalan Semar dlm 4 No 72/66");
        gajiPegawai.setUangTransport(250000);
        gajiPegawai.setUangTunjangan(300000);
        gajiPegawai.setGajiPokok(4500000);
        System.out.println("Nama Karyawam : "+gajiPegawai.getNama());
        System.out.println("Alamat : "+gajiPegawai.getAlamat());
        System.out.println("Uang Transport : Rp. "+gajiPegawai.getUangTransport());
        System.out.println("Uang Tunjangan : Rp. "+gajiPegawai.getUangTunjangan());
        System.out.println("Gaji Pokok : Rp. "+gajiPegawai.getGajiPokok());
        System.out.println("Total Gaji : Rp. "+gajiPegawai.totalGaji());
        
    }
    
}
