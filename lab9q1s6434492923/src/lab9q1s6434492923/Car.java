/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9q1s6434492923;

/**
 *
 * @author karn
 */
public class Car {
    private double gas,efficiency;
    
    public Car() {
    }
    
    public Car(double g, double eff) {
        gas = g;
        efficiency = eff;
    }
    
    public void drive(double distance) {
        if ((distance/efficiency) >= gas) {
            System.out.println("You cannot drive too far, please add gas");
        }
        else {
            gas = gas - (distance/efficiency);
        }
    }
    
    public void setGas(double amount) {
        gas = amount;
    }
    
    public double getGas() {
        return gas;
    }
    
    public double getEfficiency() {
        return efficiency;
    }
    
    public void addGas(double amount) {
        gas = gas + amount;
    }
}
