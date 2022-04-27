package fi.vamk.studentid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void sumTest() {
        assertEquals(4, App.sum(2, 2));
    }

    @Test
    public void divideTest() {
        assertEquals(1, App.divide(2, 2));
    }

    @Test
    public void returnTest() {
        assertEquals("ab", App.returnTwo("abc"));
    }

    @Test
    public void divideTest2() {
        assertEquals(1, App.divide(4,3));
    }

}
