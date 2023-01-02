/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q2s6434492923;

/**
 *
 * @author karn
 */
import java.util.Scanner;
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter firstname lastname age: ");
        String str = sc.nextLine();
        int first = str.indexOf(" ");
        int last = str.lastIndexOf(" ");
        String firstname = str.substring(0, first);
        String lastname = (str.substring(first, last)).trim();
        String age = (str.substring(last)).trim();
        System.out.print(lastname+", "+firstname+" is "+age+" years old.");
    }
    
}
