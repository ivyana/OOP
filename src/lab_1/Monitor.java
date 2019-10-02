package lab_1;

public class Monitor {
    public String color;
    public int dimension;
    public String resolution;

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
