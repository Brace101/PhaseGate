public class ParkingSlot{

public static int[] createParkingLot(int size){

    int[] parkingSlots = new int[size];

    for(int slotIndex = 0; slotIndex < parkingSlots.length; slotIndex++){

       parkingSlots[slotIndex] = 0;
        }
        return parkingSlots;
    }

public static String parkCarAutomatically(int[] parkingSlots) {

    for (int slotIndex = 0; slotIndex < parkingSlots.length; slotIndex++) {

        if (parkingSlots[slotIndex] == 0) {

            parkingSlots[slotIndex] = 1;

            return "Car parked at slot " + (slotIndex + 1);
        }
    }

    return "Parking is full";
}
}
