package Recursion;

public class Q22_Permutation {
    public static void main(String[] args){
        String str = "abc";
        permutation(str, "");
    }
    public static void permutation(String str, String asf){
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
//            String ros = "";
//            if(i != 0){
//                ros += str.substring(0,i);
//            }
//            if(i+1 != str.length()){
//                ros += str.substring(i+1);
//            }
            String ros = str.substring(0,i) + str.substring(i+1);

            permutation(ros, asf + ch);
        }
    }
}
