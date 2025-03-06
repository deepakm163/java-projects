public class Q2_PrintPossibleStringLength_K {
    public static void main(String[] rags){
        char[] set = {'a', 'b', 'c', 'd'};
        int k = 1;
        possibleString(set, "", k);

    }
    public static void possibleString(char[] set, String str, int k){
        if(k == 0){
            System.out.println(str);
            return;
        }

        for(int i = 0; i < set.length; i++){
            char ch = set[i];
            possibleString(set, str + ch, k - 1);
        }
    }
}
