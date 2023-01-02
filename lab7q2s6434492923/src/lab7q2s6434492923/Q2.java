/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7q2s6434492923;

/**
 *
 * @author karn
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        ArrayList<Integer> prime = new ArrayList<>();
        boolean check;
        for (int i = 2; i < n; i++) {
            check = true;
            for (int j = 2; j < i; j++){
                if (i%j == 0) {
                    check = false;
                }
            }   
            if (check) {
                prime.add(i);
            }
        }
        for (int k = 0; k < prime.size(); k++){
            System.out.println(prime.get(k));
        }
    }
    
}
