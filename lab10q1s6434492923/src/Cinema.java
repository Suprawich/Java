/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author karn
 */
public class Cinema {
    private String name;        // ชื่อโรงภาพยนตร์
    private int ticketPrice;    // ราคาตั๋วหนัง
    
    public Cinema (String name, int ticketPrice) {
        this.name = name;
        this.ticketPrice = ticketPrice;
    }
    public String getName() {
        return name;
    }
    public int getTicketPrice() {
        return ticketPrice;
    }
}
