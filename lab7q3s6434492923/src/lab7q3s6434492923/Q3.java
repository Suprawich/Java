/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7q3s6434492923;

/**
 *
 * @author karn
 */
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3  student ID and name :");
        Student[] student = new Student[3];
        for (int i = 0; i < 3; i++) {
            String string = input.nextLine();
            int f_index = string.indexOf(" ");
            String ID = string.substring(0, f_index).trim();
            String name = string.substring(f_index).trim();
            student[i] = new Student(name, ID);
        }
        System.out.println("Enter 5 course ID, name and credit: ");
        Course[] course = new Course[5];
        for (int j = 0; j < 5; j++) {
            String string = input.nextLine();
            int f_index_2 = string.indexOf(" ");
            int l_index_2 = string.lastIndexOf(" ");
            String course_id = string.substring(0, f_index_2).trim();
            String course_name = string.substring(f_index_2, l_index_2).trim();
            String course_credit = string.substring(l_index_2).trim();
            int course_cd = Integer.parseInt(course_credit);
            course[j] = new Course(course_id, course_name, course_cd);
        }
        
        for (int k = 0; k < student.length; k++) {
            System.out.println(student[k].getName()+" grade report:");
            String string = input.nextLine().trim();
            while (!string.equalsIgnoreCase("x")) {
                int f_index = string.indexOf(" ");
                String c_id = string.substring(0, f_index).trim();
                String grade = string.substring(f_index).trim();
                for (int m = 0; m < 5; m++) {
                    if (course[m].getCid().equals(c_id)) {
                        student[k].addGradeReport(course[m], grade);
                    }
                }
                string = input.nextLine().trim();
            }
        }
        
        for (int n = 0; n < 3; n++) {
            System.out.println("----- Transcript -----");
            System.out.println(" "+student[n].getID()+" "+student[n].getName());
            student[n].string();
            System.out.println("GPA: "+student[n].calGPA());
        }
    }
    
}
