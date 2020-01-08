package lab_7;

public class Sphere implements GeometricBody {
    private double radius;
    Sphere(double radius){
        this.radius = radius;
    }

    public double getSurface(){
        return 4 * (float)Math.PI * (radius * radius);
    }

    public double getVolume(){
        return (4/3) * (float)Math.PI * (radius * radius * radius);
    }

    @Override
        public String toString() {
        return "Sphere with volume: " + getVolume() + " and surface: " + getSurface();
    }

}
