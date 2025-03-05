package Recursion;

public class Q21_ArrayList_PrintStairCase {
    public static void main(String[] args){
        int n = 3;
        stairPaths(n, "");
    }

    public static void stairPaths(int n , String path){
        if(n ==  0){
            System.out.println(path);
            return;
        }

        if(n < 0){
            return;
        }
        for(int i = 1; i <= 3; i++){
            stairPaths(n-i, path + i);
        }
    }
}
