import java.util.Scanner;

public class Q2_DP_Climb_Stair {
    public static void main(String[] args){
        int n = climb_stair(6);
        System.out.println(n);
    }

    // .................................Normal Recursion.........................................
//    public static int climb_stair(int n){
//        if(n == 0){
//            return 1;
//        }
//        if(n < 0){
//            return 0;
//        }
//
//        int nm1 = climb_stair(n-1);
//        int nm2 = climb_stair(n-2);
//        int nm3 = climb_stair(n-3);
//        int sum = nm1 + nm2 + nm3;
//        return  sum;
//    }

    //....................................Dynamic Programming Using Memorization.................

//    public static int climb_stair(int n, int[] QB){
//        if(n == 0){
//            return 1;
//        }
//        if( n < 0){
//            return 0;
//        }
//
//        if(QB[n] != 0){
//            return QB[n];
//        }
//        int nm1 = climb_stair(n-1, QB);
//        int nm2 = climb_stair(n-2, QB);
//        int nm3 = climb_stair(n-3, QB);
//        int sum = nm1 + nm2 + nm3;
//        QB[n] = sum;
//
//        return sum;
//    }

    // ................................Dynamic programming Using Tabulation.........................

    public static int climb_stair(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i <=n ; i++){
            if(i == 1){
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }

        return dp[n];
    }
}
