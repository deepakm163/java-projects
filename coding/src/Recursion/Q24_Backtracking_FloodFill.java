package Recursion;

import java.util.Scanner;

public class Q24_Backtracking_FloodFill {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int m = src.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j =0; j <arr[0].length; j++){
                arr[i][j] = src.nextInt();
            }
        }
        boolean[][] visted = new boolean[n][m];
        floodfill(arr, 0, 0, "", visted);
    }

    public static void floodfill(int[][] matrix, int row, int col, String asf, boolean[][] visited){
       if(row < 0 || col < 0 || row == matrix.length || col == matrix[0].length || matrix[row][col] == 1 || visited[row][col] == true){
           return;
       }

       if(row == matrix.length - 1  && col == matrix[0].length - 1){
           System.out.println(asf);
           return;
       }

        visited[row][col] = true;
        floodfill(matrix,row - 1, col,asf + "t",visited);
        floodfill(matrix,row , col - 1 ,asf + "l",visited);
        floodfill(matrix,row + 1, col,asf + "d",visited);
        floodfill(matrix,row , col + 1, asf + "r",visited);
        visited[row][col] = false;
    }
}
