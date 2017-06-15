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


}
