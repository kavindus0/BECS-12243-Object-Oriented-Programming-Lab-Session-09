package q06;

public class Room {
    int roomNumber;
    String roomType;
    double pricePerNight;
    boolean isAvailable;

    public Room(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public void displayRoomDetails() {
        System.out.println( roomNumber);
        System.out.println( pricePerNight);
        System.out.println( isAvailable);
        System.out.println( roomType);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        if (isAvailable){
            System.out.println("Room has been booked");
        }else {
            System.out.println("Room is already booked");
        }
    }
    public void releaseRoom() {
        if (!isAvailable){
            System.out.println( "Room is now available");
        }else {
            System.out.println("Room is already available");
        }
    }
}
