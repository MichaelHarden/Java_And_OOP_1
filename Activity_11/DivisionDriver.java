import javax.swing.JOptionPane;

public class DivisionDriver {
   public static void main(String[] args) {
   
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = JOptionPane.showInputDialog("Enter the denominator");
      
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Interger division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFlaoting point division: \n"
            + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.PLAIN_MESSAGE);
         
      } catch (NumberFormatException e){
      
         JOptionPane.showMessageDialog(null, "Invalid input: enter numerical integer values only.", "Error", JOptionPane.ERROR_MESSAGE);
      }
   
      
   }
}
