/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q1s6434492923;

/**
 *
 * @author karn
 */
import java.lang.Math;
import java.util.Scanner;
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //First point
        System.out.print("First point   : ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        
        //Second point
        System.out.print("Second point  : ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        //Third point
        System.out.print("Third point   : ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        
        //Fourth point
        System.out.print("Fourth point  : ");
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        
        //Centroid point
        double avg_x = (x1+x2+x3+x4)/4;
        double avg_y = (y1+y2+y3+y4)/4;
        System.out.println("The centroid is ( "+avg_x+", "+avg_y+" ).");
        
        //Sum distance
        double distance1 = Math.sqrt(Math.pow(avg_x-x1,2)+Math.pow(avg_y-y1,2));
        double distance2 = Math.sqrt(Math.pow(avg_x-x2,2)+Math.pow(avg_y-y2,2));
        double distance3 = Math.sqrt(Math.pow(avg_x-x3,2)+Math.pow(avg_y-y3,2));
        double distance4 = Math.sqrt(Math.pow(avg_x-x4,2)+Math.pow(avg_y-y4,2));
        double sum = distance1+distance2+distance3+distance4;
        System.out.println("Sum of distance is "+sum+".");
        
        //Shotest&Longest
        double max = Math.max(distance1, Math.max(distance2, Math.max(distance3, distance4)));
        double min = Math.min(distance1, Math.min(distance2, Math.min(distance3, distance4)));
        System.out.println("Shortest distance is "+min+".");
        System.out.println("Longest distance is "+max+".");
    }
    
}
