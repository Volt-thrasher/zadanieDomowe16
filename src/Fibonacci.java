public class Fibonacci {
    public int evenFibonacciSum(int limit) {
        int num1 = 1;
        int num2 = 2;
        int sum = 0;
        while (num2 < limit) {
            int a = num1;
            if (num2 % 2 == 0) {
                sum += num2;
            }
            num1 = num2;
            num2 += a;
        }
        return sum;
    }
}
