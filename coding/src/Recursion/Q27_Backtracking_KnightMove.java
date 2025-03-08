package Recursion;

import java.util.Scanner;

public class Q27_Backtracking_KnightMove {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int[][] chess = new int[n][n];

        knightMove(chess, 2, 0, 1);
    }
    public static void knightMove(int[][] chess, int row, int col, int upcomingmove){
       if(row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] != 0){

           return;
       }

        chess[row][col] = upcomingmove;
       if(upcomingmove == chess.length * chess.length){

           display(chess);
           chess[row][col] = 0;
           System.out.println();
           return;
       }



        knightMove(chess, row - 2, col + 1, upcomingmove + 1);
        knightMove(chess, row - 1, col + 2, upcomingmove + 1);
        knightMove(chess, row + 1, col + 2, upcomingmove + 1);
        knightMove(chess, row + 2, col + 1, upcomingmove + 1);
        knightMove(chess, row + 2, col - 1, upcomingmove + 1);
        knightMove(chess, row + 1, col - 2, upcomingmove + 1);
        knightMove(chess, row - 1, col - 2, upcomingmove + 1);
        knightMove(chess, row - 2, col - 1, upcomingmove + 1);
        chess[row][col] = 0;

    }
 public static void display(int[][] chessboard){
        for(int i =0; i< chessboard.length; i++){
            for(int j = 0; j < chessboard.length; j++){
                System.out.print(chessboard[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
 }

}
