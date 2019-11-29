import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator underTest;

    @BeforeEach
    void createCalc() {
        underTest = new Calculator();
    }

    @Test
    void sumSqr_shouldBeBiggerThan_sqrSum() {
        Assertions.assertTrue(underTest.sumSqr(100) > underTest.sqrSum(100));
    }

    @Test
    void differenceFor100_shouldEqual25164150() {
        Assertions.assertEquals(underTest.sumsDifference(100), 25164150);
    }

    @Test
    void sqrSumFor100_shouldEqual338350(){
        Assertions.assertEquals(underTest.sqrSum(100),338350);
    }
}