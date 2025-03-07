public class Q3_String_to_Number {
    public static void main(String[] arrgs){
        String str = "1234";
       int n =  stringtoNumbr(str, 1);
    }
    public static int stringtoNumbr(String str, int num){
        if(str.length() == 0){
            return num;
        }
        int firstindexnumber = str.charAt(0) - '0';
        String ros = str.substring(1);
        int rres = stringtoNumbr(ros, firstindexnumber);
        System.out.println(rres);
        return 0;


    }
}
