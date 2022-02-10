import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Takes a user input to compute a result value from the formula, 
 * (6x^3 - 4)(|(7x^3) + (5x^2) + (3x) + 1|)^1/2
 * where x is the number a user enters.
 * Then returns the computed result, the number of characters 
 * to rhe right and left of the decimal, and a formatted result
 * 
 * @author Michael Harden
 * @version September 7, 2020
 */
public class FormulaSolver {
   /**
    * user enters value for x and returns computed value, number of chars 
    * on left and right of decimal, and formatted result.
    *
    * @param args Command line argumnets (not used)
    */
   public static void main(String[] args) {
   
      //initializes Scanner and Decimal Format classes
      Scanner userInput = new Scanner(System.in);
      DecimalFormat pattern = new DecimalFormat("#,##0.0#####");
   
      // value enterd by users
      double x = 0.0;
     
      // promts user to enter a value for x and sets x equal to value entered
      System.out.print("Enter a value for x: ");
      x = Double.parseDouble(userInput.nextLine());
      userInput.close();
   
      // computes result and prints to command line
      double radican = Math.abs((7 * Math.pow(x, 3)) 
         + (5 * Math.pow(x, 2)) + (3 * x) + 1);
      double multiplier = (6 * Math.pow(x, 3)) - 4;
      Double result = multiplier * Math.sqrt(radican);
   
      String stringResult = result.toString();
      System.out.println("Result: " + result);
   
      // prints numbers of chars to right and left of decimal
      int decimalIndex = stringResult.indexOf('.');
      String charsLeftOfDecimal = stringResult.substring(0, decimalIndex);
      String charsRightOfDecimal = stringResult.substring(decimalIndex + 1);
   
      System.out.println("# of characters to left of decimal point: " 
         + charsLeftOfDecimal.length());
      System.out.println("# of characters to right of decimal point: " 
         + charsRightOfDecimal.length());
   
      // format result and prints to command line
      System.out.println("Formatted Result: " + pattern.format(result));
   
   
   }
}
