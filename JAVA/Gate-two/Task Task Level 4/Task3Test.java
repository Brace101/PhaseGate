import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {

    @Test
    public void testSquareWithPositiveNumber() {
        assertEquals(49, Task3.square(7));
    }

    @Test
    public void testSquareWithZero() {
        assertEquals(0, Task3.square(0));
    }

    @Test
    public void testSquareWithNegativeNumber() {
        assertEquals(25, Task3.square(-5));
    }
}




