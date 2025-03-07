package Recursion;

public class Q23_Print_Encoding {
    public static void main(String[] args){
        String str = "12103";
        Printencoding(str, "");
    }

    public static void Printencoding(String str, String asf){

        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        int chi1 = str.charAt(0) - '0';
        char code1 = (char)('a' + chi1 - 1);
        String rosa1 = str.substring(1);
        String str12 = str.substring(0,2);
        int chi12 = Integer.parseInt(str12) - '0';
        Printencoding(rosa1, asf + code1);

        if(chi12 <= 26){
            char code12 = (char)('a' + chi12 - 1);
            String rosa12 = str.substring(2);
            Printencoding(rosa12, asf + code12);
        }
    }
}
