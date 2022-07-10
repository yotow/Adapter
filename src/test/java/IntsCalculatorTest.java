import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class IntsCalculatorTest {
    @Test
    public void sumTest() {
        int expected = 2 * 2;
        Ints intsCalc = new IntsCalculator();
        int res = intsCalc.sum(2, 2);

        assertThat(expected, equalTo(res));
    }

    @Test
    public void powTest() {
        int expected = 2 * 2;
        Ints intsCalc = new IntsCalculator();
        int res = intsCalc.pow(2, 2);

        assertThat(expected, equalTo(res));
    }

    @Test
    public void multTest() {
        int expected = 2 * 2;
        Ints intsCalc = new IntsCalculator();
        int res = intsCalc.mult(2, 2);

        assertThat(expected, equalTo(res));
    }
}
