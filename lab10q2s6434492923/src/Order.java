/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karn
 */
import java.util.ArrayList;
public class Order {
    public static int cntOrder = 0;
    private int id;
    private Customer c;
    private ArrayList<Pizza> p = new ArrayList<>();
    
    public Order(Customer customer) {
        c = customer;
        cntOrder += 1;
        id = cntOrder;
    }
    
    public void addPizza(Pizza a) {
        p.add(a);
    }
    
    public String getOrderDetail() {
        String order = "Order id : "+id+"\n";
        order += c.toString()+"\n";
        for (int i = 0; i < p.size(); i++) {
            order += p.get(i)+"\n";
        }
        order += "Total pieces : "+p.size()+"\n";
        double price = 0;
        for (Pizza eachPizza : p) {
            price += eachPizza.getPrice();
        }
        if (c.getClass().getName().equals("GoldCustomer")) {
            GoldCustomer goldcustomer = (GoldCustomer) c;
            price = price*(1-goldcustomer.getDiscount());
            order += "Total cost : "+price;
        }
        else {
            order += "Total cost : "+price;
        }
        return(order+"\n");
    }
    
    public double calculatePayment() {
        double price = 0;
        for (Pizza eachPizza : p) {
            price += eachPizza.getPrice();
        }
        if (c.getClass().getName().equals("GoldCustomer")) {
            GoldCustomer goldcustomer = (GoldCustomer) c;
            price = price*(1-goldcustomer.getDiscount());
            return price;
        }
        else {
            return price;
        }
    }
}
