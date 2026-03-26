import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DuplicateTest {

    @Test

    public void testForRemoveDuplicate (){

    int[] actual = RemoveDuplicate.removeDuplicates(9, 2, 3, 2, 1);

    int[] expected = {9, 3, 1};

    assertArrayEquals(expected, actual);
    }
}



