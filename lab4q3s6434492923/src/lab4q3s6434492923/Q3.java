/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q3s6434492923;

/**
 *
 * @author karn
 */
import java.util.Scanner;
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Input pointA
        System.out.print("Point A: ");
        double pointA_x = sc.nextDouble();
        double pointA_y = sc.nextDouble();
        
        //Input pointB
        System.out.print("Point B: ");
        double pointB_x = sc.nextDouble();
        double pointB_y = sc.nextDouble();
        
        //Create point
        Point point_a = new Point(pointA_x, pointA_y);
        Point point_b = new Point(pointB_x, pointB_y);
        
        //Print pointA & pointB & distance
        double distance = point_a.distance(pointB_x, pointB_y);
        System.out.println("A = "+point_a.toString()+"  "+
                           "B = "+point_b.toString()+"  "+
                           "Distance = "+distance);
        
        //Move point
        System.out.print("Move to points: ");
        double moveX = sc.nextDouble();
        double moveY = sc.nextDouble();
        point_a.translate(moveX, moveY);
        point_b.translate(moveX, moveY);
        double new_distance = point_a.distance(pointB_x+moveX, pointB_y+moveY);
        System.out.println("A = "+point_a.toString()+"  "+
                           "B = "+point_b.toString()+"  "+
                           "Distance = "+new_distance);
        
        //Equlity check
        boolean check = (point_a.toString()).equals(point_b.toString());
        if (check) {
            System.out.println("A and B are at the same position.");
        }
        else {
            System.out.println("A and B are not at the same position.");
        }
    }
}
