import java.util.*;
import java.io.*;

public class Vector {
	double i, j, k;

  public Vector() {
    i = 0;
    j = 0;
    k = 0;
  }

  public Vector(double a, double b, double c) {
    i = a;
    j = b;
    k = c;
  }

  public void setI(double d) {
    i = d;
  }

  public void setJ(double d) {
    j = d;
  }

  public void setK(double d) {
    k = d;
  }

  public double getI() {
    return i;
  }

  public double getJ() {
    return j;
  }

  public double getK() {
    return k;
  }

  public Point getEndpoint(Point p) {
    return new Point(	p.getX() + i,
											p.getY() + j,
											p.getZ() + k
		);
  }

  public Point getInitialPoint(Point p) {
    return new Point(	p.getX() - i,
											p.getY() - j,
											p.getZ() - k
		);
  }

  public double getLength() {
    return Math.sqrt(i*i + j*j + k*k);
  }

	public Vector getUnitVector() {
		double mag = this.getLength();
		return new Vector(this.i / mag,
											this.j / mag,
											this.k / mag
		);
	}

  public double dotProduct(Vector v) {
    return 	(this.i * v.getI()) +
						(this.j * v.getJ()) +
						(this.k * v.getK()
		);
  }

  public Vector crossProduct(Vector v) {
    return new Vector(((this.j * v.getK()) - (this.k * v.getJ())),
											-((this.i * v.getK()) - (this.k * v.getI())),
											((this.i * v.getJ()) - (this.j * v.getI()))
		);
  }

	public double componentInDirection(Vector v) {
		double dProd = this.dotProduct(v);
		return dProd / v.getLength();
	}

	public Vector projectionInDirection(Vector v) {
		double comp = this.componentInDirection(v);
		Vector unit = v.getUnitVector();
		return new Vector(unit.getI() * comp,
		 									unit.getJ() *comp,
											unit.getK()*comp
		);
	}

	public String toString() {
		return "[" + i + ", " + j + ", " + k + "]";
	}
}
