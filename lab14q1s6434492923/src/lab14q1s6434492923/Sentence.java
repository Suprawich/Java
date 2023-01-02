/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab14q1s6434492923;

/**
 *
 * @author karn
 */
class Sentence {
    
    private String s;
    
    public Sentence (String s) {
        this.s = s;
    }
    
    public boolean find(String t) {
        if (s.length() < t.length()) {
            return false;
        }
        if (s.isEmpty() || t.isEmpty()) {
            return false;
        }
        return find(t, 0);
    }
    
    public boolean find(String t, int index) {
        if (s.substring(index, index+t.length()).equals(t)) {
            return true;
        }
        if (index + t.length() < s.length()) {
            return find(t, index+1);
        }
        return false;
    }
}
