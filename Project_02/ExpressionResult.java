import java.util.Scanner;
/**
 * The user types in 3 numbers. If the product of the numbers is 0,
 * the result is undefined.
 * If the product is not 0 the result is
 * "(x - 1.1) (2y + 2.2) (4z + 4.4) / xyz" where x, y, and z
 * represent the 3 numbers entered.
 * 
 * @author Michael Harden 
 * @version august 29, 2020
 */

public class ExpressionResult {
   /**
    * User submits x, y, and z which are stored and used to compute result. I
    * If product of x * y * z = 0 then the answer is undefined

    * @param args Command line arguments (Not Used)
    */
   public static void main(String[] args) {
   
      //Initalizing the Snannor
      Scanner userInput = new Scanner(System.in);
   
      //Store of inputs
      double x = 0.0;
      double y = 0.0;
      double z = 0.0;
      double result = 0.0;
   
      //Prints the Expression
      System.out.println("result = (x - 1.1) (2y + 2.2) (4z + 4.4) / xyz");
   
      //Promt user to input first number
      System.out.print("\tx = ");
      x = userInput.nextDouble();
   
      //Promt user to input second number
      System.out.print("\ty = ");
      y = userInput.nextDouble();
   
      //Promt user to input third number
      System.out.print("\tz = ");
      z = userInput.nextDouble();
   
      /**
       * Checks the inputed numbers. if the product is equal to 0,
       * the expression is undefined. 
       * Any other situation the resulting fraction is printed.
       */ 
      if (x * y * z == 0) {
         System.out.print("result is \"undefined\"");
      } else {
         result = (x - 1.1) * (2 * y + 2.2) * (4 * z + 4.4) / (x * y * z);
         System.out.print("result = " + result);
      }
   }
}