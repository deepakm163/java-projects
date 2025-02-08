package String;

public class Q2_String_Compression {
    public static void main(String[] args){

        String str = "aaabbbbcddeeef";
       String s1 = compression1(str);
       System.out.println(s1);
       String s2 =  compression2(str);
        System.out.println(s2);
    }
    public static String compression1(String str){
        String s = str.charAt(0) + "";
        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr != prev){
                s += curr;
            }
        }
        return s;
    }

    public static String compression2(String str){
        String s = str.charAt(0) + "";
        int count = 1;

        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev){
                count++;
            }
            else{
                if(count > 1){
                    s += count;
                    count = 1;
                }
                s += curr;
            }
        }
        return s;
    }

}
