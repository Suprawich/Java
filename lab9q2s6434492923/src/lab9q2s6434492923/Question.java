/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2s6434492923;

/**
 *
 * @author karn
 */
public class Question {
    private String text,answer;
    
    public Question() {
        
    }
    
    public Question(String t) {
        text = t;
    }
    
    public void setAnswer(String ans) {
        answer = ans;
    }
    
    public void setText(String t) {
        text = t;
    }
    
    public String getAnswer() {
        return answer;
    }
    
    public String getTexter() {
        return text;
    }
    
    public boolean checkAnswer(String response) {
        if (response.equals(answer)) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void display() {
        System.out.println(text);
    }
}
