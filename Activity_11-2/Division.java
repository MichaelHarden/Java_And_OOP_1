/**
 * The Division class offers two ways to fine the quotient of a given numerator 
 * and denominator.
 * 
 * @author Michael Harden
 * @version  Nov 16, 2020
 */
public class Division {

   
   // -- METHODS --
    
   /**
    * The intDivide mehod returns the integer value quotient of num / denom.
    *
    * @param num int numerator
    * @param denom int denominator
    * @return int - quotient
    */
   public static int intDivide(int num, int denom) {
   
      try { 
         int quotient = num / denom;
         return quotient;
         
      } catch (ArithmeticException e) {
      
         return 0;
      }
      
   }

   /**
    * The decimalDivide mehod returns the float value quotient of num / denom.
    *
    * @param num float numerator
    * @param denom float denominator
    * @return float - quotient
    * @throws IllegalArgumentException when  the denominator is 0
    */
   public static float decimalDivide(int num, int denom) {
   
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      } 
      
      float quotient = (float) num / denom;
      return quotient;
   }

}
