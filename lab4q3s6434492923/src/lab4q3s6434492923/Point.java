/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4q3s6434492923;

/**
 *
 * @author karn
 */
import java.lang.Math;
public class Point {
    private double x; double y;
    
    public Point(double dx, double dy) {
        x = dx;
        y = dy;
    }
    
    public double distance(double dx, double dy) {
        //double new_x = dx; double new_y = dy;
        double d = Math.sqrt(Math.pow(dx-x,2)+Math.pow(dy-y,2));
        return d;
    }
    
    public void translate(double dx, double dy) {
        x += dx; y += dy;
    }
    
    public String toString() {
        return ("("+x+","+y+")");
    }
    
    public boolean equals(String that) {
        return ((this.toString()).equals(that));
    }
    
}
