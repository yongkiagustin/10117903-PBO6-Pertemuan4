/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10117903.latihan48.kalkulator;
/**
 * @author Yongki
 * NAMA         : Yongki Agustin
 * KELAS        : PBO6
 * NIM          : 10117903
 * Deskripsi Program : Program ini berisi program untuk menhitung 
 * aritmatika sederhana.
 */
public class Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator();
        
        kal.setNameProject();
        kal.setNoteProject(null);
        kal.setValue1(7);
        kal.setValue2(5);
        
        
        System.out.println("Result add is = "+kal.add(kal.getValue1(), kal.getValue2()));
        System.out.println("Result minus is = "+kal.minus(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Multiple is = "+kal.multiprication(kal.getValue1(), kal.getValue2()));
        System.out.println("Result Division is = "+kal.division(kal.getValue1(), kal.getValue2()));
    
    }   
    
    
    
    
}
