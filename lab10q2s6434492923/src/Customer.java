/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karn
 */
public class Customer {
    private String name, tel;
    
    public Customer(String n, String t) {
        name = n;
        tel = t;
    }
    
    public String getName() {
        return name;
    }
    
    public String getTel() {
        return tel;
    }
    
    public String toString() {
        return(name+" tel : "+tel);
    }
}
