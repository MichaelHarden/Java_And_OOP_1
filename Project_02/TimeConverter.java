import java.util.Scanner;
/**
 * User submits a raw amount of time given in seconds, 
 * which is then converted in to the amount of day, hours, minutes, and
 * seconds the raw number equals.
 * If the user submits a negative amount of time they are notified
 * that time must be positive.
 * 
 * @author Michael Harden
 * @version August 29, 2020
 */

public class TimeConverter {

   //Constants of time measurements 
   static final int SECONDS_IN_DAY = 86400;
   static final int SECONDS_IN_HOUR = 3600;
   static final int SECONDS_IN_MINUTE = 60;

   /**
    * Converts raw time to days, hours, minutes, and seconds. 
    * If time is negative, the system prints "Measurement must be non-negative!"

    * @param args Command line arguments (Not Used)
    */
   public static void main(String[] args) {
   
      //Initalizing the Snannor
      Scanner userInput = new Scanner(System.in);
   
      //Store of time.
      int rawMeasurement = 0;
      int days = 0;
      int hours = 0;
      int minutes = 0;
      int seconds = 0;
   
      //Promt user to input a raw amount of time in secons.
      System.out.print("Enter the raw time measurement in seconds: ");
      rawMeasurement = userInput.nextInt();
   
      /**
       * Checks users input. If input is negative, system allerts user
       * that all inputs must be positive.
       * If input is non-negative then calculates time in days, hours, minutes, 
       * and seconds.
       */
      if (rawMeasurement < 0) {
         System.out.println("Measurement must be non-negative!");
      
      } else {
         System.out.println("");
      
         //Calculates time
         days = rawMeasurement / SECONDS_IN_DAY;
         hours = (rawMeasurement % SECONDS_IN_DAY) / SECONDS_IN_HOUR;
         minutes = (rawMeasurement % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
         seconds = rawMeasurement % SECONDS_IN_MINUTE;
      
         //Prints total days, hours, minutes, and seconds
         System.out.println(
            "Measurement by combined days, hours, minutes, seconds: days: 7");
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + seconds);
         System.out.println("");
         System.out.println(rawMeasurement + " seconds = " + days + " days, "
            + hours + " hours, "  + minutes + " minutes, " 
            + seconds + " seconds");
      }
   }
}