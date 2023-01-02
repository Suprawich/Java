/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karn
 */
public class GoldCustomer extends Customer {
    private double discount;
    
    public GoldCustomer(String n, String t,double d) {
        super(n,t);
        discount = d;
    }
    
    public double getDiscount() {
        return discount/100;
    }
    
    @Override
    public String toString() {
        return(super.toString()+" discount : "+discount);
    }
}
