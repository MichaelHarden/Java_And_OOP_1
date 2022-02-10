import java.util.ArrayList;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import java.text.DecimalFormat;

/**
 * Octahedron list creates a list of Octahedrons.
 * Contains methods that use the methods found in Octahedron class
 * to give data on each octahedron within the list.
 * 
 * @author Michael Harden
 * @version September 29, 2020
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
    * @return octahedronList
    */
   public ArrayList<Octahedron> getList() {
      return octahedronList;
   }

   /**
    * addOctahedron takes in the same params as a octahedron and adds 
    * that octahedron to the octahedronList.
    * 
    * @param labelIn String - label of octahedron
    * @param colorIn String - color of octahedron
    * @param edgeLengthIn Double - size of octaheddron edge
    */
   public void addOctahedron(String labelIn, String colorIn, 
      Double edgeLengthIn) {
      Octahedron octahedron = new Octahedron(labelIn, colorIn, edgeLengthIn);
      octahedronList.add(octahedron);
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
    * findOctahedron takes in a String. if that string is the label to 
    * an Octahedron contained in OctahedronList, then returns that Octahedron
    * if the string is not a label to any Octahedron returns null

    * @param labelIn String - label of Octahedron to find
    * @return octadron or null
    */
   public Octahedron findOctahedron(String labelIn) {
      for (int i = 0; i < numberOfOctahedrons(); i++) {
         Octahedron currentOctahedron = octahedronList.get(i);
         if (currentOctahedron.getLabel().toLowerCase().equals(labelIn
            .toLowerCase())) {
            return currentOctahedron;
         }
      }
      return null;
   }

   /**
    * deleteOctahedron removes the octahedron from OctahedronList
    * with the label, labelIn and returns the deleted Octahedron.
    * if octahedron is not found returns void.
    * @param labelIn String - label of octahedron to delete
    * @return Octahedron that is being deleted
    */
   public Octahedron deleteOctahedron(String labelIn) {
      Octahedron octahedronToDelete = findOctahedron(labelIn);
      if (octahedronToDelete != null) {
         octahedronList.remove(octahedronToDelete);
         return octahedronToDelete;
      } else { 
         return null; }
   }

   /**
    * editOctahedron finds the octahedron with the label of 'labelIn' 
    * contained in octahedronList and changes its color and edgeLength 
    * values to the values enterd.
    *
    * @param labelIn String - label of octahedron to edit
    * @param colorIn String - new color for octahedron 
    * @param edgeLengthIn Double - new length for edge
    * @return Octahedron
    */
   public Octahedron editOctahedron(String labelIn, String colorIn, 
      Double edgeLengthIn) {
      for (int i = 0; i < numberOfOctahedrons(); i++) {
         Octahedron currentOctahedron = octahedronList.get(i);
         if (currentOctahedron.getLabel().toLowerCase().equals(labelIn
            .toLowerCase())) {
            currentOctahedron.setColor(colorIn);
            currentOctahedron.setEdge(edgeLengthIn);
            octahedronList.set(i, currentOctahedron);
            return currentOctahedron;
         }
      }
      return null;
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
    * readFile scans file with the name of fileIn. 
    * If the file is empty then a empty OctahedronList is returned, otherwise
    * Octahedron list holds the data from the file.
    *
    * @param fileIn String - name of file to read
    * @return OctahedronList from file
    * @throws FileNotFoundException - throws if file is not foind
    */
   public OctahedronList readFile(String fileIn) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileIn));
   
      ArrayList<Octahedron> octahedrons = new ArrayList<Octahedron>();
      String fileName = "";
   
      if (scanFile.hasNext()) {
         fileName = scanFile.nextLine();
      }
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         String edge = scanFile.nextLine();
      
         Octahedron octa = new Octahedron(label, color, Double.parseDouble(
            edge));
         octahedrons.add(octa);
      }
      scanFile.close();
      
      OctahedronList octaList = new OctahedronList(fileName, octahedrons);
      return octaList;
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
