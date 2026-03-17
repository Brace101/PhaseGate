import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class Task2Test {

    @Test
    public void testIsEvenWithEvenNumber() {
        assertTrue(Task2.isEven(10), "10 should be even");
        assertTrue(Task2.isEven(0), "0 should be even");
        assertTrue(Task2.isEven(-4), "-4 should be even");
    }
    
    @Test
    public void testIsEvenWithOddNumber() {
        assertFalse(Task2.isEven(7), "7 should be odd");
        assertFalse(Task2.isEven(-3), "-3 should be odd");
        assertFalse(Task2.isEven(1), "1 should be odd");
    }
}
