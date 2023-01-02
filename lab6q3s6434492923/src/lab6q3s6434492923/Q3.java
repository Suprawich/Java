/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6q3s6434492923;

/**
 *
 * @author karn
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sum = 0; double max = 0; double min = 0; int count = 0;
        try {
            File scoreFile = new File("src/score.txt");
            Scanner scoreReader = new Scanner(scoreFile);
            while (scoreReader.hasNextLine()) {
            // read from file as Scanner
                double score = scoreReader.nextDouble();
                sum += score;
                if (count==0) {
                    max = score;
                    min = score;
                }
                if (score>max) {
                    max = score;
                }
                if (score<min) {
                    min = score;
                }
                count += 1;
            }
            scoreReader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        System.out.println("Average score = "+(sum/count));
        System.out.println("Highest score = "+max);
        System.out.println("Lowest score = "+min);
    }
    
}
