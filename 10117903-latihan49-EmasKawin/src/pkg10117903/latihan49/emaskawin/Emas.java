/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10117903.latihan49.emaskawin;

/**
 *
 * @author yongki
 */
public class Emas {
    private double hargaEmas, beli;

    public double getHargaEmas() {
        return hargaEmas;
    }

    public void setHargaEmas(double hargaEmas) {
        this.hargaEmas = hargaEmas;
    }

    public double getBeli() {
        return beli;
    }

    public void setBeli(double beli) {
        this.beli = beli;
    }
    
    public double totalHarga(double harga, double beli){
        return this.hargaEmas*this.beli;
        
    }
    
}
