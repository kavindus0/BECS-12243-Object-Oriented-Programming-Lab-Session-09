package q06;


public class Customer {
    String customerID;
    String name;
    Room bookedRoom;

    public void bookRoom(Room room) {
        if (room.isAvailable()) {
            this.bookedRoom = room;
            room.setAvailable(false);
            System.out.println(this.name + " has booked room " + room.getRoomNumber());
        } else {
            System.out.println("Room " + room.getRoomNumber() + " is not available");
        }
    }

    public void displayBookingDetails() {
        System.out.println(customerID);
        System.out.println(name);
        if (bookedRoom == null) {
            System.out.println("No Room is Booked");
        }else {
            System.out.println("Booked Room : " + bookedRoom);
        }

    }



    public Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }



}
