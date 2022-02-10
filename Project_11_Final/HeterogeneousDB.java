/**
  * The HeterogeneousDB class is an extention of the DistributedDB class that 
  * creates a heterogeneous style data base.
  * 
  * @author Michael Harden
  * @version Nov 4, 2020
  */
public class HeterogeneousDB extends DistributedDB {

   // --- FIELDS ---

   /** COST_FACTOR is a multiplier to determin the cost of the database. */
   public static final double COST_FACTOR = 1.3;

   // --- CONSTRUCTORS ---

   /**
    * The HeterogeneousDB constructor creates a new instance of the
    * HeterogeneousDB class.
    *
    * @param nameIn          String - name of database
    * @param baseCostIn      double - base cost for database
    * @param dbStorageIn     double - TB of storage
    * @param numberOfUsersIn int - numher of clients that will use the database
    * @param costPerUserIn   double - amount that it cost fo each user
    */
   public HeterogeneousDB(String nameIn, double baseCostIn, double dbStorageIn, 
      int numberOfUsersIn, double costPerUserIn) {
      super(nameIn, baseCostIn, dbStorageIn, numberOfUsersIn, costPerUserIn);
   }

   // --- METHODS ---

   /**
    * The getCostFactor method returns the COST_FACTOR field.
    *
    * @return double - the COST_FACTOR constant
    */
   public double getCostFactor() {
      return COST_FACTOR;
   }

   /**
    * The monthlyCost method returns the amount due each month for the database.
    *
    * @return double - cost of database for each month
    */
   public double monthlyCost() {
      return baseCost + userCost() * COST_FACTOR;
   }
}
