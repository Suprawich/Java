/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_6434492923_suprawich;

/**
 *
 * @author 6434492923_Suprawich
 */
import java.util.Scanner;
public class LabExam2 {
    public static void main(String[] args) {
        int opVal, score = 0, in, i;
        Scanner input = new Scanner(System.in); 
        System.out.print("Please enter range of operand value : ");
        opVal = input.nextInt();
        MathProblem1 arr[] = new MathProblem1[6];
        for (i = 0; i < arr.length; i++) {
            if (i < 3) {
                arr[i] = new MathProblem1(opVal);
            }
            else {
                arr[i] = new MathProblem2(opVal);
            }
            arr[i].setQandK();
            System.out.println("Question is " + arr[i].getQuestion());
            System.out.print("Your answer is ");
            in = input.nextInt();
            score += arr[i].chkAnswer(in);
        }
        System.out.println("---Test details---");
        for (i=0; i < arr.length; i++) 
            System.out.println(arr[i]);
        System.out.println("You got " + score + " points");
    }
}

