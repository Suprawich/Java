/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karn
 */
public class PizzaSpecial extends Pizza {
    private String special;
    
    public PizzaSpecial(String n, double p, String s) {
        super(n, p);
        special = s;
    }
    
    @Override
    public String toString() {
        return(super.toString()+" special : "+special);
    }
}
