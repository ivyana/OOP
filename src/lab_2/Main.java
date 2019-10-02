package lab_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");

        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(3, 4, 5);

        System.out.println("The surface area of box is: " + b3.getSurfaceArea() + "cm2");
        System.out.println("The volume of box is: " + b3.getVolume() + "cm3");

        System.out.println("\nTask 2:");

        LinkedQueue q1 = new LinkedQueue();
        LinkedQueue q2 = new LinkedQueue(3);

        System.out.println("\nFirst queue:");
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.pop();

        System.out.println("\n");
        q1.display();
        q1.getSize();
        q1.isEmpty();
        q1.isFull();

        System.out.println("\nSecond queue:");
        q2.push(1);
        q2.push(2);
        q2.push(3);
        q2.pop();


        System.out.println("\n");
        q2.display();
        q2.getSize();
        q2.isEmpty();
        q2.isFull();


    }
}


