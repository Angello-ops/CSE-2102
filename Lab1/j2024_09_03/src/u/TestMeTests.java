package c;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMeTests {

    private TestMe testMe;

    @Before
    public void setUp() throws Exception {
        testMe = new TestMe();
    }

    @Test
    public void squareTest() {

        double baseValue = 4.0;
        double expected = baseValue * baseValue;
        testMe.setValue(3.0 + 1.0);  // Equivalent to 4.0
        double actual = testMe.square();

        // Use assertEquals with a delta for floating-point comparison
        assertEquals(expected, actual, 0.0001);
    }
}
