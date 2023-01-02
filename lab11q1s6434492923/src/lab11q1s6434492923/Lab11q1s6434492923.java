/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11q1s6434492923;

/**
 *
 * @author karn
 */
public class Lab11q1s6434492923 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expo exp = new Expo(7, 1);
        exp.printValue();
        Sine s = new Sine(7, Math.PI/4);
        s.printValue();
        Cosine cs = new Cosine(7, 1);
        cs.printValue(); 
        
        Taylor[] taylor = new Taylor[3];
        taylor[0] = new Expo(7, 1);
        taylor[1] = new Sine(7, Math.PI/4);
        taylor[2] = new Cosine(7, 1);
        for (int i = 0; i < taylor.length; i++) {
            taylor[i].printValue();
        }
    }
    
}
