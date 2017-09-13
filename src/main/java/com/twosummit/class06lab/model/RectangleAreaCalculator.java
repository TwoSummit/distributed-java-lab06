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
public class RectangleAreaCalculator {
    private double length;
    private double width;

    public RectangleAreaCalculator(String length, String width) {
        this.length = Double.parseDouble(length);
        this.width = Double.parseDouble(width);
    }

    public String getArea() {
        return "" + (length * width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    
}
