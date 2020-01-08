package lab_5;

public class A
{
    protected String a;
    protected X x = new X("xxx");

    public A(String property, X x)
    {
        a = "A: " + property + x;
        this.x = x;
    }

    public void printState()
    {
        System.out.println("Current state: " + a);
        System.out.println("Current state: " + x.getX());
    }
}