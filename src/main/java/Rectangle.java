/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {}
    
    public Rectangle(Rectangle r) {
        this.length = r.getLength();
        this.width = r.getWidth();
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

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
    
    public boolean equals(Rectangle r) {
        return this.getLength() == r.getLength() && this.getWidth() == r.getWidth();
    }


   
}
