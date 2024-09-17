import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

/* The purpose of this lab is to learn the Unit Circle and how to use it to answer trig problems.
 * It has been designed to show the exact value for the radian measures and coordinates that are
 * irrational numbers due to including pi or a radical. You won't be calling Java's trig functions!
 * Because of the purpose, in the lab all int angle measures represent degrees and double angle 
 * measures represent radians, despite the fact that you can have a fractional number of degrees.
 */
public class UnitCircle
{
   public static final ArrayList<Integer> anglesInDegrees = new ArrayList<>();
   public static final ArrayList<Double>  anglesInRadians = new ArrayList<>();
   public static final ArrayList<UnitCirclePoint> points = new ArrayList<>();
   
   static {
      Collections.addAll(anglesInDegrees, new Integer[] {0, 30, 45, 60, 90, 120, 135, 150, 180, 210, 225, 240, 270, 300, 315, 330});
      Collections.addAll(anglesInRadians, new Double[] {0.0, PI/6, PI/4, PI/3, PI/2, 2*PI/3, 3*PI/4, 5*PI/6, PI,
                                                         7*PI/6, 5*PI/4, 4*PI/3, 3*PI/2, 5*PI/3, 7*PI/4, 11*PI/6});
                // [0.0, 0.5235987755982988, 0.7853981633974483, 1.0471975511965976, 1.5707963267948966, 2.0943951023931953, 2.356194490192345, 2.6179938779914944, 3.141592653589793, 
                //  3.665191429188092, 3.9269908169872414, 4.1887902047863905, 4.71238898038469, 5.235987755982989, 5.497787143782138, 5.759586531581287]
   
      points.add(new UnitCirclePoint(  0,      "0",          0.0,          "1",          "0",         "0"));
      points.add(new UnitCirclePoint( 30,   "pi/6",    PI/6,  "sqrt(3)/2",        "1/2", "sqrt(3)/3"));
      points.add(new UnitCirclePoint( 45,   "pi/4",    PI/4,  "sqrt(2)/2",  "sqrt(2)/2",         "1"));
      points.add(new UnitCirclePoint( 60,   "pi/3",    PI/3,        "1/2",  "sqrt(3)/2",   "sqrt(3)"));
   
      points.add(new UnitCirclePoint( 90,   "pi/2",    PI/2,          "0",          "1",  "undefined"));
      points.add(new UnitCirclePoint(120,  "2pi/3",  2*PI/3,       "-1/2",  "sqrt(3)/2",   "-sqrt(3)"));
      points.add(new UnitCirclePoint(135,  "3pi/4",  3*PI/4, "-sqrt(2)/2",  "sqrt(2)/2",         "-1"));
      points.add(new UnitCirclePoint(150,  "5pi/6",  5*PI/6, "-sqrt(3)/2",        "1/2", "-sqrt(3)/3"));
   
      points.add(new UnitCirclePoint(180,     "pi",      PI,         "-1",          "0",          "0"));
      points.add(new UnitCirclePoint(210,  "7pi/6",  7*PI/6, "-sqrt(3)/2",       "-1/2",  "sqrt(3)/3"));
      points.add(new UnitCirclePoint(225,  "5pi/4",  5*PI/4, "-sqrt(2)/2", "-sqrt(2)/2",          "1"));
      points.add(new UnitCirclePoint(240,  "4pi/3",  4*PI/3,       "-1/2", "-sqrt(3)/2",    "sqrt(3)"));
   
      points.add(new UnitCirclePoint(270,  "3pi/2",  3*PI/2,          "0",         "-1",   "undefined"));
      points.add(new UnitCirclePoint(300,  "5pi/3",  5*PI/3,        "1/2", "-sqrt(3)/2",    "-sqrt(3)"));
      points.add(new UnitCirclePoint(315,  "7pi/4",  7*PI/4,  "sqrt(2)/2", "-sqrt(2)/2",          "-1"));
      points.add(new UnitCirclePoint(330, "11pi/6", 11*PI/6,  "sqrt(3)/2",       "-1/2",  "-sqrt(3)/3"));
      points.add(new UnitCirclePoint(360,    "2pi",    2*PI,          "1",          "0",           "0"));
   }     
   
   // USE AN ITERATOR to loop through the list of UnitCirclePoints and print each one.
   public static void printValues() {
   
   }
   
