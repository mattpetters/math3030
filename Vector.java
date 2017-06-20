import java.util.*;
import java.io.*;

public class Vector {
	double i, j, k;

	// Creates a Vector with direction [0, 0, 0]
  public Vector() {
    i = 0;
    j = 0;
    k = 0;
  }

	// Creates a Vector with direction [a, b, c]
  public Vector(double a, double b, double c) {
    i = a;
    j = b;
    k = c;
  }

	// Changes the value of the Vector in the X direction to d
  public void setI(double d) {
    i = d;
  }

	// Changes the value of the Vector in the Y direction to d
  public void setJ(double d) {
    j = d;
  }

	// Changes the value of the Vector in the Z direction to d
  public void setK(double d) {
    k = d;
  }

	// Returns the value of the Vector that calls this method in the X direction
  public double getI() {
    return i;
  }

	// Returns the value of the Vector that calls this method in the Y direction
  public double getJ() {
    return j;
  }

	// Returns the value of the Vector that calls this method in the Z direction
  public double getK() {
    return k;
  }

	// Returns a Point that is the endpoint of the Vector from initial Point p
  public Point getEndpoint(Point p) {
    return new Point(	p.getX() + i,
											p.getY() + j,
											p.getZ() + k
		);
  }

	// Returns a Point that is the initial point of the vector from end Point p
  public Point getInitialPoint(Point p) {
    return new Point(	p.getX() - i,
											p.getY() - j,
											p.getZ() - k
		);
  }

	// Returns the length of the Vector that calls this method
  public double getLength() {
    return Math.sqrt(i*i + j*j + k*k);
  }

	// Returns the unit Vector of the Vector that calls this method
	public Vector getUnitVector() {
		double mag = this.getLength();
		return new Vector(this.i / mag,
											this.j / mag,
											this.k / mag
		);
	}

	// Returns the dot product of the Vector that calls this method and Vector v
  public double dotProduct(Vector v) {
    return 	(this.i * v.getI()) +
						(this.j * v.getJ()) +
						(this.k * v.getK()
		);
  }

	// Returns the cross product of the Vector that calls this method
	// and Vector v
  public Vector crossProduct(Vector v) {
    return new Vector(((this.j * v.getK()) - (this.k * v.getJ())),
											-((this.i * v.getK()) - (this.k * v.getI())),
											((this.i * v.getJ()) - (this.j * v.getI()))
		);
  }

	// Returns the component of the Vector that calls this function in
	// the direction of Vector v
	public double componentInDirection(Vector v) {
		double dProd = this.dotProduct(v);
		return dProd / v.getLength();
	}

	// Returns the projection of the Vector that calls this function in
	// the direction of Vector v
	public Vector projectionInDirection(Vector v) {
		double comp = this.componentInDirection(v);
		Vector unit = v.getUnitVector();
		return new Vector(unit.getI() * comp,
		 									unit.getJ() *comp,
											unit.getK()*comp
		);
	}

	// Returns the String representation of the Vector that calls this method
	public String toString() {
		return "[" + i + ", " + j + ", " + k + "]";
	}
}
