/**
 * Customer class creates a new customer with there name, location, and balance.
 * @author Michael Harden
 * @version Oct 17, 2020
 */
public class Customer implements Comparable<Customer> {

   private String name;
   private String location;
   private double balace;

   /**
    * Initializes new instance of Customer.
    *
    * @param nameIn String - name of customer
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balace = 0.0;
   }

   /**
    * SetLocation sets the location of the Customer if value is not null.
    * 
    * @param locationIn String - geographical location
    */
   public void setLocation(String locationIn) {
      if (locationIn != null) {
         location = locationIn;
      }
   }

   /**
    * SetLocation sets the location of Customer if values are not null.
    *
    * @param city String - city of residence
    * @param state String - state of residence
    */
   public void setLocation(String city, String state) {
      if (city != null && state != null) {
         location = city + ", " + state;
      }
   }

   /**
    * ChangeBalance changes the current ballance buy the amount entered.
    *
    * @param amount double - amount to add or remove from balance
    */
   public void changeBalance(double amount) {
      balace += amount;
   }

   /**
    * GetLocation gets the customers current location.
    *
    * @return value of location
    */
   public String getLocation() {
      return location;
   }

   /**
    * GetBalance gest the value of the customers balance.
    *
    * @return customers outstanding balance
    */
   public double getBalance() {
      return balace;
   }

   /**
    * ToString formats and returns the customers data.
    *
    *@return formatted string
    */
   public String toString() {
      String output = "";
      output += name + "\n";
      output += location + "\n";
      output += "$" + balace;
      return output;
   }

   /**
    * CompareTo compares the balances of two customers and returns an int value 
    * representing which is the biger value.
    * 
    * @param obj Customer - customer to compare 
    * @return 0 if values are equal witin margins, 1 if self is bigger, 
    *        -1 if obj is big
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balace - obj.balace) < 0.000001) {
         return 0;
      } else if (this.balace < obj.balace) {
         return -1;
      } else {
         return 1;
      }
   }
}