   // Return a string listing all quadrantal angles in degrees
   // in the range [0, 360]
   public static String listQuadrantalAnglesInDegrees() {
      return "";
   }

   // Return a string listing all quadrantal angles in degrees
   // in the range [0, 360]
   public static String listQuadrantalAnglesInRadians() {
      return "";
   }
   
   // Determine whether the given angles are coterminal.
   // Assume angle measures are in degrees.
   public static boolean areCoterminal(int angle1, int angle2) {
      return false;
   }

   // Determine whether the given angles are coterminal.
   // Assume angle measures are in radians.
   public static boolean areCoterminal(double angle1, double angle2) {
      return false;
   }

   // Find the angle in range [0, 360) that is coterminal with 
   // the given angle (in degrees).
   public static int coterminalIn0to360(int angle) {
      return 0;
   }
   
   // Find the angle in range [0, 360) that is coterminal with 
   // the given angle (in radians).
   public static double coterminalIn0to360(double angle) {
      return 0;
   }
      
   // The reference angle is the positive angle in [0, 90]
   // that reperesents the amount of rotation from the closest
   // side of the x-axis to the terminal ray of the angle.
   // Assume angle is in degrees.
   public static int referenceAngle(int angle) {
         return 0;
   }
   
   // The reference angle is the positive angle in [0, 90]
   // that reperesents the amount of rotation from the closest
   // side of the x-axis to the terminal ray of the angle.
   // Assume angle is in radians.
   public static int referenceAngle(double angle) {
         return 0;
   }
   
   public static String cos(int angle) {
      //angle = coterminalIn0to360(angle);
      int angleLoc = anglesInDegrees.indexOf(angle);
      if (angleLoc == -1)
         return "Not on Unit Circle";
      return "";  //points.get(angleLoc).????;  //<--replace ???? and uncomment.
   }
  
   public static String cos(double angle) {
      return cos( (int)Math.toDegrees(angle) );
   }
         
   public static String sin(int angle) {
      //angle = coterminalIn0to360(angle);
      int angleLoc = anglesInDegrees.indexOf(angle);
      if (angleLoc == -1)
         return "Not on Unit Circle";     
      return "";  //points.get(angleLoc).????;  //<--replace ???? and uncomment.
   }      
 
   public static String sin(double angle) {
      return sin( (int)Math.toDegrees(angle) );
   }
   
   public static String tan(int angle) {
      angle = coterminalIn0to360(angle);
      int angleLoc = anglesInDegrees.indexOf(angle);
      if (angleLoc == -1)
         return "Not on Unit Circle";
      return "";  //points.get(angleLoc).????;  //<--replace ???? and uncomment.
   }      
     
   public static String tan(double angle) {
      return tan( (int)Math.toDegrees(angle) );
   }
      
   // Compare two angles using this formula:
   //
   //     |x - y|
   //  -------------  <= epsilon
   //  max(|x|, |y|)
   //
   // where epsilon is usually set to 1E-14 (i.e. 10^-14)
   public static boolean approximatelyEqual(double angle1, double angle2) {
      return false;
   }

   //Helper functions:
   
      static String getNamedValueAtAngle(int angle, String value) {
      int angleLoc = anglesInDegrees.indexOf( angle );
      if (angleLoc == -1)
         return "Not on Unit Circle";
      UnitCirclePoint point = points.get(angleLoc);
      try {
         return point.getClass().getField(value).get(point).toString(); 
      }
      catch (ReflectiveOperationException e) {
         out.println("That field doesn't exist for a UnitCirclePoint object.");
         return "";
      }
   }

   static String getNamedValueAtAngle(double angle, String value) {
      int angleLoc = indexOfDouble(angle);
      if (angleLoc == -1)
         return "Not on Unit Circle";
      UnitCirclePoint point = points.get(angleLoc);
      try {
         return point.getClass().getField(value).get(point).toString(); 
      }
      catch (ReflectiveOperationException e) {
         out.println("That field doesn't exist for a UnitCirclePoint object.");
         return "";
      }
   }
   
   private static int indexOfDouble(double angle) {
      for (int i=0; i<anglesInRadians.size(); ++i) {
         Double d = anglesInRadians.get(i);
         if (Math.abs(angle - d) <= 1E-6)
            return i;
      }
      return -1;
   }
}