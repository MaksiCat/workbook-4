public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void checkIn() {
        if (!isAvailable()) {
            System.out.println("Room is not available for check-in.");
        } else {
            isOccupied = true;
            isDirty = true;
            System.out.println("Guest checked in.");
        }
    }

    public void checkOut() {
        if (!isOccupied) {
            System.out.println("Room is not occupied.");
        } else {
            isOccupied = false;
            System.out.println("Guest checked out. Room now needs cleaning.");
        }
    }

    public void cleanRoom() {
        isDirty = false;
        System.out.println("Room cleaned.");
    }
}
