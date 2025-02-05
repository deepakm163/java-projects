import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class Q13_PrimeFactorization {
    public static void main(String[] args){
        int n = 10080;

        int i = 2;
        int temp = 0;
        int count = 0;
        while(true){
            if(n == 1) break;

            if(n % i == 0){
                if(temp != i){
                    temp = i;
                    count++;
                }
                System.out.print(i + " ");
                n = n / i;
                i = 1;
            }
            i++;
        }


//        int[] nums = {2,14,19,19,5,13,18,10,15,20};
//        int mul = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            mul = mul * nums[i];
//        }
//       System.out.println(mul);
//
//        int i = 2;
//        int temp = 0;
//        int count = 0;
//        while(true){
//            if(mul == 1) break;
//
//            if(mul % i == 0){
//                if(temp != i){
//                    temp = i;
//                    count++;
//                }
//
//                System.out.print(i + " ");
//                mul = mul / i;
//                i = 1;
//            }
//            i++;
//        }
//        System.out.println(count);
    }
}
