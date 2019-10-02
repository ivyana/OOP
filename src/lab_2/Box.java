package lab_2;

public class Box {
    public int height = 1;
    public int width = 1;
    public int depth = 1;

    public Box() {

    }

    public Box(int edge) {
        this.height = this.width = this.depth = edge;
    }

    public Box(int height,
               int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getVolume() {
        return height * width * depth;
    }

    public int getSurfaceArea() {
        return (height * width * 2 + height * depth * 2 + depth * width * 2);
    }

}
