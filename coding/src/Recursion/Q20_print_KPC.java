package Recursion;

import java.util.Scanner;

public class Q20_print_KPC {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        String num = src.next();
        printKPC(num, "");
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKPC(String ques, String ans){
       if(ques.length() == 0){
           System.out.println(ans);
           return;
       }

       char ch = ques.charAt(0);
       String ros = ques.substring(1);

       String codesforchar = codes[ch - '0'];
       for(int i = 0; i < codesforchar.length(); i++){
           char code = codesforchar.charAt(i);
           printKPC(ros,ans + code);
       }
    }
}
