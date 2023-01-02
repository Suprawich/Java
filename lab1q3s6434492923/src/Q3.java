/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author karn
 */
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        float firstnum = sc.nextFloat();
        System.out.print("Enter another number : ");
        float secondnum = sc.nextFloat();
        float sum = (firstnum*secondnum)/(firstnum+secondnum);
        System.out.print("The ratio between product and their sum is "+sum);
    }
}
