package lab_1a;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args)
    {
        Monitor m1 = new Monitor("black", 13, "1280x800");
        Monitor m2 = new Monitor("gray", 17, "1280x800");

        System.out.println("Task 1:");

        int result = getMax(m1.dimension, m2.dimension);

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

        Student s1 = new Student("A",20, 5.62);
        Student s2 = new Student("B",21, 8.41);
        Student s3 = new Student("C",19, 7.54);
        Student s4 = new Student("D",20, 10);
        Student s5 = new Student("E",20, 6.99);
        Student s6 = new Student("F",18, 9.11);

        University u1 = new University("X", 1981, new Student[]{s1, s4});
        University u2 = new University("Y", 1978, new Student[]{s2, s6});
        University u3 = new University("Z", 1989, new Student[]{s3, s5});


        double avg1 = getAverage(getArrMarks(u1));
        System.out.println("Average mark in the first university is: " + avg1);

        double avg2 = getAverage(getArrMarks(u2));
        System.out.println("Average mark in the first university is: " + avg2);

        double avg3 = getAverage(getArrMarks(u3));
        System.out.println("Average mark in the first university is: " + avg3);

        double[] array = {avg1, avg2, avg3};
        double totalAvg =  getAverage(array);
        System.out.println("Total average mark in universities is: " + totalAvg);

    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double[] getArrMarks(University u) {
        List<Double> arr = new ArrayList<>();
        ListIterator<Double> listIterator = arr.listIterator();

        for (int i = 0; i < u.students.length; ++i) {
            listIterator.add(u.students[i].mark);
        }
        double[] array = new double[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }
        return array;
    }

    public static double getAverage(double a[])
    {
        double sum = 0;

        for (int i = 0; i < a.length; i++)
            sum += a[i];

        return sum / a.length;
    }

    public static double getStudentsAverageMark(University university) {
        Student[] students = university.students;

        double sum = 0;
        for (Student student : students) {
            sum += student.mark;
        }

        return sum / students.length;
    }

}