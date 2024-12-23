package q06;



//            Customer

//+bookRoom(room:Room):void
//+ displayBookingDetails():void
//    If is Available true in Room class
//    call bookRoom() and assign bookedRoom as room print "[Customer Name] has booked room [Room Number]"
//            else print "Room [Room Number] is not available"
//    Display Customer ID, Customer Name, and
//if booked rooms
//    display room details
//else print "No room is Booked"
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
