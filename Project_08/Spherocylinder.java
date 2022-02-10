import java.text.DecimalFormat;

/**
 * Spherocylinder class creates an object Spherocylinder and has methods 
 * that can be preformed to find data based on each instance of the clsas.
 * 
 * @author Michael Harden
 * @version Oct 11, 2020
 */
public class Spherocylinder implements Comparable<Spherocylinder> {

// ---FIELDS---\

   // Instance Variables
   private String label = "";
   private double radius = 0;
   private double height = 0;

   // Static Variables
   private static int numberOfSpherocylinders = 0;

// ---CONSTRUCTOR---

   /**
    * Spherocylinder constructs a new instance of the Spherocylinder class.
    *
    * @param labelIn String - name of Spherocylinder
    * @param radiusIn double - radius of Spherocylinder
    * @param heightIn double - hight of Cylinder
    */
   public Spherocylinder(String labelIn, double radiusIn, double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(heightIn);
      numberOfSpherocylinders++;
   }

// ---METHODS---

   /**
    * The getLabel method gets the current value of label from Spherocylinder.
    *
    * @return String - Spherocylinder label
    */
   public String getLabel() {
      return label;
   }

   /**
    * The setLabel method sets the label of the Spherocylinder to the value 
    * entered and returns true if the value intered was valid and was able to 
    * set and false if the value intered was invalid and was not able to be set.
    *
    * @param labelIn String - name of Spherocylinder
    * @return boolean - status of label being set
    */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }

   /**
    * The getRadius method gets the current value of radius from Spherocylinder.
    * 
    * @return double - Spherocylinder radius
    */
   public double getRadius() {
      return radius;
   }

   /**
    * The setRadius method sets the radius of the Spherocylinder to the value 
    * entered and returns true if the value intered was valid and was able to 
    * set and false if the value intered was invalid and was not able to be set.
    *
    * @param radiusIn double - radius of Spherocylinder
    * @return boolean - status of radius being set
    */
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn >= 0) {
         radius = radiusIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
    * The getCylinderHeight method gets the current value of hight from 
    * Spherocylinder.
    * 
    * @return double - Cylinder hight
    */
   public double getCylinderHeight() {
      return height;
   }

   /**
    * The setCylinderHeight method sets the height of the Cylinder to the value 
    * entered and returns true if the value intered was valid and was able to 
    * set and false if the value intered was invalid and was not able to be set.
    *
    * @param heightIn double - height of Cylinder
    * @return boolean - status of height being set
    */
   public boolean setCylinderHeight(double heightIn) {
      boolean isSet = false;
      if (heightIn >= 0) {
         height = heightIn;
         isSet = true;
      }
      return isSet;
   }

   /**
    * The circumference method calculates the radius of the Spherocylinder and 
    * returns the calculated value.
    * @return double - circumference of Spherocylinder
    */
   public double circumference() {
      if (radius == 0) {
         return 0;
      }
      return (2 * Math.PI * radius);
   }

   /**
    * The surfaceArea method calculates the surface area of the Spherocylinder
    * and returns the calculated value.
    *
    * @return double - surface area of Spherocylinder
    */
   public double surfaceArea() {
      if (radius == 0) {
         return 0;
      } 
      return (circumference() * (2 * radius + height));
   }

    /**
    * The volume method calculates the volume of the Spherocylinder
    * and returns the calculated value.
    *
    * @return double - volume of Spherocylinder
    */
   public double volume() {
      if (radius == 0) {
         return 0.0;
      }
      return ((Math.PI * Math.pow(radius, 2)) * (
         (4.0 / 3.0) * radius + height));
   }

   /**
    * The equals method checks to see if the Object entered is a Spherocylinder
    * and if is not, returns faluse. If it is, then checks to see if the
    * object has the same field values. If it does, then returns true,
    * else returns faluse.
    *
    * @param obj Object - to compare
    * @return boolean - true if obj is equal | false if obj is not equal
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      }
      Spherocylinder d = (Spherocylinder) obj;
      return (label.equalsIgnoreCase(d.getLabel()) 
         && (Math.abs(radius - d.getRadius()) < .000001) 
         && (Math.abs(height - d.getCylinderHeight()) < .000001));
   }

   /**
    * Reuqired by checkstyle.
    @return 0 as int
    */
   public int hashCode() {
      return 0;
   }
   /**
    * The toString method returns a formatted string of all the info
    * about the Spherocylinder.
    *
    * @return String - formatted string of Spherocylinder data
    */
   public String toString() {
      DecimalFormat format = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "Spherocylinder \"" + label + "\" with radius " 
         + format.format(radius) +  " and cylinder height " 
         + format.format(height) + " has:\n\t";
      output += "circumference = " + format.format(circumference()) 
         + " units\n\t";
      output += "surface area = " + format.format(surfaceArea())
         + " square units\n\t";
      output += "volume = " + format.format(volume()) + " cubic units";
      return output;
   }

   /**
    * The compareTo method returns a interger from comparing volumes of 
    * instance to paramater.
    *    0 - volumes are the same
    *    1 - instance has bigger volume
    *    -1 - parameter has bigger volume
    * 
    * @param spherocylinder Spherocylinder - to compare to instance volume
    * @return int - value from comparison
    */
   public int compareTo(Spherocylinder spherocylinder) {
      if (Math.abs(this.volume() - spherocylinder.volume()) < 0.000001) {
         return 0;
      } else if (this.volume() > spherocylinder.volume()) {
         return 1;
      } else {
         return -1;
      }
      
   }

// ---STATIC METHODS---

  /**
    * The getCount method gets the current value of numberOfSpherocylinders 
    * from Spherocylinder.
    * 
    * @return int - number of Spherocylinder
    */
   public static int getCount() {
      return numberOfSpherocylinders;
   }
   
    /**
    * The resetCount method resets the current value of numberOfSpherocylinders 
    * from Spherocylinder to 0.
    */
   public static void resetCount() {
      numberOfSpherocylinders = 0;
   }

}