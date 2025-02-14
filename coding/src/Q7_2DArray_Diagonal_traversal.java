import java.util.Scanner;

public class Q7_2DArray_Diagonal_traversal {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int m = src.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = src.nextInt();
            }
        }

        for(int gap = 0; gap < arr.length; gap++){

            for(int i = 0, j = gap ; j < arr[0].length; j++, i++){
                System.out.print(arr[i][j] + "\t");
            }

        }
    }
}
