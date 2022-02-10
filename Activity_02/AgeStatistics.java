import java.util.Scanner;
/** 
 * The user types in their name, age, and gender,
 * and the program tells the user statistics about themself.
 * 
 * @author Michael Harden
 * @version August 29, 2020
 */


public class AgeStatistics {
   /**
    * Stores the data that the user enters and uses that data to compute 
    * and return their age in terms of minutes and centuries and max heart rate.
    * 
    * @param args Command line aurguments - (not used)
    */
   public static void main(String[] args) {
   
      //initializing the scanner
      Scanner userInput = new Scanner(System.in);
   
      //users data
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0.0;
   
      //Promt the user to enter their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
   
      //Promt the user to enter their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
   
      //Promt the user to enter there Gender(females type 1 males type 0):
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
   
      //Calculate and displays the users age in terms of minutes
      System.out.println("\tYour age in minutes is " + ageInYears * 525600 
         + " minutes.");
   
      //Calculate and displays the users age in terms of centuries
      System.out.println("\tYour age in centuries is " 
         + (double) ageInYears / 100 + " centuries.");
   
      //Displays the users max heart rate
      System.out.print("Your max heart rate is ");
      maxHeartRate = calculateMaxHeartRate(gender, (double) ageInYears);
      System.out.println(maxHeartRate 
         + " beats per minute.");
   }

   /** 
    * Calculates the users max heart rate.
    * 
    * @param gender takes in users gender as an int
    * @param ageInYears takes in the users age as a double.
    * @return the max heart rate as a double.
    */ 
   public static double calculateMaxHeartRate(int gender, double ageInYears) {
      if (gender == 1) {
         return 209.0 - (0.7 * ageInYears);
      } else if (gender == 0) {
         return 214.0 - (0.8 * ageInYears);
      } else {
      /**
      * if number entered for gender is not 1 or 0, 
      * the methor returns 0.0 as MaxHeartRate
      */
         return 0.0;
      }
   }
}