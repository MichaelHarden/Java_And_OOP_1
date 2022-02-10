/**
*This code accepts the coded ticket information as input that
*includes information about the ticket.
*
*@author Connor Newton
*@version 9/9/21
*/
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

/** Code explained below. */
public class MoonTrip {
    /**
     * Uses the entered data (ticket) to return the date of takeoff, the time, the
     * seat number, what the ticket is for, the price (incuding the discount if
     * available), and a random prize number.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$#,###.00");
        DecimalFormat dfp = new DecimalFormat("0000");
        DecimalFormat dfd = new DecimalFormat("#%");
        Random generator = new Random();
        String input = "";
        String month = "";
        String day = "";
        String year = "";
        String hr = "";
        String min = "";
        String seat = "";
        String ticket = "";
        double price = 0.0;
        double cost = 0.0;
        int prize = 0;
        double discount = 0;
        System.out.print("Enter ticket code: ");
        input = scan.nextLine().trim();
        // int endSubstring = input.length();
        System.out.println("");
        if (input.length() < 27) {
            System.out.println("*** Invalid Ticket Code ***" + "\nTicket code must have at least 27 characters.");
        } else {
            // print the ticket value
            ticket = input.substring(27, input.length());
            System.out.print("Ticket: " + ticket);
            // print the date value
            month = input.substring(0, 2);
            day = input.substring(2, 4);
            year = input.substring(4, 8);
            System.out.print("   Date: " + month + "/" + day + "/" + year);
            // print the time value
            hr = input.substring(8, 10);
            min = input.substring(10, 12);
            System.out.print("   Time: " + hr + ":" + min);
            // print the seat value
            seat = input.substring(23, 26);
            System.out.print("   \nSeat: " + seat);
            // print the price value
            price = Integer.parseInt(input.substring(12, 21)) / 100;
            System.out.print("   Price: " + df.format(price));
            // print the discount value
            discount = Double.parseDouble(input.substring(21, 22));
            System.out.print("   Discount: " + dfd.format(discount));
            // print the cost value
            cost = price - (price * discount);
            System.out.print("   Cost: " + df.format(cost));
            // generate a random number for prize
            prize = (int) generator.nextInt(10000);
            System.out.println("\nPrize Number: " + dfp.format(prize));
        }
    }
}