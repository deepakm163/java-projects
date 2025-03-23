package Recursion;

public class Q30_Count_BinaryString_no_consicutive_0s {
    public static void main(String[] args){
        int n = 4;
        binaryString(n, 0, "");
    }

    public static void binaryString(int n, int bn, String str){
        if(n == 0) {
            System.out.println(str);
            return;
        }
            binaryString(n-1, 0, str + "1");
     if(bn == 0) {
         binaryString(n - 1, 1, str + "0");
     }
    }

}
