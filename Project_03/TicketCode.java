import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * User enters a ticket code, TicketCode parses the code and returns
 * the show description, date and time of show, seat number and row,
 * price of ticket before and after discount, and percentage discount.
 * 
 * @author Michael Harden
 * @version September 7, 2020
 */

public class TicketCode {
   /**
    * user enters ticket code, main() parses the code and 
    * returns data stored in the ticket code.
    *
    * @param args Command line arguments (not used)
    */
   public static void main(String[] args) {
   
      //initializes the Scanner class
      Scanner userInput = new Scanner(System.in);
   
      //Initializes Decimal Formats and creates formats
      DecimalFormat priceFormat = new DecimalFormat("$#,##0.00");
      DecimalFormat discountFormat = new DecimalFormat("#%");
      DecimalFormat prizeFormat = new DecimalFormat("000");
   
      // data stored in ticket code
      String ticketCode;
      String strPrice;
      String strDiscount;
      String time;
      String date;
      String section;
      String row;
      String seat;
      String description;
      Double cost;
      int prizeNumber = 0;
   
      // promts user to enter ticket code and trims white space on from edge 
      System.out.print("Enter ticket code: ");
      ticketCode = userInput.nextLine();
      ticketCode = ticketCode.trim();
      userInput.close();
      
      if (ticketCode.length() >= 26) {
      
         // assigning substrings of data from ticket code
         strPrice = ticketCode.substring(0, 5);
         strDiscount = ticketCode.substring(5, 7);
         time = ticketCode.substring(7, 9) + ":" + ticketCode.substring(9, 11);
         date = ticketCode.substring(11, 13) + "/" 
            + ticketCode.substring(13, 15) 
            + "/" + ticketCode.substring(15, 19);
         section = ticketCode.substring(19, 21);
         row = ticketCode.substring(21, 23);
         seat = ticketCode.substring(23, 25);
         description = ticketCode.substring(25);
      
         // parses Strings to Double to find discounted price
         Double price = Double.parseDouble(strPrice) / 100;
         Double discount = Double.parseDouble(strDiscount) / 100;
         cost = price * (1.0 - discount);
      
         // creates a random prize number
         int minimum = 1, max = 9999; 
         prizeNumber = (int) (Math.random() * (max - minimum) + minimum);
         String formattedPrize = prizeFormat.format(prizeNumber);
      
         System.out.print("\nDescription: " + description);
         System.out.print("   Date: " + date); 
         System.out.print("   Time: " + time);
         System.out.print("\nSection: " + section);
         System.out.print("   Row: " + row);
         System.out.print("   Seat: " + seat);
         System.out.print("\nPrice: " + priceFormat.format(price));
         System.out.print("   Discount: " + discountFormat.format(discount));
         System.out.print("   Cost: " + priceFormat.format(cost));
         System.out.println("\nPrize Number: " + formattedPrize);;
      
      } else {
         // if ticket is entered incorrectly
         System.out.println("\nInvalid ticket code." 
            + "\nTicket code must have at least 26 characters.");
      }
   }
}
