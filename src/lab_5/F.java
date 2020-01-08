package lab_5;

public class F extends E
{
    protected String f;

    public F(String property, X x)
    {
        super(property, x);
        f = "F: " + property;
    }

    public void printState()
    {
        System.out.println("Current state: " + f);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}