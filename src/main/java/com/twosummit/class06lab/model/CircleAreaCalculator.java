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
public class CircleAreaCalculator {
    private double radius;
    private final double PI = Math.PI;

    public CircleAreaCalculator(String radius) {
        this.radius = Double.parseDouble(radius);
    }

    public String getArea(){
        return "" + (PI * (Math.pow(radius, 2)));
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
}
