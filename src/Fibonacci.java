import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    public double evenFibonacciSum (double limit){
        double a = 1;
        double b = 2;
        double sum = 0;
        while (sum+b<limit){
            double c = a;
            if (b%2 == 0){
                sum+=b;
            }
            a = b;
            b += c;
        }
        return sum;
    }

    public static void printSum (){
        double a = 1;
        double b = 2;
        double sum = 0;
        ArrayList<Double> fib = new ArrayList();
        while (sum<4000000){
            double c = a;
            if (b%2 == 0){
                sum+=b;
                fib.add(b);
            }
            a = b;

            b += c;
        }
        System.out.println(Arrays.toString(fib.toArray()));
        System.out.println(sum);
    }
}
