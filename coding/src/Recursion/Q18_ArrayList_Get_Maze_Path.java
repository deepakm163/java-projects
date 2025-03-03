package Recursion;

import java.util.Scanner;

public class Q18_ArrayList_Get_Maze_Path {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int row = src.nextInt();
        int col = src.nextInt();

        printMazePath(1,1,row,col, "");
    }

    public static void printMazePath(int r, int c, int row, int col, String path) {

        if(r > row || c > col){
            return;
        }

        if(r == row && c == col){
            System.out.println(path);
            return;
        }
        printMazePath(r, c + 1, row, col, path + "h");
        printMazePath(r + 1, c, row, col, path + "v");

    }
}
