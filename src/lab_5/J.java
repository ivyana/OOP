package lab_5;

public class J extends I
{
    protected String j;

    public J(String property, X x)
    {
        super(property, x);
        j = "J: " + property;
    }

    public void printState()
    {
        System.out.println("Current state: " + j);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}