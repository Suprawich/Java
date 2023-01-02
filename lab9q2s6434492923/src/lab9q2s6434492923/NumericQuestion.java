/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9q2s6434492923;

/**
 *
 * @author karn
 */
public class NumericQuestion extends Question{
    public NumericQuestion(String t) {
        super(t);
    }
    
    @Override
    public boolean checkAnswer(String response) {
        double res = Double.parseDouble(response);
        double ans = Double.parseDouble(super.getAnswer());
        return (Math.abs(ans-res) <= 0.01);
    }
}
