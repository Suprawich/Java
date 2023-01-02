/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13q3s6434492923;

/**
 *
 * @author karn
 */
public class TransactionRecord {
    private int acctNo;
    private double amountTransaction;
    
    public TransactionRecord(int acc, double aot) {
        acctNo = acc;
        amountTransaction = aot;
    }
    
    public TransactionRecord(int acc) {
        acctNo = acc;
    }
    
    public TransactionRecord(double aot) {
        amountTransaction = aot;
    }
    
    public int getAcctNo() {
        return acctNo;  
    }
    
    public double getAmtTrans() {
        return amountTransaction;
    }
}
