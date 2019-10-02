package lab_1;

public class Student {
    public String name;
    public int age;
    public double mark;

    public static double getAverage(double a[])
    {
        double sum = 0;

        for (int i = 0; i < a.length; i++)
            sum += a[i];

        return sum / a.length;
    }
}