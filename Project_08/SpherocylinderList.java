import java.text.DecimalFormat;

/**
 * SphyerocylinderList creates a list of Sphyrocylinders.
 * 
 * @author Michael Harden
 * @version Oct 26, 2020
 */
public class SpherocylinderList {

   // ---FIELDS---

   private String name = "";
   private Spherocylinder[] spherocylinders;
   private int numberOfSpherocylinders = 0;

   // ---Constructors---

   /**
    * SpherocylinderList Method constructs a new instance of the 
    * SpherocylinderList class.
    *
    * @param nameIn                    String - name of List
    * @param spherocylindersIn         Spherocylinder - list of Spherocylinders
    * @param numberOfSpherocylindersIn int - number of Spherocylinders in List
    */
   public SpherocylinderList(String nameIn, 
      Spherocylinder[] spherocylindersIn, int numberOfSpherocylindersIn) {
      name = nameIn;
      spherocylinders = spherocylindersIn;
      numberOfSpherocylinders = numberOfSpherocylindersIn;
   }

   // ---Methods---

   /**
    * The getName method gets the name of the SpherocylinderList.
    *
    * @return String - current value of name
    */
   public String getName() {
      return name;
   }

   /**
    * The getList method gets the spherocylinders list from SpherocylinderList.
    *
    * @return String - spherocylinders list
    */
   public Spherocylinder[] getList() {
      return spherocylinders;
   }

   /**
    * The addSpherocylinder method adds a Spherocylinder to the spherocylinders
    * list.
    *
    * @param labelIn  String - label of new Spherocylinder
    * @param radiusIn double - radias of cylinder for new Spherocylinder
    * @param heightIn double - height of cylinder for new Spherocylinder
    */
   public void addSpherocylinder(
      String labelIn, double radiusIn, double heightIn) {
   
      Spherocylinder spherocylinderToAdd = new Spherocylinder(
         labelIn, radiusIn, heightIn);
      Spherocylinder[] newList = new Spherocylinder[
         numberOfSpherocylinders + 1];
      for (int i = 0; i < numberOfSpherocylinders; i++) {
         newList[i] = spherocylinders[i];
      }
      newList[numberOfSpherocylinders] = spherocylinderToAdd;
      spherocylinders = newList;
      numberOfSpherocylinders++;
   }

   /**
    * The findSpherocylinder method finds and returns the Spherocylinder in
    * spherocylinders list that contains the label entered. If it does not exist
    * will return null.
    *
    * @param labelIn String - name of Spherocylinder to find
    * @return Spherocylinder - Sphyrocylinder with label macthing labelIn
    */
   public Spherocylinder findSpherocylinder(String labelIn) {
      for (Spherocylinder spherocylinder : spherocylinders) {
         if (spherocylinder == null) {
            continue;
         }
         if (spherocylinder.getLabel().toLowerCase().equals(
            labelIn.trim().toLowerCase())) {
            return spherocylinder;
         }
      }
      return null;
   }

