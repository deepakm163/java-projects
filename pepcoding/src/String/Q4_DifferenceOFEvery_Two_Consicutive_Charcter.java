package String;

public class Q4_DifferenceOFEvery_Two_Consicutive_Charcter {
    public static void main(String[] args){
        String str = "asdFGHJ";
        System.out.println(Consecutive_Difference(str));
    }

    public static String Consecutive_Difference(String str){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length()-1; i++){
            int gap = str.charAt(i+1) - str.charAt(i);
            sb.append(str.charAt(i));
            sb.append(gap);
        }
        sb.append(str.charAt(str.length() - 1));
        return sb.toString();
    }
}
