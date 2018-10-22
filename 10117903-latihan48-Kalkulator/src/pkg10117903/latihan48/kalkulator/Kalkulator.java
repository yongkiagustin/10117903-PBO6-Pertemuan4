/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10117903.latihan48.kalkulator;

/**
 *
 * @author yongki
 */
public class Kalkulator {

    private double value1, value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void setNameProject() {
        System.out.println("Project Calculator");
    }

    public void setNoteProject(String note) {
        System.out.println("This Project shown how to manage method in java");
    }

    public double add(double val1, double val2) {
        return this.value1 + this.value2;

    }
    public double minus(double val1, double val2) {
        return this.value1 - this.value2;

    }
    public double multiprication(double val1, double val2) {
        return this.value1 * this.value2;

    }
    public double division(double val1, double val2) {
        return this.value1 / this.value2;

    }
}
