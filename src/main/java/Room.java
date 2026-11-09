public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // Getter for numberOfBeds
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Boolean getter for occupied
    public boolean isOccupied() {
        return occupied;
    }

    // Boolean getter for dirty
    public boolean isDirty() {
        return dirty;
    }

    // Returns true only if the room is not occupied and not dirty
    public boolean isAvailable() {
        return !occupied && !dirty;
    }
}
