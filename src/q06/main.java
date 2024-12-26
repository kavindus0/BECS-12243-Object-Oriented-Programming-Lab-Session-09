package q06;

public class Main {
    public static void main(String[] args) {
         Room room101 = new Room("101", "Single", 1500.0);
        Room room102 = new Room("102", "Double", 2500.0);

        Customer alice = new Customer("C001", "Alice");
        Customer bob = new Customer("C002", "Bob");

        System.out.println("=== Initial Status ===");
        alice.displayBookingDetails();
        bob.displayBookingDetails();

        System.out.println("\n=== Alice books Room 101 ===");
        alice.bookRoom(room101);
        alice.displayBookingDetails();
        bob.displayBookingDetails();

        System.out.println("\n=== Bob attempts to book Room 101 ===");
        bob.bookRoom(room101);
        alice.displayBookingDetails();
        bob.displayBookingDetails();

        System.out.println("\n=== Alice releases Room 101 ===");
        alice.releaseRoom();
        alice.displayBookingDetails();
        bob.displayBookingDetails();

    }
}