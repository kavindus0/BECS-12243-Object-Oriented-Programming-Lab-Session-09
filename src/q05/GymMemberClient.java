package q05;
public class GymMemberClient {
    public static void main(String[] args) {

        GymMember member1 = new GymMember("John Doe", 10);


        System.out.println("Booking 3 sessions...");
        member1.bookSession();
        member1.bookSession();
        member1.bookSession();


        member1.displayMemberInfo();

        member1.cancelSession();

        member1.displayMemberInfo();


        GymMember member2 = new GymMember();

        member2.displayMemberInfo();
    }
}
