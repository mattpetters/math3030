import java.util.*;
import java.io.*;

public class Point {
  double x, y, z;

  public Point() {
    x = 0;
    y = 0;
    z = 0;
  }

  public Point(double a, double b, double c) {
    x = a;
    y = b;
    z = c;
  }

  public void setX(double d) {
    x = d;
  }

  public void setY(double d) {
    y = d;
  }

  public void setZ(double d) {
    z = d;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double getZ() {
    return z;
  }
}
