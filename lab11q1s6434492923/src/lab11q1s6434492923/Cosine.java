/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11q1s6434492923;

/**
 *
 * @author karn
 */
public class Cosine extends Taylor{
    public Cosine(int k, double x) {
        super(k, x);
    }
    @Override
    public double getAppox() {
        double ans = 0;
        for (int i = 0; i <= super.getIteration(); i++) {
            ans += (Math.pow(-1, i)*Math.pow(super.getValue(), 2*i))/super.factorial(2*i);
        }
        return ans;
    }
    
    @Override
    public void printValue() {
        System.out.println("Value from Math.exp() is "+Math.cos(super.getValue()));
        System.out.println("Approximated value is "+getAppox());
    }
}
