import java.text.DecimalFormat;

/**
 * The DistributedDB class is an extention of the DB class that creates a
 * distributed style data base.
 * 
 * @author Michael Harden
 * @version Nov 4, 2020
 */
public class DistributedDB extends DB {

   // --- FIELDS ---

   protected int numberOfUsers;
   protected double costPerUser;

  /** COST_FACTOR is a multiplier to determin the cost of the database. */
   public static final double COST_FACTOR = 1.1;

   // --- CONSTRUCTORS ---

   /**
    * The DistributedDB constructor creates a new instance of the DistributedDB
    * class.
    *
    * @param nameIn          String - name of database
    * @param baseCostIn      double - base cost for database
    * @param dbStorageIn     double - TB of storage
    * @param numberOfUsersIn int - numher of clients that will use the database
    * @param costPerUserIn   double - amount that it cost fo each user
    */
   public DistributedDB(String nameIn, double baseCostIn, double dbStorageIn, 
      int numberOfUsersIn, double costPerUserIn) {
      super(nameIn, baseCostIn, dbStorageIn);
      setNumberOfUsers(numberOfUsersIn);
      setCostPerUser(costPerUserIn);
   }

   // --- METHODS ---

   /**
    * The getNumberOfUsers method returns the number of users in database.
    *
    * @return int - numberOfUsers field
    */
   public int getNumberOfUsers() {
      return numberOfUsers;
   }

   /**
    * The setNumberOfUsersIn sets the numberOfUsers field to numberOfUsersIn.
    *
    * @param numberOfUsersIn int - number of clients that will use the database
    */
   public void setNumberOfUsers(int numberOfUsersIn) {
      numberOfUsers = numberOfUsersIn;
   }

   /**
    * The getCostPerUser method gets the current value of costPerUSer.
    *
    * @return double - costPerUser
    */
   public double getCostPerUser() {
      return costPerUser;
   }

   /**
    * The setCostPerUser method sets the monthly cost for one user.
    *
    * @param costPerUserIn double - amount due
    */
   public void setCostPerUser(double costPerUserIn) {
      costPerUser = costPerUserIn;
   }

   /**
    * The userCost method calculates how much is due each month based on the 
    * number of customers.
    *
    * @return double - cost for users.
    */
   public double userCost() {
      return costPerUser * numberOfUsers;
   }

   /**
    * The getCostFactor method returns the COST_FACTOR constant.
    *
    * @return double - Distributed.COST_FACTOR
    */
   public double getCostFactor() {
      return COST_FACTOR;
   }

   /**
    * The monthlyCost method calculates the cost for the data base each month.
    *
    * @return double - amount due
    */
   public double monthlyCost() {
      return baseCost + userCost() * COST_FACTOR;
   }

   /**
    * The toString method returns a detailed description of the Distributed Data
    * Base.
    *
    * @return String - description of database
    */
   public String toString() {
   
      DecimalFormat pattern = new DecimalFormat("$#,##0.00");
   
      String result = super.toString();
      result += "Number of Users: " + getNumberOfUsers() + "\n";
      result += "Cost per User: " + pattern.format(getCostPerUser()) + "\n";
      result += "User Cost: " + pattern.format(userCost()) + "\n";
      result += "Cost Factor: " + getCostFactor();
   
      return result;
   }

}
