/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q1s6434492923;

/**
 *
 * @author karn
 */
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        int year = 2022-age;
        System.out.print(name+" was born in "+year+".");
    }
    
}
