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
public class MathProblem2 extends MathProblem1 {
    public int operand3;
    public String operator1;
    public String operator2;
    public String question;
    public int answer;
    public MathProblem2(int range) {
        super(range);
        String[] op = {"","+","-"};
        Random r = new Random();
        operand1 = r.nextInt(range+1);
        operand2 = r.nextInt(range+1);
        operand3 = r.nextInt(range+1);
        operator1 = op[r.nextInt(1, 3)];
        operator2 = op[r.nextInt(1, 3)];
    }

    @Override
    public void setQandK() {
        question = operand1+" "+operator1+" "+operand2+" "+operator2+" "+operand3+" = ?";
        if (operator1.equals("+")) {
            answer = operand1+operand2;
            if (operator2.equals("+")) {
                answer += operand3;
            }
            if (operator2.equals("-")) {
                answer -= operand3;
            }
        }
        if (operator1.equals("-")) {
            answer = operand1-operand2;
            if (operator2.equals("+")) {
                answer += operand3;
            }
            if (operator2.equals("-")) {
                answer -= operand3;
            }
        }
    }
    
    @Override
    public String getQuestion() {
        return question;
    }
    
    @Override
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
        return "labexam2.MathProblem2"+" "+getQuestion()+":"+answer;
    }
}
