package lab_5;

public class D extends C
{
    protected String d;
    protected X x = new X("Y");

    public D(String property, X x)
    {
        super(property, x);
        d = "D: " + property+x;
    }

    public void printState()
    {
        System.out.println("Current state: " + d);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}
