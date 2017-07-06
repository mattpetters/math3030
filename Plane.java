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
		String output = "";

		output = output + normalVector.getI() + "(x";
		if (initialPoint.getX() >= 0) {
			output = output + " - " + initialPoint.getX() + ")";
		} else {
			output = output + " + " + -initialPoint.getX() + ")";
		}

		if (normalVector.getJ() >= 0) {
			output = output + " + " + normalVector.getJ() + "(y";
		} else {
			output = output + " - " + -normalVector.getJ() + "(y";
		}

		if (initialPoint.getY() >= 0) {
			output = output + " - " + initialPoint.getY() + ")";
		} else {
			output = output + " + " + -initialPoint.getY() + ")";
		}

		if (normalVector.getK() >= 0) {
			output = output + " + " + normalVector.getK() + "(z";
		} else {
			output = output + " - " + -normalVector.getK() + "(z";
		}

		if (initialPoint.getZ() >= 0) {
			output = output + " - " + initialPoint.getZ() + ") = 0";
		} else {
			output = output + " + " + -initialPoint.getZ() + ") = 0";
		}
		return output;
	}
}
