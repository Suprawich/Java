/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2q2s6434492923;

/**
 *
 * @author karn
 */
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        System.out.println("Current Date : "+today.get(Calendar.DATE)+" "+
                today.get(Calendar.MONTH)+", "+today.get(Calendar.YEAR));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date : ");
        int date = sc.nextInt();
        System.out.print("Enter Month : ");
        int month = sc.nextInt();
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        Date startdate = new Date();
        Date enddate = new Date(year-1900, month-1, date);
        long duration = (enddate.getTime()-startdate.getTime())/(1000*60*60*24);
        System.out.println("Number of days : "+duration);
    }
    
}
