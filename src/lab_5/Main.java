package lab_5;

public class Main
{
    static public void main(String[] args)
    {
        J j = new J("propagated property", new X("X"));
        j.printState();
    }
}
