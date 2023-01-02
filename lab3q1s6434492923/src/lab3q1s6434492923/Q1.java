/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3q1s6434492923;

/**
 *
 * @author karn
 */

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        
        //Input student1
        Scanner sc = new Scanner(System.in);
        System.out.println("Student 1: Enter ID, birthday, name");
        String stu1ID = sc.next();
        int stu1Bdate = sc.nextInt();
        int stu1Bmonth = sc.nextInt();
        int stu1Byear = sc.nextInt();
        String stu1name = (sc.nextLine()).strip();
        
        //Input student2
        System.out.println("Student 2: Enter ID, name");
        String stu2ID = sc.next();
        String stu2name = (sc.nextLine()).strip();
        
        //Data about student 1
        Student data_stu1 = new Student(stu1name, stu1Bdate, stu1Bmonth, stu1Byear, stu1ID);
        String ID1 = data_stu1.getID();
        String name1 = data_stu1.getName();
        int age1 = data_stu1.getAge();
        String totalStu1 = ID1+" "+name1+" "+age1;
        System.out.println("Student 1: "+totalStu1);
        
        //Data about student 2
        Student data_stu2 = new Student(stu2name, stu2ID);
        String ID2 = data_stu2.getID();
        String name2 = data_stu2.getName();
        int age2 = data_stu2.getAge();
        String totalStu2 = ID2+" "+name2+" "+age2;
        System.out.println("Student 2: "+totalStu2);
        
        //Check equal
        boolean check = data_stu1.equals(data_stu2);
        if (check) {
            System.out.println("Same");
        }
        else {
            System.out.println("Not same");
        }
        
        //Change birthday
        System.out.println("Enter birth for student 2");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        data_stu2.setBD(day, month, year);
        int newAge = data_stu2.getAge();
        System.out.println("Student 1: "+totalStu1);
        System.out.println("Student 2: "+ID2+" "+name2+" "+newAge);
        
        //Check equal
        boolean checkRound2 = data_stu1.equals(data_stu2);
        if (checkRound2) {
            System.out.println("Same");
        }
        else {
            System.out.println("Not same");
        }
    }
}