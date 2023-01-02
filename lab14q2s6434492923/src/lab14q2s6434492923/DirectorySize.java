/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab14q2s6434492923;

/**
 *
 * @author karn
 */
import java.io.File;
import java.util.Scanner;
public class DirectorySize {
    
    public static void main(String[] args) {
        // Prompt the user to enter a directory or a fileSystem.out.print("Enter a directory or a file: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();
        // Display the size
        System.out.println(getSize(new File(directory)) + " bytes");
    }//เขียน method getSize()
    
    public static long getSize(File f) {
        long size = 0;
        if (f.isFile()) {
            size += f.length();
        }
        else if (f.isDirectory()) {
            for (File i : f.listFiles()) {
                size += i.length();
            }
        }
        return size;
    }
}
