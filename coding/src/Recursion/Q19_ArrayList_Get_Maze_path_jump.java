package Recursion;

import java.util.Scanner;

public class Q19_ArrayList_Get_Maze_path_jump {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int row = src.nextInt();
        int col = src.nextInt();

        printMazePaths(1,1,row,col,"");
    }

    public static void printMazePaths(int r, int c, int row, int col, String path){
        if(r == row && c == col){
            System.out.println(path);
            return;
        }

        for(int m = 1; m <= col - c; m++){
            printMazePaths(r, c + m, row, col, path + "h" + m);
        }

        for(int m = 1; m <= row - r; m++){
            printMazePaths(r + m, c, row, col, path + "v" + m);
        }

        for(int m = 1; m <= row - r && m <= col - c; m++){
            printMazePaths(r + m , c + m, row, col, path + "d" + m);
        }
    }
}
