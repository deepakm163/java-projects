package DynamicProgramming;

import java.util.Scanner;

public class Q13_DP_Maximum_Sum_No_adjacent_Subsequence {

    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = src.nextInt();
        }
  /// ...................... methods are wrong..............


//        int[] dp = new int[n];
//        for(int i = 0; i < dp.length; i++){
//            if(i >= 2){
//                dp[i] = arr[i] + dp[i-2];
//            }
//            else {
//                dp[i] = arr[i];
//            }
//        }
//        System.out.println(dp[n-1]);
//
//        for(int i = 2; i < n; i++){
//            arr[i] = arr[i] + arr[i-2];
//        }
//        int max = 0;
//        for(int i = 0; i < n; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println(max);

         int inc = arr[0];
        int exc = 0;

        for(int i = 1; i < arr.length; i++){
            int ninc = exc + arr[i];
            int nexc = Math.max(inc, exc);

            inc = ninc;
            exc = nexc;
        }

        System.out.println(inc + exc);
    }
}
