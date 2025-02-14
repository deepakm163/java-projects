package String;

public class Q1_PrintAll_Palendrome_Substring {
    public static void main(String[] args){
        String s = "abccbe";

        for(int i = 0; i <s.length(); i++){
            for(int j = i+1; j < s.length(); j++){
                String ss = s.substring(i, j);
                if(IsPalendrome(ss) == true){
                    System.out.println(ss);
                }
            }
        }
    }

    public static boolean IsPalendrome(String str){
        int i = 0;
        int j = str.length() - 1;

        while (i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
