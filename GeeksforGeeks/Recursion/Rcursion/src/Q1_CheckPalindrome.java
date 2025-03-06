public class Q1_CheckPalindrome {
    public static void main(String[] args){
        String str = "123421";
        if(palindrome(str)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static boolean palindrome(String str){
        if(str.length() == 1 || str.length() == 0){
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }

        String ros = str.substring(1, str.length() - 1);
       boolean bool =  palindrome(ros);

        return bool;
    }
}
