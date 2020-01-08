package lab_7;

public class Cube implements GeometricBody {
    private double length;
    Cube(double length){
        this.length=length;}

        public double getVolume(){
        return 6 * (length * length);
    }

        public double getSurface() {
        return length * length * length;
    }
    @Override
        public String toString() {
        return "Cube with volume: " + getVolume() + " and surface: " + getSurface();
    }

}
