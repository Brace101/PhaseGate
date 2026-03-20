import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterCountTest {

    @Test
    void testExample() {
        String input = "AaaBBc";
        String expected = "A1a2B2c1";

        assertEquals(expected, CharacterCount.countCharacters(input));
    }
    
    @Test
    void testSingleCharacter() {
        assertEquals("a1", CharacterCount.countCharacters("a"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", CharacterCount.countCharacters(""));
    }

    @Test
    void testNoRepeats() {
        assertEquals("A1B1C1", CharacterCount.countCharacters("ABC"));
    }
}

