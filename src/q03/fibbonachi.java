package q03;

public class fibbonachi {
    public int Fibbonachi(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;

        } else {
            return Fibbonachi(i-1) + Fibbonachi(i-2);

        }
    }
}
