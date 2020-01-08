package lab_5;

public class E extends D
{
    public String e;

    public E(String property, X x)
    {
        super(property, x);
        e = "E: " + property;
    }

    public void printState()
    {
        System.out.println("Current state: " + e);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}
