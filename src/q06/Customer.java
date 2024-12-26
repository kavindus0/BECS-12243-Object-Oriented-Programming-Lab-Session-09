package q06;


public class Customer {
    String customerID;
    String name;
    Room bookedRoom;

    public void bookRoom(Room bookedRoom) {
        if (bookedRoom.isAvailable){

        }
        this.bookedRoom = bookedRoom;
    }



    public Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }



}
