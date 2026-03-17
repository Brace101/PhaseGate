import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {

    @Test
    public void testAddNumbers() {
       
        assertEquals(8, Task1.addNumbers(5, 3));

        assertEquals(-2, Task1.addNumbers(-5, 3));

        assertEquals(5, Task1.addNumbers(5, 0));

        assertEquals(-8, Task1.addNumbers(-5, -3));
    }
}


