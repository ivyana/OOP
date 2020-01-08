package lab_5;

public class C extends B
{
    protected String c;

    public C(String property, X x)
    {
        super(property, x);
        c = "C: " + property;
    }

    public void printState()
    {
        System.out.println("Current state: " + c);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}