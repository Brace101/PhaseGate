import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CountEvensTest {

    @Test
    public void testCountEvenNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int result = CountEvens.countEvenNumbers(input);
        assertEquals(3, result);
    }

    @Test
    public void testAllEvenNumbers() {
        int[] input = {2, 4, 6, 8};
        int result = CountEvens.countEvenNumbers(input);
        assertEquals(4, result);
    }

    @Test
    public void testNoEvenNumbers() {
        int[] input = {1, 3, 5, 7};
        int result = CountEvens.countEvenNumbers(input);
        assertEquals(0, result);
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int result = CountEvens.countEvenNumbers(input);
        assertEquals(0, result);
    }

    @Test
    public void testSingleElement() {
        int[] input = {2};
        int result = CountEvens.countEvenNumbers(input);
        assertEquals(1, result);
    }
} 
