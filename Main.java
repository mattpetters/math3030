import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);

      System.out.println("Input Point Coordinates : ");
      double x = kb.nextDouble();
      double y = kb.nextDouble();
      double z = kb.nextDouble();
      Point point = new Point(x, y, z);

      System.out.println("Input Line Initial Point Coordinates :");
      x = kb.nextDouble();
      y = kb.nextDouble();
      z = kb.nextDouble();
      Point initPt = new Point(x, y, z);

      System.out.println("Input Line Direction Vector :");
      x = kb.nextDouble();
      y = kb.nextDouble();
      z = kb.nextDouble();
      
      Vector dirVec = new Vector(x, y, z);

      /*Point point = new Point(Double.parseDouble(args[0]),
                              Double.parseDouble(args[1]),
                              Double.parseDouble(args[2])
      );

      Point initPt = new Point( Double.parseDouble(args[3]),
                                Double.parseDouble(args[4]),
                                Double.parseDouble(args[5])
      );
      Vector dirVec = new Vector( Double.parseDouble(args[6]),
                                  Double.parseDouble(args[7]),
                                  Double.parseDouble(args[8])
      );*/
      Line line = new Line(initPt, dirVec);

      if (line.containsPoint(point)) {
        System.out.println("(1) Line l contains point P.\n");

        System.out.println( "(2) Cannot find plane that contains " +
                            "point P and the line l.\n");

        Plane pi = line.findPerpPlaneContPoint(point);
        System.out.println( "(3) Plane containing point P perpendicular " +
                            "to line l :\n" + pi + "\n");

        System.out.println( "(4) Cannot find the line that contains point " +
                            "P perpendicular to line l.");
      } else {
        System.out.println("(1) The line does not contain the point.\n");

        Plane pi = line.findParallelPlaneContains(point);
        System.out.println( "(2) Plane that contains line l and point P :\n" +
                            pi + "\n");

        pi = line.findPerpPlaneContPoint(point);
        System.out.println( "(3) Plane perpendicular to line l that contains " +
                            "point P :\n" + pi + "\n");

        Line perpLine = line.findPerpLineContPoint(point);
        System.out.println( "(4) Line perpendicular to line l containing " +
                            "point P :\n" + perpLine + "\n");
      }
    }
}
