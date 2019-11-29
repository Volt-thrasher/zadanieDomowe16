public class Calculator {
    public int sqrSum (int amount) {
        int sum = 0;
        for (int i = 1; i <= amount; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    public int sumSqr (int amount){
        int sum = 0;
        for (int i = 1; i <=amount; i++) {
            sum+=i;
        }
        sum = sum*sum;
        return sum;
    }

    public int sumsDifference (int amount){
        int sum1 = sqrSum(amount);
        int sum2 = sumSqr(amount);
        int diff = sum2 - sum1;
        return diff;
    }
}
