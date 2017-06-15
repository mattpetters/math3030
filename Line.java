import java.util.*;
import java.io.*;

public class Line {
    Point initialPoint;
    Vector directionVector;

    
      public Line() {
        x = 0;
        y = 0;
        z = 0;
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

      public void getInitialPoint() {
        return initialPoint;
      }

      public double getDirectionVector() {
        return directionVector;
      }

      public boolean containsPoint(Point point) {
        double xValue = ((point.getX() - initialPoint.getX() )/ directionVector.getI());
        double yValue = ( (point.getY() - initialPoint.getY() )/ directionVector.getJ());
        double zValue = ( (point.getZ() - initialPoint.getZ() )/ directionVector.getK());
        return false;
      }

}
