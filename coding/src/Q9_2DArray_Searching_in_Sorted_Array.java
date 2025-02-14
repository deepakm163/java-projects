import java.util.Scanner;

public class Q9_2DArray_Searching_in_Sorted_Array {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);

        int n = src.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = src.nextInt();
            }
        }

        int target = src.nextInt();

        int i = 0, j = arr.length - 1;


        while (i < arr.length && j >= 0){

               if(target == arr[i][j]){
                   System.out.println(i);
                   System.out.println(j);
                   return;
               } else if (target < arr[i][j]) {
                   j--;
               }
               else {
                   i++;
               }

        }
        System.out.println("Invalid input");
    }
}
