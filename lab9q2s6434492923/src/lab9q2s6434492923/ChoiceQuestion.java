/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2s6434492923;


/**
 *
 * @author karn
 */
import java.util.ArrayList;
public class ChoiceQuestion extends Question {
    private ArrayList<String> choices = new ArrayList<>();
    
    public ChoiceQuestion(String t) {
        super(t);
    }
    
    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct) {
            super.setAnswer(choice);
        }
    }
    
    @Override
    public void display() {
        System.out.println(super.getTexter());
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i+1)+": "+choices.get(i));
        }
    }
    
    @Override
    public boolean checkAnswer(String response) {
        String ans = choices.get(Integer.parseInt(response.trim())-1);
        if (ans.equals(super.getAnswer())) {
            return true;
        }
        else {
            return false;
        }
    }
}
