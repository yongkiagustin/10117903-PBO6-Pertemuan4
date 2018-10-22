

package pbo6.pkg10117903.latihan41.massajenis;

/**
 * @author Yongki
 * NAMA       : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * massa jenis kubus.
 */
public class Kubus {
private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        parSisi = sisi*sisi*sisi;
        return parSisi;
        
    }
}
