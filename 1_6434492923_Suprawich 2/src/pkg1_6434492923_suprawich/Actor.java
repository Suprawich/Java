/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1_6434492923_suprawich;

/**
 *
 * @author karn
 */
public class Actor {
    private static boolean[][] board = new boolean[8][8];
    private int x;
    private int y;
    
    public Actor(int x, int y) {
        board[x][y] = true;
    }
    
    public boolean moveUp() {
        if (board[x][y+1]) {
            board[x][y] = true;
            return false;
        }
        else if (board[x][y+1] == false && y+1<8){
            board[x][y] = false;
            board[x][y+1] = true;
            return true;
        }
        return false;
    }
    
    public boolean moveDown() {
        if (board[x][y-1]) {
            board[x][y] = true;
            return false;
            
        }
        else if (board[x][y-1] == false && y-1>=0){
            board[x][y] = false;
            board[x][y-1] = true;
            return true;
        }
        return false;
    }
    
    public boolean moveLeft() {
        if (board[x-1][y]) {
            board[x][y] = true;
            return false;
        }
        else if (board[x-1][y] == false && x-1>=0){
            board[x][y] = false;
            board[x-1][y] = true;
            return true;
        }
        return false;
    }
    
    public boolean moveRight() {
        if (board[x+1][y]) {
            board[x][y] = true;
            return false;
        }
        else if (board[x+1][y] == false && x+1<8){
            board[x][y] = false;
            board[x+1][y] = true;
            return true;
        }
        return false;
    }
    
    public static void printBoard() {
        for(int i =0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(board[i][j]){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");  
                }
            }
        }
        System.out.println(" ");
    }
}
