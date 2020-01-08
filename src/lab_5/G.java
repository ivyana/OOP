package lab_5;

public class G extends F
{
    public String g;

    public G(String property, X x)
    {
        super(property, x);
        g = "G: " + property;
    }

    public void printState()
    {
        System.out.println("Current state: " + g);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}