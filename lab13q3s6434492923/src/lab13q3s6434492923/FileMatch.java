/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab13q3s6434492923;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karn
 */
public class FileMatch {
    public static void main(String[] args) {
        ArrayList<TransactionRecord> arrTrans = new ArrayList<>();
        ArrayList<AccountRecord> arrRec = new ArrayList<>();
        
        try {
            File masterFile = new File("master.txt");
            File tranFile = new File("trans.txt");
            
            Scanner sc = new Scanner(masterFile);
            Scanner sn = new Scanner(tranFile);
            
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                int f = line.indexOf(" ");
                int l = line.lastIndexOf(" ");
                
                String acc = line.substring(0, f).trim();
                int accNo = Integer.parseInt(acc);
                
                String name = line.substring(f, l).trim();
                
                String b = line.substring(l).trim();
                double balance = Double.parseDouble(b);
                
                AccountRecord accRec = new AccountRecord(accNo, name, balance);
                arrRec.add(accRec);
            }
            
            while (sn.hasNextLine()) {
                String line = sn.nextLine();
                int f = line.indexOf(" ");
                
                String acc = line.substring(0, f).trim();
                int accNo = Integer.parseInt(acc);
                
                String b = line.substring(f).trim();
                double balance = Double.parseDouble(b);
                
                TransactionRecord accTran = new TransactionRecord(accNo, balance);
                arrTrans.add(accTran);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);        
        }
        
        for (AccountRecord ar : arrRec) {
            for (TransactionRecord tr : arrTrans) {
                if (ar.getAcctNo() == tr.getAcctNo()) {
                    ar.match(tr);
                }
            }
        }
        
        try {
            RandomAccessFile ra = new RandomAccessFile("newMaster.dat", "rw");
            for (AccountRecord ar : arrRec) {
                ra.writeInt(ar.getAcctNo()); 
                ra.writeChars(ar.getName()+(" ".repeat(30-ar.getName().length())));
                ra.writeDouble(ar.getBalance()); 
                ra.writeInt(ar.getTransCnt());
            }
            
            int totalAcct = (int) (ra.length()/76);
            double totalBal = 0;
            int noTrans = 0;
            
            for (int i = 64; i < ra.length(); i+=76) {
                ra.seek(i);
                totalBal += ra.readDouble();
            }
            for (int i = 72; i < ra.length(); i+=76) {
                ra.seek(i);
                if (ra.readInt() == 0) {
                    noTrans++;
                }
            }
            
            System.out.println("Total Account Record : " + totalAcct);
            System.out.println("Total Balance Record : " + totalBal);
            System.out.println("No transaction : " + noTrans + " account.");
              
        } catch (IOException ex) {
            System.out.println(ex);  
        }
    }
}