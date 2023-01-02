/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6q2s6434492923;

/**
 *
 * @author karn
 */
import java.util.Scanner;
import java.lang.Math;
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        
        for (int i=a;i<=b;i++) 
        {
            for (int j=i;j<=(c*i);j++) 
            {
                sum += Math.pow(i, 2)+j;
            }
        }
        System.out.println("Answer = "+sum);
    }
    
}
