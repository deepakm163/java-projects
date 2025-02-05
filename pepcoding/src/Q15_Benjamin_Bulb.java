import java.util.HashMap;
import java.util.Map;

public class Q15_Benjamin_Bulb {
    public static void main(String[] args){
//        int n = 36;
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i = 1; i <= n; i++){
//            for(int j = i; j <= n; j++){
//
//                if(i == 1){
//                    map.put(j,1);
//                }
//                else{
//
//                    if(j % i == 0){
//                        if(map.get(j) == 0){
//                            map.put(j,1);
//                        }
//                        else{
//                            map.put(j,0);
//                        }
//                    }
//                }
//            }
//        }
//
//        int val = 1;
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//            if (entry.getValue().equals(val)) {
//              System.out.println(entry.getKey());
//            }
//        }

        // above answer is Correct and Below is Optimize one

        int n = 36;
        for(int i = 1; i * i <= n; i++){
            System.out.println(i*i);
        }
    }
}
