package DynamicProgramming;

import java.util.Scanner;

public class Q12_DP_Arrange_Building {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        long building = 1;
        long space = 1;

        for(int i = 2; i <= n; i++){
            long new_building = space;
            long new_space = space + building;

            space = new_space;
            building = new_building;
        }

        long total = space + building;
        total = total * total;

        System.out.println(total);
    }
}
