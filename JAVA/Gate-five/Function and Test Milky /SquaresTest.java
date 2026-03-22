import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class SquaresTest {

    @Test
    public void testSquares() {
        int[] expected = {1, 4, 9, 16, 25};
        assertArrayEquals(expected, Squares.squares(5));
    }

    @Test
    public void testSquaresWithThree() {
        int[] expected = {1, 4, 9};
        assertArrayEquals(expected, Squares.squares(3));
    }

    @Test
    public void testSquaresWithZero() {
        int[] expected = {};
        assertArrayEquals(expected, Squares.squares(0));
    }
}

