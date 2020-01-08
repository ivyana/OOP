package lab_5;

public class I extends H
{
    protected String i;

    public I(String property, X x)
    {
        super(property, x);
        i = "I: " + property;
    }

    public void printState()
    {
        System.out.println("Current state: " + i);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}
