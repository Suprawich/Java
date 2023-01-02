/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1q2s6434492923;

/**
 *
 * @author karn
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter birth year : ");
        int year = sc.nextInt();
        LocalDate today = LocalDate.now();
        LocalDate startDate = LocalDate.parse(year-543+"-01-01");
        Period duration = Period.between(startDate, today);
        year = duration.getYears();
        System.out.print(name+" is "+year+" years old. ");
    }
}
