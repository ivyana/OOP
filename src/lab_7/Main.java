package lab_7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricBody> geometricBodies = new ArrayList <> ();
        GeometricBody sphere = new Sphere (2);
        GeometricBody cube = new Cube (2.5);
        GeometricBody parallelepiped = new Parallelepiped (2,6,2);
        geometricBodies.add (sphere);
        geometricBodies.add (cube);
        geometricBodies.add(parallelepiped);
        System.out.println ("Geometric body with the biggest surface is: "+GeometricBodyController.getTheBiggestSurface(geometricBodies) );
        System.out.println ("Geometric body with the biggest volume  is: "+GeometricBodyController.getTheBiggestVolume (geometricBodies) );
    }
}
