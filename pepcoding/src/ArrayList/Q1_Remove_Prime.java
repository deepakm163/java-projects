package ArrayList;

import java.util.ArrayList;

public class Q1_Remove_Prime {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(12);
        list.add(13);
        list.add(15);

        int n = list.size();

        for(int i = n -1; i >= 0; i--){
            int val = list.get(i);

            if(isPrime(val) == true){
                list.remove(i);
            }
        }

       System.out.println(list);
    }
    public static boolean isPrime(int n){
        for(int i = 2; i * i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
