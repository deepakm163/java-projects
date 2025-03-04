package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Q18_b_Maze_Path {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int m = src.nextInt();

        ArrayList<String> paths = MazePath(1,1,n,m);
        System.out.println(paths);
    }

    public static ArrayList<String> MazePath(int sr, int sc, int dr, int dc){

        if(sc == dc && sr == dr){
            ArrayList<String> bress = new ArrayList<>();
            bress.add("");
            return bress;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if(sc < dc){
            hpaths = MazePath(sr, sc + 1, dr, dc);
        }
        if(sr < dr){
            vpaths = MazePath(sr + 1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for(String hpath : hpaths){
            paths.add("h" + hpath);
        }
        for(String vpath: vpaths){
            paths.add("v" + vpath);
        }
        return paths;
      }
}
