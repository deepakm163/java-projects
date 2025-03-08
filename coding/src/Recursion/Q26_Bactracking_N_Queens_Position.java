package Recursion;

import java.util.Scanner;

public class Q26_Bactracking_N_Queens_Position {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int[][] arr = new int[n][n];
        queenPostion(arr, "", 0);
    }
    public static void queenPostion(int[][] chess, String set, int row){
        if(row == chess.length){
            System.out.println(set + ".");
            return;
        }

        for(int col = 0; col < chess.length; col++){
            if(isqueensPostionRight(chess, row, col) == true){
                chess[row][col] = 1;
                queenPostion(chess,set + row + "-" + col + ",", row + 1);
                chess[row][col] = 0;
            }
        }
    }
    public static boolean isqueensPostionRight(int[][] chess, int row, int col){

        for(int i = row - 1; i >= 0; i--){
            if(chess[i][col] == 1){
                return false;
            }
        }

        for(int i = row - 1, j = col - 1; i >=0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
