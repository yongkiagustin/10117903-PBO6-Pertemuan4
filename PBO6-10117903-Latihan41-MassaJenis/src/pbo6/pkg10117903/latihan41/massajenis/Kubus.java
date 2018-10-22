

package pbo6.pkg10117903.latihan41.massajenis;

/**
 *
 * @author Teknisi
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
