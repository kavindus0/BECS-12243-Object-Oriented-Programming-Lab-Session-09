package q04;

public class TestAccount {

        public static void main(String[] args) {
            Account account1 = new Account("A013", "Alice", 1500);
            Account account2 = new Account("A014", "Bob", 500);
            System.out.println("Initial Balances:");
            account1.displayInfo();
            account2.displayInfo();
            System.out.println("Transferring 300 from Alice to Bob...");
            account1.transferTo(account2, 300);
            account1.displayInfo();
            account2.displayInfo();
            System.out.println("Transfer 2000 from Alice to Bob...");
            account1.transferTo(account2, 2000);
            account1.displayInfo();
            account2.displayInfo();
        }

}
