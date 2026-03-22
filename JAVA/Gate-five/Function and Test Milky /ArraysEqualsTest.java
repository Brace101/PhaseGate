import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArraysEqualsTest {

    @Test
    public void testSameArrays() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        assertTrue(ArraysEquals.arrayEquals(a, b));
    }

    @Test
    public void testDifferentValues() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 4};

        assertFalse(ArraysEquals.arrayEquals(a, b));
    }

    @Test
    public void testDifferentLengths() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2};

        assertFalse(ArraysEquals.arrayEquals(a, b));
    }

    @Test
    public void testBothNull() {
        int[] a = null;
        int[] b = null;

        assertTrue(ArraysEquals.arrayEquals(a, b));
    }

    @Test
    public void testOneNull() {
        int[] a = {1, 2, 3};
        int[] b = null;

        assertFalse(ArraysEquals.arrayEquals(a, b));
    }

    @Test
    public void testEmptyArrays() {
        int[] a = {};
        int[] b = {};

        assertTrue(ArraysEquals.arrayEquals(a, b));
    }
}
