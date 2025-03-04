package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Q19_b_ArrayList_Maze_Jump {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int m = src.nextInt();

        ArrayList<String> paths = MazeJumpPath(1,1,n,m);
        System.out.println(paths);
     }
     public static ArrayList<String> MazeJumpPath(int sr, int sc, int dr, int dc){
        if(sc == dc && sr == dr){
            ArrayList<String> bress = new ArrayList<>();
            bress.add("");
            return bress;
        }

        ArrayList<String> paths = new ArrayList<>();

        for(int ms = 1; ms <= dc - sc; ms++){
            ArrayList<String> hpaths = MazeJumpPath(sr, sc + ms, dr, dc);
            for(String hpath: hpaths){
                paths.add("h" + ms + hpath);
            }
        }

        for(int ms = 1; ms <= dr - sr; ms++){
            ArrayList<String> vpaths = MazeJumpPath(sr + ms, sc, dr, dc);
            for(String vpath: vpaths){
                paths.add("v" + ms + vpath);
            }
        }

         for(int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++){
             ArrayList<String> dpaths = MazeJumpPath(sr + ms, sc + ms, dr, dc);
             for(String dpath: dpaths){
                 paths.add("d" + ms + dpath);
             }
         }
         return paths;
     }
}
