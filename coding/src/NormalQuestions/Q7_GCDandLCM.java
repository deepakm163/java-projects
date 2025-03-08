public class Q7_GCDandLCM {
    public static void main(String[] args){
        int n1 =  36;
        int On1 =  n1;
        int n2 = 24;
        int On2 = n2;

        while(true){
            int r = n1 % n2;
            if(r == 0) break;
            n1 = n2;
            n2 = r;
        }

       int hcf = n2;
        int lcm  = (On2 * On1) / hcf;

        System.out.println(hcf);
        System.out.println(lcm);
    }
}
