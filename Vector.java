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
    Point endpoint = new Point();
    endpoint.setX(p.getX() + i);
    endpoint.setY(p.getY() + j);
    endpoint.setZ(p.getZ() + k);
    return endpoint;
  }

  public Point getInitialPoint(Point p) {
    Point initialPoint = new Point();
    initialPoint.setX(p.getX() - i);
    initialPoint.setY(p.getY() - j);
    initialPoint.setZ(p.getZ() - k);
  }

  public double getLength() {
    return Math.sqrt(i*i + j*j + k*k);
  }
  public double dotProduct(Vector v) {
    return (i * v.getI()) + (j * v.getJ()) + (k * v.getK());
  }

  public Vector crossProduct(Vector v) {
    Vector v = new Vector();
    v.setI((j * v.getK()) - (k*v.getJ());
  }
}
