package lab_5;

public class H extends G
{
    protected String h;
    protected X x = new X("Z");

    public H(String property, X x)
    {
        super(property, x);
        h = "H: " + property + x;
    }

    public void printState()
    {
        System.out.println("Current state: " + h);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}
