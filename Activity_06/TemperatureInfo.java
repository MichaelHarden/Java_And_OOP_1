import java.util.ArrayList;
import java.util.Scanner;

/**
 * TemperatureInfo lets user enter a list of temperatures and returns
 * the lowest or highest temperature or prints both with the list of 
 * temperatures.
 * 
 * @author Michael Harden
 * @version Sept 26, 2020
 */
public class TemperatureInfo {
   /**
    * takes in list of temps from keyboard and will print selected
    * output on the list or temps.
    * 
    * @param args Command line arguments (not used)
    */
   public static void main(final String[] args) {
   
      // initializes the scanner
      final Scanner userInput = new Scanner(System.in);
      // initializes an array for temperatures
      final ArrayList<Integer> tempsInput = new ArrayList<Integer>();
   
      // promts user to enter temperatures 
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsInput.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
   
      // sets temperatures user adds to the tempature array
      final Temperatures temps = new Temperatures(tempsInput);
   
      // promts user to choose what action to take on temperatures
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, [P]rint, " 
            + "[E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L': // prints lowest temp in list
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H': // prints highest temp in list
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            case 'P': // prints toString of temps
               System.out.println(temps);
               break;
            case 'E': // escapes do while
               System.out.println("\tDone");
               break;
            default: // user enters invalid input
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
      userInput.close();
   }
}
