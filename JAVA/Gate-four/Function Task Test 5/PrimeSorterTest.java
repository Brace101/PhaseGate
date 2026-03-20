import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class PrimeSorterTest {

    @Test
    void testContainsOnlyPrimes() {
        int[] input = {5, -9, 3, 6, 2};
        int[] result = PrimeSorter.getSortedPrimes(input);

        for (int num : result) {
            assertTrue(PrimeSorter.isPrime(num));
        }
    }

    @Test
    void testNoNegativeNumbers() {
        int[] input = {5, -9, 3, 6, 2};
        int[] result = PrimeSorter.getSortedPrimes(input);

        for (int num : result) {
            assertTrue(num > 1);
        }
    }

    @Test
    void testSortedDescending() {
        int[] input = {5, -9, 3, 6, 2};
        int[] result = PrimeSorter.getSortedPrimes(input);

        for (int index = 0; index < result.length - 1; index++) {
            assertTrue(result[index] >= result[index + 1]);
        }
    }
}
