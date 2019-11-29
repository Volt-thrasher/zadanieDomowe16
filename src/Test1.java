import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1 {
    private Fibonacci underTest;
    @BeforeEach
    void createFibonacci() {
        underTest = new Fibonacci();
    }

    @Test
    void whenSetLimit_shouldReturnLessThenLimit() {
        //when
        int evenSum = underTest.evenFibonacciSum(4000000);
        //then
        MatcherAssert.assertThat(evenSum, CoreMatchers.is(4613732));
    }

    @Test
    void sum_shouldBeEven() {
        //when
        int evenSum = underTest.evenFibonacciSum(4000000);
        //then
        MatcherAssert.assertThat(evenSum % 2,CoreMatchers.is(0));
    }
}