   /**
    * The deleteSpherocylinder method deletes the Spherocylinder in the
    * spherocylinders list that contains the label entered, and returns that
    * Spherocylinder. if nothing is found, returns null and nothing is deleted.
    *
    * @param labelIn String - label of Spherocylinder to delete
    * @return Spherocylinder - Spherocylinder to deleted
    */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
      Spherocylinder spherocylinderToDelete = null;
      int position = 0;
      for (int i = 0; i < spherocylinders.length; i++) {
         if (spherocylinders[i] == null) {
            continue;
         }
         if (spherocylinders[i].getLabel().toLowerCase()
            .equals(labelIn.trim().toLowerCase())) {
            spherocylinderToDelete = spherocylinders[i];
         } else {
            spherocylinders[position] = spherocylinders[i];
            position++;
         }
      }
      if (spherocylinderToDelete != null) {
         spherocylinders[spherocylinders.length - 1] = null;
         numberOfSpherocylinders--;
      }
      return spherocylinderToDelete;
   }

   /**
    * The editSpherocylinder method edits the Spherocylinder in the 
    * spherocylinders list that contains the label entered, and changes 
    * that Spherocylinder's radius to radiusIn and height to heightIn.
    *
    * @param labelIn  String - label of Spherocylinder to edit
    * @param radiusIn double - new radias of Spherocylinder
    * @param heightIn double - new height of Spherocylinder
    * @return boolean - True if edit is successful - False if not
    */
   public boolean editSpherocylinder(
      String labelIn, double radiusIn, double heightIn) {
      boolean isEdited = false;
      for (int i = 0; i < spherocylinders.length; i++) {
         if (spherocylinders[i] == null) {
            continue;
         }
         if (spherocylinders[i].getLabel().toLowerCase()
            .equals(labelIn.trim().toLowerCase())) {
            spherocylinders[i] = new Spherocylinder(
               labelIn, radiusIn, heightIn);
            isEdited = true;
         }
      }
      return isEdited;
   }

   /**
    * The findSpherocylinderWithLargestVolume method finds and returns the
    * Spherocylinder with the greatest volume in the spherocylinders list. if
    * spherocylinders is empty, returns null.
    * 
    * @return Spherocylinder
    */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      Spherocylinder spherocylinderToReturn = null;
      if (numberOfSpherocylinders != 0) {
         for (Spherocylinder spherocylinder : spherocylinders) {
            if (spherocylinder != null) {
               if (spherocylinderToReturn == null) {
                  spherocylinderToReturn = spherocylinder;
                  continue;
               }
               if (spherocylinder.volume() > spherocylinderToReturn.volume()) {
                  spherocylinderToReturn = spherocylinder;
               }
            }
         }
      }
      return spherocylinderToReturn;
   }

   /**
    * The numberOfSpherocylinders method gets numberOfSpherocylinders in
    * SpherocylinderList.
    *
    * @return int - current value of numberOfSpherocylinders
    */
   public int numberOfSpherocylinders() {
      return numberOfSpherocylinders;
   }

   /**
    * The totalSurfaceArea method sums up and returns the surface areas of each
    * Spherocylinder in the SpherocylinderList.
    * 
    * @return Double - summed surface area of Spherocylinders
    */
   public Double totalSurfaceArea() {
      Double totalSurfaceArea = 0.0;
      if (numberOfSpherocylinders != 0) {
         for (Spherocylinder spherocylinder : spherocylinders) {
            if (spherocylinder != null) {
               totalSurfaceArea += spherocylinder.surfaceArea();
            }
         }
      }
      return totalSurfaceArea;
   }

   /**
    * The totalVolume method sums up and returns the volumes area of each
    * Spherocylinder in the SpherocylinderList.
    *
    * @return Double - summ of all Spherocylinders surface areas
    */
   public Double totalVolume() {
      Double totalVolume = 0.0;
      if (numberOfSpherocylinders != 0) {
         for (Spherocylinder spherocylinder : spherocylinders) {
            if (spherocylinder != null) {
               totalVolume += spherocylinder.volume();
            }
         }
      }
      return totalVolume;
   }

   /**
    * The averageSurfaceArea method find and returns the average surface area
    * between each Spherocylinder in the SpherocylinderList.
    *
    * @return Double - the average surface area of Spherocylinders in
    *         SpherocylinderList
    */
   public Double averageSurfaceArea() {
      Double averageSurfaceArea = 0.0;
      if (numberOfSpherocylinders != 0) {
         averageSurfaceArea = totalSurfaceArea() / numberOfSpherocylinders;
      }
      return averageSurfaceArea;
   }

   /**
    * The averageVolume method find and returns the average volume between each
    * Spherocylinder in the SpherocylinderList.
    *
    * @return Double - average volume of Spherocylinders in SpherocylinderList
    */
   public Double averageVolume() {
      Double averageVolume = 0.0;
      if (numberOfSpherocylinders != 0) {
         averageVolume = totalVolume() / numberOfSpherocylinders;
      }
      return averageVolume;
   }

   /**
    * The toString method formats data on the SpherocylindersList.
    *
    * @return String - formatted data
    */
   public String toString() {
      DecimalFormat format = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "----- Summary for " + name + " -----\n";
      output += "Number of Spherocylinders: " + numberOfSpherocylinders() 
         + "\n";
      output += "Total Surface Area: " + format.format(totalSurfaceArea()) 
         + "\n";
      output += "Total Volume: " + format.format(totalVolume()) + "\n";
      output += "Average Surface Area: " 
         + format.format(averageSurfaceArea()) + "\n";
      output += "Average Volume: " + format.format(averageVolume());
      return output;
   }

}
