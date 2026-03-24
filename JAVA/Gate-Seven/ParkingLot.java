public class ParkingLot {

    public int[] slots;

    public ParkingLot(int size) {
        slots = new int[size];
    }

    public int parkCar() {
        for (int index = 0; index < slots.length; index++) {
            if (slots[index] == 0) {
                slots[index] = 1;
                return index + 1; 
            }
        }
                 return -1; 
    }

    public boolean parkAtSlot(int slotNumber) {
        if (slotNumber >= 1 && slotNumber <= slots.length && slots[slotNumber - 1] == 0) {
            slots[slotNumber - 1] = 1;
            return true;
        }
        return false;
    }

    public boolean removeCar(int slotNumber) {
        if (slotNumber >= 1 && slotNumber <= slots.length && slots[slotNumber - 1] == 1) {
            slots[slotNumber - 1] = 0;
            return true;
        }
        return false;
    }

    public void displayStatus() {
        int available = 0;

        for (int slot : slots) {
            System.out.print(slot + " ");
            if (slot == 0) available++;
        }

        System.out.println("\nAvailable: " + available);
        System.out.println("Occupied: " + (slots.length - available));
    }
}
