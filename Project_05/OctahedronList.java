import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * Octahedron list creates a list of Octahedrons.
 * Contains methods that use the methods found in Octahedron class
 * to give data on each octahedron within the list.
 * 
 * @author Michael Harden
 * @version September 23, 2020
 */
public class OctahedronList {

   // Fields
   private String name = "";
   private ArrayList<Octahedron> octahedronList = new ArrayList<Octahedron>();

   // Constructors

   /**
    * Constructs instance of OctahedronList Class.
    *
    * @param nameIn String to set to name of Octahedrons
    * @param octahedronListIn OctahedronList containing Octahedrons
    */
   public OctahedronList(
      final String nameIn, 
      final ArrayList<Octahedron> octahedronListIn) {
      name = nameIn;
      octahedronList = octahedronListIn;
   }

   // Methods
   /**
    * returns name of octahedron.
    *
    * @return Octahedron's name
    */
   public String getName() {
      return name;
   }

   /**
    * returns number of octahedrons in the Octahedron list.
    *
    * @return number of octahedrons
    */
   public int numberOfOctahedrons() {
      if (octahedronList.isEmpty()) {
         return 0;
      } else {
         return octahedronList.size();
      }
   }

   /**
    * returns total surface area of each octahedron in list.
    *
    * @return total surface area
    */
   public double totalSurfaceArea() {
      double surfaceArea = 0.0;
      if (numberOfOctahedrons() != 0) {
         int i = 0;
         while (i < numberOfOctahedrons()) {
            surfaceArea += octahedronList.get(i).surfaceArea();
            i++;
         }
      }
      return surfaceArea;
   }

   /**
    * returns total volume of each octahedron in list.
    *
    * @return total volume
    */
   public double totalVolume() {
      double volume = 0.0;
      if (numberOfOctahedrons() != 0) {
         int i = 0;
         while (i < numberOfOctahedrons()) {
            volume += octahedronList.get(i).volume();
            i++;
         }
      }
      return volume;
   }

   /**
    * returns average surface area from each octahedron in list.
    *
    * @return average surface area
    */
   public double averageSurfaceArea() {
      if (numberOfOctahedrons() == 0) {
         return 0.0;
      }
      return totalSurfaceArea() / numberOfOctahedrons();
   }

   /**
    * returns average volume from each octahedron in list.
    *
    * @return average volume
    */
   public double averageVolume() {
      if (numberOfOctahedrons() == 0) {
         return 0.0;
      }
      return totalVolume() / numberOfOctahedrons();
   }

   /**
    * returns the ratio between average volume and average surface area
    * from octahedrons in list.
    *
    * @return ratio between surface area and volume
    */
   public double averageSurfaceToVolumeRatio() {
      if (totalVolume() == 0 || totalSurfaceArea() == 0) {
         return 0.0;
      } else {
         int i = 0;
         double totalSurface = 0.0;
         while (i < numberOfOctahedrons()) {
            totalSurface += octahedronList.get(i).surfaceToVolumeRatio();
            i++;
         }
         return totalSurface / numberOfOctahedrons();
      }
   }

   /**
    * returns data for each octahedron in a formatted way.
    *
    * @return string about the Octahedron
    */
   public String toString() {
   
      String output = name;
   
      if (numberOfOctahedrons() != 0) {
         output += "\n";
         int i = 0;
         while (i < numberOfOctahedrons()) {
            output += "\n";
            output += octahedronList.get(i).toString();
            output += "\n";
            i++;
         }
      } else { 
         output += "\n"; 
      } 
      return output;
   }

   /**
    * returns summery of the Octahedron List.
    *
    * @return summery about list
    */
   public String summaryInfo() {
      DecimalFormat format = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + name + " -----";
      output += "\nNumber of Octahedrons: " + numberOfOctahedrons();
      output += "\nTotal Surface Area: " + format.format(totalSurfaceArea());
      output += "\nTotal Volume: " + format.format(totalVolume());
      output += "\nAverage Surface Area: " 
         + format.format(averageSurfaceArea());
      output += "\nAverage Volume: " + format.format(averageVolume());
      output += "\nAverage Surface/Volume Ratio: " 
         + format.format(averageSurfaceToVolumeRatio());
      return output;
   }
}
