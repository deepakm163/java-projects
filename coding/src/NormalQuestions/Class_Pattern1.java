public class Class_Pattern1 {
    public static void main(String[] args){
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n - i; j++){
                System.out.print("\t");
            }

            for(int j = 1; j <= 2*i + 1; j++){
                if(j == 1 || j == 2*i + 1 || i == n - 1 || j == (2*i  + 1) / 2 + 1){
                    System.out.print("X\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
