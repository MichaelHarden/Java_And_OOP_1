import java.util.Scanner;
/**
 * User enters a message and selects operation to run on message:\. 
 * 0 returns message as is,
 * 1 returns trimmed, 
 * 2 reutrns lowercase, 
 * 3 returns uppercase, 
 * 4 returns vowels replaced with "-",
 * 5 removes first and last chars
 * 
 * @author Michael Harden
 * @version September 7, 2020
 */

public class MessageConverter {
   /**
    * User inputs message and selects how opperaion ton run on message.
    * New message is returned.

    * @param args Command line arguments (not used)
    */
   public static void main(String[] args) {
      
      //initializes Scanner class
      Scanner userInput = new Scanner(System.in);
   
      //stores users message,output selection, and result
      String message = "";
      int outputType;
      String result = "";
   
      // promts user to enter message
      System.out.print("Type in a message and press enter:\n\t>\t");
      message = userInput.nextLine();
   
      // promts user to select output type
      System.out.print("\nOutput types:"
         + "\n\t0: As is"
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
      userInput.close();
   
      // runs opperation chosen by user on message
      if (outputType == 0) { //as is
         result = message;
      
      } else if (outputType == 1) { //trimmed
         result = message.trim();
      
      } else if (outputType == 2) { // lowercase
         result = message.toLowerCase();
      
      } else if (outputType == 3) { //upper case
         result = message.toUpperCase();
      
      } else if (outputType == 4) { //vowels replaced
         result = message.replace('A', '_');
         result = result.replace('a', '_');
         result = result.replace('E', '_');
         result = result.replace('e', '_');
         result = result.replace('I', '_');
         result = result.replace('i', '_');
         result = result.replace('O', '_');
         result = result.replace('o', '_');
         result = result.replace('U', '_');
         result = result.replace('u', '_');
      
      } else if (outputType == 5) { // without first and last characters
         result = message.substring(1, message.length() - 1);
      
      } else { // invalid input
         result = "Error: Invalid choice input";
      
      }
      System.out.println("\n" + result);
      
   }   
}
