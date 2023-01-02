/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karn
 */
public class MGenStudent extends MGenCard {
    public final int discount = 20;
    
    public MGenStudent(String name) {
        super(name);
    }
    
    @Override
    public void buyTicket(Cinema n, int amt) {
        super.buyTicket(n, amt);
        System.out.println("You got "+(n.getTicketPrice()*amt*discount/100)+" discount");
    }
}
