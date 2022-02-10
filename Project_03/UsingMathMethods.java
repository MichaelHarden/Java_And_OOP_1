/**
*This program solves for the result of a specified
*mathematical expression.
*
*@author Connor Newton
*@version 9/9/21
*/
import java.util.Scanner;
import java.text.DecimalFormat;

/** Code explained below. */
public class UsingMathMethods {
    /**
     * First, the computer will ask the user to input a value for x. Then the
     * computer will plug the value of x into the formula for result. The computer
     * will arrive at this result by using methods from the math class.
     * 
     * @param args Command line arguments - not used.
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // Assign x as type double
        double x = 0.0;
        double result = 0.0;
        // Convert to string
        String result2 = "";
        /**
         * Split numerator and denominator to make debugging easier
         */
        double numerator = 0.0;
        double denominator = 0.0;
        // Create variables for decimal places
        int integerPlaces = 0;
        String left = "";
        String right = "";
        int decimalPlacesLeft = 0;
        int decimalPlacesRight = 0;
        // Ask the user for a number
        System.out.print("Enter a value for x: ");
        x = userInput.nextDouble();
        // Evaluate expression
        numerator = (8 * Math.pow(x, 4) + Math.sqrt(+(Math.abs(4 * Math.pow(x, 3) + 4 * Math.pow(x, 2) + 4 * x + 4))));
        denominator = 4 + Math.abs(x);
        // Set result = numerator / denominator
        result = numerator / denominator;
        // Convert result into a string type
        result2 = Double.toString(result);
        System.out.println("Result: " + result2);
        /**
         * Determine the number of digits to the left and to the right of the decimal
         * point.
         */
        integerPlaces = result2.indexOf(".");
        left = result2.substring(0, integerPlaces);
        right = result2.substring(integerPlaces + 1);
        decimalPlacesLeft = left.length();
        decimalPlacesRight = right.length();
        System.out.println("# of characters to left of decimal point: " + decimalPlacesLeft);
        System.out.println("# of characters to right of decimal point: " + decimalPlacesRight);
        DecimalFormat df = new DecimalFormat("#,###,##0.0###");
        System.out.println("Formatted Result: " + df.format(result));
    }
}