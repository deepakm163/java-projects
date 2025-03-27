package DynamicProgramming;

import java.util.Scanner;

public class Q16_DP_Paint_fence {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int k = src.nextInt();

        long same = k;
        long different = k * (k-1);
        long total = same + different;

        for(int i = 3; i <= n; i++){
            same = different;
            different = total * (k-1);
            total = same + different;
        }

        System.out.println(total);
    }
}
