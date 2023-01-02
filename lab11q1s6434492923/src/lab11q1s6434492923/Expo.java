/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q1s6434492923;

/**
 *
 * @author karn
 */
public class Expo extends Taylor {
    
    public Expo(int k, double x) {
        super(k, x);
    }
    @Override
    public double getAppox() {
        double ans = 0;
        for (int i = 0; i <= super.getIteration(); i++) {
            ans += Math.pow(super.getValue(), i)/super.factorial(i);
        }
        return ans;
    }
    
    @Override
    public void printValue() {
        System.out.println("Value from Math.exp() is "+Math.exp(super.getValue()));
        System.out.println("Approximated value is "+getAppox());
    }
}
