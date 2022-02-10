import java.text.DecimalFormat;

/**
 * The DB class is an abstract class that creats a format for sub-classes to
 * build databases.
 * 
 * @author Michael Harden
 * @version Nov 4, 2020
 */
public abstract class DB implements Comparable<DB> {
   // --- FIELDS ---

   // instance variables
   protected String name;
   protected double baseCost;
   protected double dbStorage;
   // dataBaseStorage is a double representing number of terabytes

   // class variables
   protected static int count = 0;

   // --- CONSTRUCTORS ---

   /**
    * The DB Constructor creates a new instance of the DB class.
    *
    * @param nameIn      String - name of database
    * @param baseCostIn  double - base price for the data base
    * @param dbStorageIn doule - TB of strage
    */
   public DB(String nameIn, double baseCostIn, double dbStorageIn) {
      setName(nameIn);
      setBaseCost(baseCostIn);
      setDbStorage(dbStorageIn);
      count++;
   }

   // --- METHODS ---

   /**
    * The getName method returns the name of the database.
    *
    * @return String - database name
    */
   public String getName() {
      return name;
   }

   /**
    * The setName method sets the name of the database to the value of nameIn.
    *
    * @param nameIn String - does not exept null
    */
   public void setName(String nameIn) {
   
      if (nameIn != null) {
         name = nameIn;
         return;
      }
   
      name = "";
   }

   /**
    * The getbaseCost method returns the base cost for the database.
    *
    * @return double
    */
   public double getBaseCost() {
      return baseCost;
   }

   /**
    * The setBaseCost method sets the value of the database's base cost to
    * baseCostIn.
    *
    * @param baseCostIn doble - value of base cost
    */
   public void setBaseCost(double baseCostIn) {
      baseCost = baseCostIn;
   }

   /**
    * The getDBStorage method returns the size of storage alloted to the data 
    * base.
    *
    * @return dounle - number of terabytes
    */
   public double getDbStorage() {
      return dbStorage;
   }

   /**
    * The setDBStorage method sets the amount of storage a database is to have.
    *
    * @param dbStorageIn double - number of terabytes
    */
   public void setDbStorage(double dbStorageIn) {
      dbStorage = dbStorageIn;
   }

   /**
    * The monthlyCost method is an abstract method for each child class to 
    * define returning the amount due for each month.
    *
    * @return double - payment due each month
    */
   public abstract double monthlyCost();

   /**
    * The toString method returns a detailed description of a database.
    *
    * @return String - description of database
    */
   public String toString() {
   
      DecimalFormat moneyPattern = new DecimalFormat("$#,##0.00");
      DecimalFormat storagePattern = new DecimalFormat("0.000");
   
      String result = "";
      result += getName() + " (" + this.getClass() + ") Monthly Cost: " 
         + moneyPattern.format(monthlyCost()) + "\n";
      result += "Storage: " + storagePattern.format(getDbStorage()) + " TB\n";
      result += "Base Cost: " + moneyPattern.format(getBaseCost()) + "\n";
   
      return result;
   
   }

   /**
    * The compareTo method compares two databases by there name.
    *
    * @param anotherDb DB - database to compare to current database
    * @return int - 1 if name of current database DB comes before parameter 
                        database
                    0 if names are euqal
                   -1 if if name of parameter DB comes before current database
    */
   public int compareTo(DB anotherDb) {
      return (this.name.toLowerCase().compareTo(anotherDb.name.toLowerCase()));
   }

   // Static Methods
   
  /**
   * The getCount method is a static method that returns the count of databases.
   *
   * @return int - number of databases
   */
   public static int getCount() {
      return count;
   }

  /**
   * The resetCount method is a static method that resets the count of 
   * databases to 0.
   */
   public static void resetCount() {
      count = 0;
   }

}