package q02;


public class q02 {
//2. Explain step-by-step how the following method executes when called with gcd(36, 60):
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
