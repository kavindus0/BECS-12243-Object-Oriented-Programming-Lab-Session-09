package q06;


//            + isAvailable():boolean
//+ getRoomNumber().int
//    If is Available true
//            false isAvailable and print " else print
//    If is Available false
//            true isAvailable and print "Room is now available" else print "Room is already available"
//    Display Room Number, Room Type, Price per Night, and Availability

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
