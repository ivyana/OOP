package lab_5;

public class B extends A
{
    protected String b;

    public B(String property, X x)
    {
        super(property, x);
        b = "B: " + property;
    }

    public void printState()
    {
        System.out.println("Current state: " + b);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}

