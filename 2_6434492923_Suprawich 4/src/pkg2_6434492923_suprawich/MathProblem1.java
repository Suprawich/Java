/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2_6434492923_suprawich;

import java.util.Random;

/**
 *
 * @author karn
 */
public class MathProblem1 {
    public int operand1;
    public int operand2;
    public String operator;
    public String question;
    public int answer;
    public MathProblem1(int range) {
        String[] op = {"","+","-"};
        Random r = new Random();
        operand1 = r.nextInt(range+1);
        operand2 = r.nextInt(range+1);
        operator = op[r.nextInt(1, 3)];
    }
    
    public void setQandK() {
        question = operand1+" "+operator+" "+operand2+" = ?";
        if (operator.equals("+")) {
            answer = operand1+operand2;
        }
        if (operator.equals("-")) {
            answer = operand1-operand2;
        }
    }
    
    public String getQuestion() {
        return question;
    }
    
    public int chkAnswer(int ans) {
        if (ans == answer) {
            return 1;
        }
        else{
            return 0;
        }  
    }
    
    @Override
    public String toString() {
        return "labexam2.MathProblem1"+" "+getQuestion()+":"+answer;
    }
}
