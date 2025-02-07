import java.util.Scanner;

public class Q8_2dArray_Saddle_Point {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);

        int n = src.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = src.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            int svj = 0;
            for(int j = 1; j < n; j++){
                if(arr[i][svj] > arr[i][j]){
                    svj = j;
                }
            }

            boolean flag = true;
            for(int k = i; k < n; k++){
                if(arr[i][svj] < arr[k][svj]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid Saddle Point");
    }
}
