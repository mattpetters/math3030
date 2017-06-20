import java.util.*;
import java.io.*;

public class Point {
  double x, y, z;

  // Creates a Point with coordinates (0, 0, 0)
  public Point() {
    x = 0;
    y = 0;
    z = 0;
  }

  // Creates a Point with coordinates (a, b, c)
  public Point(double a, double b, double c) {
    x = a;
    y = b;
    z = c;
  }

  // Changes the X coordinate of the Point to d
  public void setX(double d) {
    x = d;
  }

  // Changes the Y coordinate of the Point to d
  public void setY(double d) {
    y = d;
  }

  // Changes the Z coordinate of the Point to d
  public void setZ(double d) {
    z = d;
  }

  // Returns the value of the X coordinate of the Point that calls this method
  public double getX() {
    return x;
  }

  // Returns the value of the X coordinate of the Point that calls this method
  public double getY() {
    return y;
  }

  // Returns the value of the X coordinate of the Point that calls this method
  public double getZ() {
    return z;
  }

  // Returns the Vector from the Point that calls this method to Point p
  public Vector findVectorTo(Point p) {
    return new Vector(p.getX() - this.x,
                      p.getY() - this.y,
                      p.getZ() - this.z
    );
  }

  // Returns the String representation of the Point that calls this method
  public String toString() {
    return "(" + x + ", " + y + ", " + z + ")";
  }
}
