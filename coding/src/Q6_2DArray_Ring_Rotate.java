import java.util.Scanner;

public class Q6_2DArray_Ring_Rotate {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int m = src.nextInt();
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = src.nextInt();
            }
        }
        int s = src.nextInt();
        int r = src.nextInt();

        Rotateshell(arr, s, r);
        display(arr);
    }
    public static void Rotateshell(int[][] arr, int s, int r){
        int[] oned = FillfromShell(arr, s);

        Rotate_oned(oned, r);
        FillIntoShell(arr, s, oned);
    }

    public static int[] FillfromShell(int[][] arr, int s){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;

        int sz = 2 * (maxr - minr + maxc - minc);
        int idx = 0;
        int[] oned = new int[sz];

        // left Wall
        for (int i = minr, j = minc; i <= maxr; i++){
              oned[idx] = arr[i][j];
              idx++;
        }

        // BOTTOM wall

        for(int i = maxr, j = minc;  j <= minc + 1; j++){
            oned[idx] = arr[i][j];
            idx++;
        }

        // Right Wall

        for (int i = maxr - 1, j = maxc; i >= minr ; i--){
            oned[idx] = arr[i][j];
            idx++;
        }

        // Top Wall

        for (int i = minr, j = maxc - 1; j >= minc + 1; j--){
            oned[idx] = arr[i][j];
            idx++;
        }

        return oned;
    }

    public static void Rotate_oned(int[] oned, int r){
        r = r % oned.length;
        if(r < 0){
            r = r + oned.length;
        }

        Reverse(oned, 0, oned.length - r - 1);
        Reverse(oned, oned.length - r, oned.length - 1);
        Reverse(oned, 0, oned.length - 1);

    }

    public static void Reverse(int[] oned, int i, int j){
        while(i < j){
            int temp = oned[i];
            oned[i] = oned[j];
            oned[j] = temp;
            i++;
            j--;
         }
    }

    public static void FillIntoShell(int[][] arr, int s, int[] oned){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int idx = 0;


        // left Wall
        for (int i = minr, j = minc; i <= maxr; i++){
            arr[i][j] = oned[idx];
            idx++;
        }

        // BOTTOM wall

        for(int i = maxr, j = minc;  j <= minc + 1; j++){
            arr[i][j] = oned[idx];
            idx++;
        }

        // Right Wall

        for (int i = maxr - 1, j = maxc; i >= minr ; i--){
            arr[i][j] = oned[idx];
            idx++;
        }

        // Top Wall

        for (int i = minr, j = maxc - 1; j >= minc + 1; j--){
            arr[i][j] = oned[idx];
            idx++;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr[0].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
