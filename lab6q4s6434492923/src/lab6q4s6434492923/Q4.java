/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6q4s6434492923;

/**
 *
 * @author karn
 */
import java.util.Scanner;
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Input & Create obj student1
        System.out.println("Student 1: Enter ID, name");
        String stu1 = sc.nextLine();
        int f_index1 = stu1.indexOf(" ");
        String stu1_id = stu1.substring(0, f_index1).trim();
        String stu1_name = stu1.substring(f_index1).trim();
        Student data_stu1 = new Student(stu1_name, stu1_id);
        
        //Input & Create obj student2
        System.out.println("Student 2: Enter ID, name");
        String stu2 = sc.nextLine();
        int f_index2 = stu2.indexOf(" ");
        String stu2_id = stu2.substring(0, f_index2).trim();
        String stu2_name = stu2.substring(f_index2).trim();
        Student data_stu2 = new Student(stu2_name, stu2_id);
        
        //Check
        if (data_stu1.sameYear(data_stu2) && 
            data_stu1.sameFaculty(data_stu2) && 
            data_stu1.sameLevel(data_stu2)) {
            System.out.print("Same year, same level, same faculty");
        }
        else if (data_stu1.sameYear(data_stu2) && 
                 data_stu1.sameFaculty(data_stu2)) {
            System.out.print("Same year, same faculty, different level");
        }
        else if (data_stu1.sameYear(data_stu2) && 
                 data_stu1.sameLevel(data_stu2)) {
            System.out.print("Same year, same level, different faculty");
        }
        else if (data_stu1.sameLevel(data_stu2) && 
                 data_stu1.sameFaculty(data_stu2)) {
            System.out.print("Same level, same faculty, different year");
        }
        else if (data_stu1.sameYear(data_stu2)) {
            System.out.print("Same year, different faculty, different level");
        }
        else if (data_stu1.sameLevel(data_stu2)) {
            System.out.print("Same level, different year, different faculty");
        }
        else if (data_stu1.sameFaculty(data_stu2)) {
            System.out.print("Same faculty, different year, different level");
        }
        else {
            System.out.print("Different faculty, different year, different level");
        }
    }
}
