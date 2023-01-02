/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab13q1s6434492923;

/**
 *
 * @author karn
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
public class Q1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File file = new File("sequential.txt");
        
        try (PrintWriter pw = new PrintWriter(file)) {
            Scanner sc = new Scanner(System.in);
            
            String input = sc.nextLine();
            
            while (!input.equalsIgnoreCase("quit")) {
                pw.println(input);
                input = sc.nextLine();
            }
        }
        
        int cntChar = 0;
        int cntWord = 0;
        int cntLine = 0;
    
        File f = new File("sequential.txt");
        Scanner ip = new Scanner(f);
        
        while (ip.hasNextLine()) {
            
            cntLine += 1;
            
            String line  = ip.nextLine();
            String[] word = line.trim().split(" ");
            cntWord += word.length;
            
            cntChar += line.length();
        }
        
        System.out.println("Total characters : "+cntChar);
        System.out.println("Total words : "+cntWord);
        System.out.println("Total lines : "+cntLine);
    }
    
}
