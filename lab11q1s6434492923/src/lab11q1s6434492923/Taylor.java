/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q1s6434492923;

/**
 *
 * @author karn
 */
abstract class Taylor {
    private int k;
    private double x;
    
    public Taylor(int k, double x) {
        this.k = k;
        this.x = x;
    }
    
    public int factorial(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total = total*i;
        }
        return total;
    }
    
    public int getIteration() {
        return k;
    }
    
    public double getValue() {
        return x;
    }
    public abstract void printValue();
    public abstract double getAppox();
}
