import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The CentralizedDBTest class test the method in the CentralizedDB class as
 * well as its parent class, DB.
 * 
 * @author Michael Harden
 * @version Nov 5, 2020
 */
public class CentralizedDBTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Test the getName method in DB abstract class. **/
   @Test public void getNameTest() {
   
      CentralizedDB testDB1 = new CentralizedDB("Database One", 1200.0, 7.5, 
         1500);
      Assert.assertEquals("Database One", testDB1.getName());
   
      CentralizedDB testDB2 = new CentralizedDB(null, 600.0, 4.5, 1000);
      Assert.assertEquals("", testDB2.getName());
   }

   /** Test the getBaseCost method in DB abstract class. **/
   @Test public void getBaseCost() {
   
      CentralizedDB testDB1 = new CentralizedDB("Database One", 1200.0, 7.5, 
         1500);
      Assert.assertEquals(1200.0, testDB1.getBaseCost(), .000001);
   
   }

   /** Test the getDbStorage method in DB abstract class. **/
   @Test public void getDbStorage() {
   
      CentralizedDB testDB1 = new CentralizedDB("Database One", 1200.0, 7.5, 
         1500);
      Assert.assertEquals(7.5, testDB1.getDbStorage(), .000001);
   
   }

   /** Test the static getCount and resetCount methods in DB abstract class. **/
   @Test public void getCountTest() {
   
      DB.resetCount();
   
      CentralizedDB testDB1 = new CentralizedDB("Database One", 1200.0, 7.5, 
         1500);
      CentralizedDB testDB2 = new CentralizedDB(null, 600.0, 4.5, 1000);
   
      Assert.assertEquals(2, DB.getCount());
   
   }

   /** Test the getLicenseT method in DB abstract class. **/
   @Test public void getLicenseTest() {
   
      CentralizedDB testDB1 = new CentralizedDB("Database One", 1200.0, 7.5, 
         1500);
      Assert.assertEquals(1500.0, testDB1.getLicense(), .000001);
   
   }

   /** Test the monthlyCost method in CentralizedDB class. **/
   @Test public void monthlyCostTest() {
   
      CentralizedDB testDB1 = new CentralizedDB("Database One", 1200.0, 7.5, 
         1500);
      Assert.assertEquals(2700.0, testDB1.monthlyCost(), .000001);
   
   }

      /** Test the toString method in CentralizedDB and DB class. **/
   @Test public void toStringTest() {
   
      CentralizedDB testDB1 = new CentralizedDB("Database One", 1200.0, 7.5, 
         1500);
   
      String result = "Database One (class CentralizedDB) Monthly Cost: "
         + "$2,700.00\n" 
         + "Storage: 7.500 TB\n" 
         + "Base Cost: $1,200.00\n"
         + "License: $1,500.00";
      Assert.assertEquals(result, testDB1.toString());
   }
   
}
