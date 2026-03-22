import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {

    @Test
    public void testTargetFound() {
        int[] numbers = {10, 20, 30, 40, 50};
        int result = LinearSearch.linearSearch(numbers, 30);
        assertEquals(2, result);
    }

    @Test
    public void testTargetNotFound() {
        int[] numbers = {10, 20, 30, 40, 50};
        int result = LinearSearch.linearSearch(numbers, 99);
        assertEquals(-1, result);
    }

    @Test
    public void testFirstElement() {
        int[] numbers = {5, 10, 15};
        int result = LinearSearch.linearSearch(numbers, 5);
        assertEquals(0, result);
    }

    @Test
    public void testLastElement() {
        int[] numbers = {5, 10, 15};
        int result = LinearSearch.linearSearch(numbers, 15);
        assertEquals(2, result);
    }

    @Test
    public void testEmptyArray() {
        int[] numbers = {};
        int result = LinearSearch.linearSearch(numbers, 10);
        assertEquals(-1, result);
    }
}
