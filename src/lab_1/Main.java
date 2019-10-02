package lab_1;

public class Main {
    public static void main(String[] args) {

        Monitor m1 = new Monitor();
        m1.color = "black";
        m1.dimension = 13;//inches
        m1.resolution = "1280x800";

        Monitor m2 = new Monitor();
        m2.color = "black";
        m2.dimension = 17;//inches
        m2.resolution = "1280x1024";

        System.out.println("Task 1:");

        int result = Monitor.getMax(m1.dimension, m2.dimension);
        if (result == m1.dimension) {
            System.out.println("First monitor in larger.");
        }
        else {
            System.out.println("Second monitor in larger.");
        }

        if (m1.color.equals(m2.color)) {
            System.out.println("Monitors have the same color.");
        }
        else {
            System.out.println("Monitors have different colors.");
        }

        if (m1.resolution.equals(m2.resolution)) {
            System.out.println("Monitors have the same resolution.");
        }
        else {
            System.out.println("Monitors have different resolution.");
        }

        System.out.println("\nTask 2-3:");

        Student s1 = new Student();
        s1.name = "A";
        s1.age = 16;
        s1.mark = 8.5;

        Student s2 = new Student();
        s2.name = "B";
        s2.age = 16;
        s2.mark = 7.2;

        Student s3 = new Student();
        s3.name = "C";
        s3.age = 17;
        s3.mark = 10;

        Student s4 = new Student();
        s4.name = "D";
        s4.age = 17;
        s4.mark = 6.75;

        Student s5 = new Student();
        s5.name = "E";
        s5.age = 16;
        s5.mark = 9.95;

        Student s6 = new Student();
        s6.name = "F";
        s6.age = 17;
        s6.mark = 8.2;

        University u1 = new University();
        u1.name = "X";
        u1.foundationYear = 1963;
        u1.students[0] = s1;
        u1.students[1] = s3;

        University u2 = new University();
        u2.name = "Y";
        u2.foundationYear = 1970;
        u2.students[0] = s4;
        u2.students[1] = s6;

        University u3 = new University();
        u3.name = "Z";
        u3.foundationYear = 1989;
        u3.students[0] = s2;
        u3.students[1] = s5;


        double[] a1 = {u1.students[0].mark, u1.students[1].mark};
        double avg1 = Student.getAverage(a1);
        System.out.println("Average mark in the first university is: " + avg1);

        double[] a2 = {u2.students[0].mark, u2.students[1].mark};
        double avg2 = Student.getAverage(a2);
        System.out.println("Average mark in the first university is: " + avg2);

        double[] a3 = {u3.students[0].mark, u3.students[1].mark};
        double avg3 = Student.getAverage(a3);
        System.out.println("Average mark in the first university is: " + avg3);

        double[] array = {avg1, avg2, avg3};
        double totalAvg =  Student.getAverage(array);
        System.out.println("Total average mark in universities is: " + totalAvg);
    }
}