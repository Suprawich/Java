/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q3s6434492923;

/**
 *
 * @author karn
 */
import java.util.Random;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        System.out.println("Current date : "+today.get(Calendar.DATE)+"-"+
                today.get(Calendar.MONTH)+"-"+today.get(Calendar.YEAR));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        Random random = new Random();
        int day = random.nextInt(1, 29);
        int month = random.nextInt(12);
        int year = random.nextInt(2000, 2022);
        System.out.println("Birth date : "+day+"-"+month+"-"+year);
        Date currentdate = new Date();
        Date birthdate = new Date(year-1900, month-1, day);
        long duration = (currentdate.getTime()-birthdate.getTime())/(1000*60*60*24);
        System.out.println("Age in day  : "+duration);
    }
    
}
