/**
 * 
 * 
 * @author Michael Harden
 * @version September 21, 2020
 */
public class NumberOperations {

   private int number;

   // Constructors
   /**
    * Construct new instance of NumberOperations.
    *
    * @param numberIn value to be set to number
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }

   // Methods

   /**
    * @return int returns value of number
    */
   public int getValue() {
      return number;
   }

   /**
    * @return String returns a list of positive odd intergers less than number.
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }

   /**
    * @return String returns a list of each positive interger to the second 
    * power less and less than number.
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      } 
      return output;
   }

   /**
    * 
    * @param compareNumber interger to compare number to
    * @return int: 1 if number is greater, -1 if the input is greater, 
    * 0 if number and input are same.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      } else if (number < compareNumber) {
         return -1;
      } else {
         return 0;
      }
   }

   /**
    * @return String returns number cast as String
    */
   public String toString() {
      return number + "";
   }
}
