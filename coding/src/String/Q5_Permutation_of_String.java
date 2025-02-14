package String;

public class Q5_Permutation_of_String {
    public static void main(String[] args){
        String str = "abc";
        int n = str.length();
        int f = factorial(n);

        for(int i = 0 ; i < f; i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int div = n; div >= 1; div--){
                int q = temp / div;
                int r = temp % div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i = n; i > 1 ; i--){
            fact *= i;
        }
        return fact;
    }
}
