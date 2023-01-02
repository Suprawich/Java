/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q1s6434492923;

/**
 *
 * @author karn
 */
public class Truck extends Car {
    private double M_weight,weight;
    
    public Truck(double g, double eff, double max_weight, double obj_weight) {
        super(g, eff);
        M_weight = max_weight;
        if (obj_weight > M_weight) {
            weight = M_weight;
        }
        else {
            weight = obj_weight;
        }
    }
    
    @Override
    public void drive(double distance) {
        if (weight < 1) {
            super.drive(distance);
        }
        else if (weight <= 10) {
            super.drive(distance*1.1);
        }
        else if (weight <= 20) {
            super.drive(distance*1.2);
        }
        else if (weight > 20){
            super.drive(distance*1.3);
        }
        else {
            System.out.println("You cannot drive too far, please add gas.");
        }
    }
}
