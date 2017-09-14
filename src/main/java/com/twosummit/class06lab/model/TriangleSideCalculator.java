/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.twosummit.class06lab.model;

/**
 *
 * @author cssco
 */
public class TriangleSideCalculator {
    private double sideA;
    private double sideB;

    public TriangleSideCalculator(String sideA, String sideB) {
        this.sideA = Double.parseDouble(sideA);
        this.sideB = Double.parseDouble(sideB);
    }

    public String getLastSide(){
        return "" + (Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2)));
    }
    
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    
    
    
}
