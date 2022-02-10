import java.util.Scanner;
import java.util.ArrayList;

/**
 * Takes input of list of intergers from user and prints
 * out data on each of the intergers.
 * 
 * @author Michael Harden
 * @version September 21, 2020
 */
public class NumberOpsDriver {

   /**
    * Reads a set of positive numbers from the user until the user enters 0.
	 * Prints odds under and powers of 2 under for each number.
	 *
    * @param args - Standard commandline arguments
    */
   public static void main(final String[] args) {
   
      // initializes scanner
      final Scanner in = new Scanner(System.in);
   
      // declare and instantiate ArrayList with generic type <NumberOperations>
      final ArrayList<NumberOperations> numOpsList 
         = new ArrayList<NumberOperations>();
   
      // prompt user for set of numbers
      System.out.println("Enter a list of positive integers separated " 
         + "with a space followed by 0:");
   
      // get first user input using in.nextInt()
      int input = in.nextInt();
   
      // finds the next int from user input until no last int has been scanned
      while (input != 0) {
         numOpsList.add(new NumberOperations(input));
         input = in.nextInt();
      }
      in.close();
    
   
      int index = 0;
      while (index < numOpsList.size()) {
         final NumberOperations num = numOpsList.get(index);
         System.out.println("For: " + num);
         System.out.println("\tOdds under:\t" + num.oddsUnder());
         System.out.println("\tPowers of 2 under:\t" + num.powersTwoUnder());
      
         index++;
      }
   }

}