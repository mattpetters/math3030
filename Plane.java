import java.util.*;
import java.io.*;

public class Plane {
	Point initialPoint;
	Vector normalVector;

	// Creates Plane with normalVector [0, 0, 0]
	// and initialPoint (0, 0, 0)
	public Plane() {
		initialPoint = new Point(0, 0, 0);
		normalVector = new Vector(0, 0, 0);
	}

	// Creates Plane with normalVector v and initialPoint p
	public Plane(Point p, Vector v) {
		initialPoint = p;
		normalVector = v;
	}

	// Changes the initialPoint of the Plane object to Point p
	public void setInitialPoint(Point p) {
		initialPoint = p;
	}

	// Changes the normalVector of the Plane object to Vector v
	public void setNormalVector(Vector v) {
		normalVector = v;
	}

	// Returns the initialPoint of the Plane that calls the method
	public Point getInitialPoint() {
		return initialPoint;
	}

	// Returns the normalVector of the Plane that calls the method
	public Vector getNormalVector() {
		return normalVector;
	}

	// Returns a String with the formula of the Plane in its standard form
	public String toString() {
		return 	normalVector.getI() + "(x - " + initialPoint.getX() + ") + " +
						normalVector.getJ() + "(y - " + initialPoint.getY() + ") + " +
						normalVector.getK() + "(x - " + initialPoint.getZ() + ") = 0";
	}
}
