import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MoveZerosTest {

    @Test
    void testMoveZerosMixed() {
        int[] input = {5, 0, 3, 0, 2, 0};
        int[] expected = {5, 3, 2, 0, 0, 0};

        assertArrayEquals(expected, MoveZeros.moveZerosToEnd(input));
    }

    @Test
    void testAllZeros() {
        int[] input = {0, 0, 0};
        int[] expected = {0, 0, 0};

        assertArrayEquals(expected, MoveZeros.moveZerosToEnd(input));
    }

    @Test
    void testNoZeros() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 3};

        assertArrayEquals(expected, MoveZeros.moveZerosToEnd(input));
    }

    @Test
    void testZerosAtStart() {
        int[] input = {0, 0, 1, 2};
        int[] expected = {1, 2, 0, 0};

        assertArrayEquals(expected, MoveZeros.moveZerosToEnd(input));
    }
}
