import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ParkingSlotTest{

    @Test
    public void testAllSlotsEmptyOnCreation(){      
            
        int[] actual = ParkingSlot.createParkingLot(20);

        assertEquals(20, actual.length);

        int[] expected = new int[20];
 
        assertArrayEquals(expected, actual);  
    }

    @Test
    public void testCarParkAutomatically() {

        int[] parkingSlots = new int[]{0, 2, 0};

        String actual = ParkingSlot.parkCarAutomatically(parkingSlots);

        String expected = "Car parked at slot 1";

        assertEquals(expected, actual);

        assertArrayEquals(new int[]{1, 2, 0}, parkingSlots);
    }
}

