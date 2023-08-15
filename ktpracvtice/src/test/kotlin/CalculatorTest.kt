import org.junit.jupiter.api.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun testSumOfTwoNumbers() {
        assert(calculator.sum(2,2) == 4)
    }

    @Test
    fun testSubtractionOfTwoNumbers() {
        assert(calculator.sub(2,2) == 0)
    }

    @Test
    fun testSubtractionOfTwoNegNumbers() {
        assert(calculator.sub(-2,-2) == 0)
    }
}