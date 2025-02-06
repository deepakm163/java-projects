import java.util.Scanner;

public class Q5_2DArray_ExitPointOfMatrix {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int m = src.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0 ; i < n; i++){
            for (int j = 0; j < m; j++){
                arr[i][j] = src.nextInt();
            }
        }

        int i = 0, j = 0;
        int dir = 0;

        while(true){
            dir = (dir + arr[i][j]) % 4;
            if(dir == 0){
                j++;
            }else if (dir == 1){
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }

            if(i < 0){
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == arr.length) {
                i--;
                break;
            } else if (j == arr.length) {
                j--;
                break;
            }
        }

        System.out.println(i);
        System.out.println(j);
    }

}
