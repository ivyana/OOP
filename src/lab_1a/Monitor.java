package lab_1a;

public class Monitor {
    public String color;
    public int dimension;
    public String resolution;

    public Monitor(String color,
                   int dimension, String resolution)
    {
        this.color = color;
        this.dimension = dimension;
        this.resolution = resolution;
    }

    public String getColor()
    {
        return color;
    }

    public int getDimension()
    {
        return dimension;
    }

    public String getResolution()
    {
        return resolution;
    }
}
