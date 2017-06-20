import java.util.*;
import java.io.*;

public class Plane {
	Point initialPoint;
	Vector normalVector;

	public Plane() {
		initialPoint = new Point(0, 0, 0);
		normalVector = new Vector(0, 0, 0);
	}

	public Plane(Point p, Vector v) {
		initialPoint = p;
		normalVector = v;
	}

	public void setInitialPoint(Point p) {
		initialPoint = p;
	}

	public void setNormalVector(Vector v) {
		normalVector = v;
	}

	public Point getInitialPoint() {
		return initialPoint;
	}

	public Vector getNormalVector() {
		return normalVector;
	}

	public String toString() {
		return 	normalVector.getI() + "(x - " + initialPoint.getX() + ") + " +
						normalVector.getJ() + "(y - " + initialPoint.getY() + ") + " +
						normalVector.getK() + "(x - " + initialPoint.getZ() + ") = 0";
	}
}
