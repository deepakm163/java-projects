package String;

public class Q3_Togge_Character {
    public static void main(String[] args){
        String str = "CODing";
         ToggleCharcter(str);
    }
    public static void ToggleCharcter(String str){
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                char Uc = (char)('A' + ch - 'a');
                sb.setCharAt(i, Uc);
            }else {
                char Lc = (char)('a' + ch - 'A');
                sb.setCharAt(i, Lc);
            }
        }
       System.out.println(sb);
    }
}
