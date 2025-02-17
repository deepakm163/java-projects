public class ML_Class_Works {
    public static void main(String[] args) {
        float[] x = {1,2,3,4,5};
        float[] y = {10,8,6,4,2};

        float xsum = sum(x);
        float ysum = sum(y);
        System.out.println("X_Sum = "+ xsum);
        System.out.println("Y_Sum = "+ ysum);



        float m = slope(x, xsum, y, ysum);
        System.out.println("Slope = " + m);


        float[] yp = new float[x.length];

        float c = ysum - (m * xsum);
        System.out.println("C == " + c);
        System.out.println();


        for(int i = 0; i < x.length; i++){
            yp[i] = (m * x[i]) + c;
            System.out.println("Y = " + m + " X " + x[i] + " + " + c + " = " + yp[i]);

        }
        System.out.println();

        float RSquare = rsquare(x,y, yp, ysum);
        System.out.println("R-Square == " + RSquare);

    }
    public static float rsquare(float[] x,float[] y, float[] yp, float ysum){
        float Sum_Square_ydiff = 0;
        float Sum_Square_yp_yDiff = 0;

        for(int i = 0; i < yp.length; i++){
            float ydiff = y[i] - ysum;
            float Square_ydiff = ydiff * ydiff;
            Sum_Square_ydiff += Square_ydiff;
            float yp_ydiff = yp[i] - ysum;
            Sum_Square_yp_yDiff += yp_ydiff * yp_ydiff;
            System.out.println(  x[i] + "\t\t" + y[i] + "\t\t"  + ydiff + "\t\t" + Square_ydiff + "\t\t" + yp[i] + "\t\t" + yp_ydiff + "\t\t" + Sum_Square_yp_yDiff);
        }
        System.out.println("Square(y-ysum) = " + Sum_Square_ydiff);
        System.out.println("Square(yp - ysum) = " + Sum_Square_yp_yDiff);

        float Rsquare = Sum_Square_yp_yDiff / Sum_Square_ydiff;
        return Rsquare;
    }

public static float slope(float[] x, float xsum, float[] y, float ysum){
        float Xdiff_Square = 0;
        float Sum_mull_XdiffYdiff = 0;
        for(int i = 0; i < x.length; i++){
            float xdiff = x[i] - xsum;
            float ydiff = y[i] - ysum;
            float xsquare = xdiff * xdiff;
            Xdiff_Square += xsquare;
            float mull_xdiff_ydiff = xdiff*ydiff;
           Sum_mull_XdiffYdiff += mull_xdiff_ydiff;

           System.out.println(x[i] + "\t\t" + y[i] + "\t\t" + xdiff + "\t\t" + ydiff + "\t\t" + xsquare + "\t\t" + mull_xdiff_ydiff);
        }
    System.out.println("Square(x-xsum) = " + Xdiff_Square);
    System.out.println("Square(x - xsum)X(y - ysum) = " + Sum_mull_XdiffYdiff);

    float m = (Sum_mull_XdiffYdiff) / Xdiff_Square;
        return m;
}
    public static float sum(float[] n) {
        float sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        return sum;
    }
}
