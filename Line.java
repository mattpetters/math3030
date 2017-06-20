import java.util.*;
import java.io.*;

public class Line {
    Point initialPoint;
    Vector directionVector;


      public Line() {
        initialPoint = new Point(0, 0, 0);
        directionVector = new Vector(0, 0, 0);
      }

      public Line(Point initPt, Vector dirVec) {
          initialPoint = initPt;
          directionVector = dirVec;
      }

      public void setInitialPoint(Point point) {
        initialPoint = point;
      }

      public void setDirectionVector(Vector vector) {
        directionVector = vector;
      }

      public Point getInitialPoint() {
        return initialPoint;
      }

      public Vector getDirectionVector() {
        return directionVector;
      }

      public boolean containsPoint(Point point) {
        double xValue = ((point.getX() - initialPoint.getX() )/ directionVector.getI());
        double yValue = ( (point.getY() - initialPoint.getY() )/ directionVector.getJ());
        double zValue = ( (point.getZ() - initialPoint.getZ() )/ directionVector.getK());
        if ((xValue != yValue) || (xValue != zValue) || (yValue != zValue)) {
           return false;
        } else {
         return true;
        }
      }

      public Plane findParallelPlaneContains(Point p) {
    		if (this.containsPoint(p)) {
    			return null;
    		} else {
    			Vector v = p.findVectorTo(this.getInitialPoint());
    			Vector n = v.crossProduct(this.getDirectionVector());
    			return new Plane(p, n);
    		}
    	}

      public Plane findPerpPlaneContPoint(Point p) {
    		return new Plane(p, this.getDirectionVector());
    	}

      public Line findPerpLineContPoint(Point p) {
        if (this.containsPoint(p)) {
          return null;
        } else {
          Vector v = p.findVectorTo(this.getInitialPoint());
          Vector parallelDist = v.projectionInDirection(this.getDirectionVector());
          Point m = parallelDist.getInitialPoint(this.getInitialPoint());
          Vector perpVector = m.findVectorTo(p);
          return new Line(p, perpVector);
        }
      }

      public String toString() {
        return  "x = " + initialPoint.getX() + " + " + directionVector.getI() + "t\n" +
                "y = " + initialPoint.getY() + " + " + directionVector.getJ() + "t\n" +
                "z = " + initialPoint.getZ() + " + " + directionVector.getK() + "t";
      }
}
