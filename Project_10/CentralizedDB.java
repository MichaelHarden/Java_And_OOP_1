import java.text.DecimalFormat;

/**
 * The Centralized class is an extention of the DB class that creates a
 * Centralized style data base.
 * 
 * @author Michael Harden
 * @version Nov 4, 2020
 */
public class CentralizedDB extends DB {

   // --- FIELDS ---

   private double license;

   // -- CONSTRUCTORS ---

   /**
    * The CentralizedDB constructor creates a new instance of the CentralizedDB
    * class.
    *
    * @param nameIn      String - name of database
    * @param baseCostIn  double - base cost for database
    * @param dbStorageIn double - TB of storage
    * @param licenseIn   int - license of the database
    */
   public CentralizedDB(String nameIn, double baseCostIn, 
      double dbStorageIn, double licenseIn) {
      super(nameIn, baseCostIn, dbStorageIn);
      setLicense(licenseIn);
   }

   // --- METHODS ---

   /**
    * The getLicense method returns the license number for a database.
    *
    * @return double -license field
    */
   public double getLicense() {
      return license;
   }

   /**
    * The seLicense method sets the value of license to licenseIn.
    *
    * @param licenseIn double - license number
    */
   public void setLicense(double licenseIn) {
      license = licenseIn;
   }

   /**
    * The monthlyCost method calculates and returns the monthly cost for the 
    * data base.
    *
    * @return double - monthy cost of database
    */
   public double monthlyCost() {
      return license + baseCost;
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
      result += "License: " + pattern.format(getLicense());
   
      return result;
   }
}
