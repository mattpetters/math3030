import java.util.*;
import java.io.*;

public class Line {
    Point initialPoint;
    Vector directionVector;

      // Creates a Line with initialPoint (0, 0, 0)
      // and directionVector [0, 0, 0]
      public Line() {
        initialPoint = new Point(0, 0, 0);
        directionVector = new Vector(0, 0, 0);
      }

      // Creates a Line with initialPoint initPt and directionVector dirVec
      public Line(Point initPt, Vector dirVec) {
          initialPoint = initPt;
          directionVector = dirVec;
      }

      // Changes the initialPoint of the Line to Point point
      public void setInitialPoint(Point point) {
        initialPoint = point;
      }

      // Changes the directionVector of the Line to Vector vector
      public void setDirectionVector(Vector vector) {
        directionVector = vector;
      }

      // Returns the initialPoint of the Line that calls this method
      public Point getInitialPoint() {
        return initialPoint;
      }

      // Returns the directionVector of the Line that calls this method
      public Vector getDirectionVector() {
        return directionVector;
      }

      // Returns a boolean value that tells whether or not the Line that calls
      // it contains Point point
      // True if point is on Line; False if point is not on Line
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

      // Returns a Plane that contains both the Line that calls the method
      // and Point p
      public Plane findParallelPlaneContains(Point p) {
    		if (this.containsPoint(p)) {
    			return null;
    		} else {
    			Vector v = p.findVectorTo(this.getInitialPoint());
    			Vector n = v.crossProduct(this.getDirectionVector());
    			return new Plane(p, n);
    		}
    	}

      // Returns a Plane that contains Point p and is perpedicular to
      // the Line that calls the method
      public Plane findPerpPlaneContPoint(Point p) {
    		return new Plane(p, this.getDirectionVector());
    	}

      // Returns a Line that contains Point p and is perpendicular to
      // the Line that calls the method
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

      // Returns a String with the formula of the Line in its parametric form
      public String toString() {
        return  "x = " + initialPoint.getX() + " + " + directionVector.getI() + "t\n" +
                "y = " + initialPoint.getY() + " + " + directionVector.getJ() + "t\n" +
                "z = " + initialPoint.getZ() + " + " + directionVector.getK() + "t";
      }
}
