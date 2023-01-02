/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6q4s6434492923;

/**
 *
 * @author karn
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Student {
    private String name,ID,sub_ID; int age,day,month,year;
    
    public Student(String n, String i) {
        name = n; ID = i;
        GregorianCalendar gcal = new GregorianCalendar();
        day = gcal.get(Calendar.DATE); 
        month = gcal.get(Calendar.MONTH)+1; 
        year = gcal.get(Calendar.YEAR);
    }
    
    public Student(String n, int d, int m, int y, String i) {
        name = n; ID = i;
        day = d; month = m; year = y;
    }
    
    public void setBD(int d, int m, int y) {
        day = d; month = m; year = y;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public String getBD() {
        String bday = day+"/"+month+"/"+year;
        return bday;
    }
    
    public String getName() {
        return name;
    }
    
    public String getID() {
        return ID;
    }
    
    public int getAge() {
        GregorianCalendar gcal = new GregorianCalendar();
        age = gcal.get(Calendar.YEAR)-year;
        return age;
    }
    
    public int daysToYears(int d) {
        int y = d/365;
        return y;
    }
    
    public boolean equals(Student that) {
        return (this.getName().equals(that.getName()) && this.getID().equals(that.getID()) && 
                this.getBD().equals(that.getBD()));
    }
    
    public String toString() {
        return (name+" "+ID+" "+day+"/"+month+"/"+year);
    }
    
    public int getDigit(int a, int b) {
        sub_ID = ID.substring(a, b+1);
        int digit_ID = Integer.parseInt(sub_ID);
        return digit_ID;
    }
    
    public int getFacultyCode() {
        return (this.getDigit(8, 9));
    }
    
    public int getLevelCode() {
        return (this.getDigit(2, 2));
    }
    
    public int getYear() {
        return (this.getDigit(0, 1));
    }
    
    public boolean sameYear(Student that) {
        return (this.getYear() == that.getYear());
    }
    
        public boolean sameLevel(Student that) {
        return (this.getLevelCode() == that.getLevelCode());
    }
    
    public boolean sameFaculty(Student that) {
        return (this.getFacultyCode() == that.getFacultyCode());
    }
}