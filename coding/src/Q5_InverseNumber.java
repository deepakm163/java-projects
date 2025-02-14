public class Q5_InverseNumber {
    public static void main(String[] args){
        // length of number

        int num = 28346751;
        int Original_num = num;
        int len = (int)Math.log10(num) + 1;

        // compression of Orinal sum And Sum

        int Original_sum = (len * (len + 1)) / 2;
        int sum = 0;
        while (Original_num > 0){
            sum = sum + Original_num % 10;
            Original_num /= 10;
        }

        // return if sum is not matched;

        if(Original_sum != sum){
            return;
        }
        int i = 1;
        int result = 0;
        while(num > 0){
            int r = num % 10;
            result = result + (int)Math.pow(10, r-1) * i;
            i++;
            num = num / 10;
        }
        System.out.println(result);
    }
}
