import javax.swing.JOptionPane;

/**
 * The DivisionDriver class is an example of using the Division class.
 * 
 * @author Michael Harden.
 * @version Nov, 16, 2020
 */
public class DivisionDriver {
   /**
    * The main mehtod opens a window and promts the user to enter a numerator 
    * and a denominatnor. If the denominator is 0 the error is caught and 
    * displayed. If an invalid input is entered the error is caught and 
    * displayed.
    *
    * @param args Command line (arguments not used)
    */
   public static void main(String[] args) {
   
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = JOptionPane.showInputDialog("Enter the denominator");
      
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Interger division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result, "Result", 
            JOptionPane.PLAIN_MESSAGE);
         
      } catch (NumberFormatException e) {
      
         JOptionPane.showMessageDialog(null, 
            "Invalid input: enter numerical integer values only.", "Error", 
               JOptionPane.ERROR_MESSAGE);
      
      } catch (IllegalArgumentException e) {
      
         JOptionPane.showMessageDialog(null, e, "Error", 
            JOptionPane.ERROR_MESSAGE);
      }
   
      
   }
}
