package q04;


public class Account {
    private String name;
    private int balance = 0;

   private String id;

    public int credit(int balance) {
        this.balance += balance;
        return this.balance;
    }

    public String getId() {
        return id;
    }

    public int debit(int ammount) {
        if (this.balance >=ammount){
            this.balance -= ammount;
        } else {
            System.out.println( "Amount exceed balance");
        }
        return ammount;
    }
    public int transferTo(Account account,int ammount){
        if (this.balance >=ammount){
            account.credit(ammount);
            this.balance -= ammount;
        } else {
            System.out.println( "Amount exceed balance");
        }
        return ammount;

    }

    public void displayInfo() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(balance);
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }



}
