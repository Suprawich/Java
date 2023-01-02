/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab13q2s6434492923;

/**
 *
 * @author karn
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            File file = new File("wordlist.txt");
            
            Scanner sc = new Scanner(file);
            
            ArrayList arr = new ArrayList<>();
            
            while (sc.hasNextLine()) {
                
                String word = sc.nextLine().trim();
                arr.add(word);
            }
            
            System.out.print("Enter a sentence : ");
            Scanner sn = new Scanner(System.in);
            String input = sn.nextLine();
            String[] list = input.trim().split(" ");
            ArrayList check = new ArrayList<>();
            
            for (int i = 0; i < list.length; i++) {
                if (arr.contains(list[i])) {
                }
                else {
                    check.add(list[i]);
                }
            }
            
            System.out.println("Words not contain : ");
            if (!check.isEmpty()) {
                for (int i = 0; i < check.size(); i++) {
                    System.out.println(check.get(i));
                }
            }
            else {
                System.out.println("N/A");
            }
  
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
