import java.util.ArrayList;

/**
 * Temperatures class is a list of temperatures.
 * @author Michael Harden
 * @version Sept 26, 2020
 */
public class Temperatures {

   // Instance variables
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   
   // Constructor
   /**
    * Temperatures takes in an ArrayList of ints and assigns it to temperatures.
    * 
    * @param temperaturesIn array list of ints
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }

   // Methods
   /**
    * returns the lowest temp in temperatures.
    * @return lowest temp
    */
   public Integer getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int low = temperatures.get(0);
      for (int i = 1; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }

   /**
    * returns the highest temp in temperatures.
    * @return highest temp
    */
   public Integer getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
   
      int high = temperatures.get(0);
      for (int i = 1; i < temperatures.size(); i++) {
         if (temperatures.get(i) > high) {
            high = temperatures.get(i);
         }
      }
      return high;
   }

   /**
    * returns the lower between lowIn and getLowTemp().
    * @param lowIn - compaired to getLowTemp()
    * @return lower of two values
    */
   public Integer lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }

   /**
    * returns the hightest between highIn and getHighTemp().
    * @param highIn - compaired to getHighIn()
    * @return higher of two values
    */
   public Integer higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }

   /**
    * returns a string containing information on the temperatures class.
    * @return low, high, and list of temps
    */
   public String toString() {
      String output = "\tTemperatures: " + temperatures;
      output += "\n\tLow: " + getLowTemp();
      output += "\n\tHigh: " + getHighTemp();
   
      return output;
   }

}