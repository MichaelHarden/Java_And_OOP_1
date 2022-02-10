import javax.swing.JOptionPane;

public class Division {

   
   // -- METHODS --
    
   public static int intDivide(int num, int denom) {
   
      try { 
         int quotient = num / denom;
         return quotient;
         
      } catch(ArithmeticException e) {
      
         return 0;
      }
      
   }

   public static float decimalDivide(int num, int denom){
   
      // if (denom == 0) {
      throw new IllegalArgumentException("The denominator "
         + "cannot be zero.");
      //} 
      
      // float quotient = (float) num / denom;
      // return quotient;
   }

}
