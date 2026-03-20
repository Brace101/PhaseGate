import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReplaceNegativesTest {

    @Test
    void testReplaceNegativesWithZero() {
        int[] input = {5, -9, 3, -6, 2, -11};
        int[] expected = {5, 0, 3, 0, 2, 0};

        int[] result = ReplaceNegatives.replaceNegativesWithZero(input);

        assertArrayEquals(expected, result);
    }

    @Test
    void testAllNegatives() {
        int[] input = {-1, -2, -3};
        int[] expected = {0, 0, 0};

        int[] result = ReplaceNegatives.replaceNegativesWithZero(input);

        assertArrayEquals(expected, result);
    }

    @Test
    void testNoNegatives() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};

        int[] result = ReplaceNegatives.replaceNegativesWithZero(input);

        assertArrayEquals(expected, result);
    }
}
