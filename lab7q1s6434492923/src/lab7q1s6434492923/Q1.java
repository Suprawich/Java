/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7q1s6434492923;

/**
 *
 * @author karn
 */
import java.util.Scanner;
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] prime = new int[n];
        int index = 0;
        boolean check;
        for (int i = 2; index < n; i++) {
            check = true;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    check = false;
                }
            }
            if (check) {
                prime[index] = i;
                index += 1;
            }
        }
        for (int k = 0; k < n; k++){
            System.out.println(prime[k]);
        } 
    }
    
}
