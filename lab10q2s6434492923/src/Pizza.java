/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karn
 */
public class Pizza {
    private String name;
    private double price;
    
    public Pizza(String n, double p) {
        name = n;
        price = p;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String toString() {
        return(name+" price : "+price);
    }
}
