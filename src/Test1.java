import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test1 {
    @Test
    void whenSetLimit_shouldReturnLessThenLimit () {
        Fibonacci underTest = new Fibonacci();

        double evenSum = underTest.evenFibonacciSum(4000000);

        Assertions.assertTrue(evenSum<4000000);
    }

    @Test
    void sum_shouldBeEven(){
        Fibonacci underTest = new Fibonacci();

        double evenSum = underTest.evenFibonacciSum(4000000);

        Assertions.assertTrue(evenSum%2==0);
    }

}

