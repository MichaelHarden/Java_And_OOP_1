import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The DistributedDBTest class test the method in the DistributedDB class.
 * 
 * @author Michael Harden
 * @version Nov 5, 2020
 */
public class DistributedDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   } 

   /** The getNumberOfUsersTest method test the getNumberOfUsers method. */
   @Test public void getNumberOfUsersTest() {
   
      DistributedDB testDB1 = new DistributedDB("Database One", 2000.0, 7.5, 
         100, 1200.0); 
      Assert.assertEquals(100, testDB1.getNumberOfUsers(), 0.000001);
      
   }

      /** The getCostPerUsertest method test the getCostPerUser method. */
   @Test public void getCostPerUsertest() {
   
      DistributedDB testDB1 = new DistributedDB("Database One", 2000.0, 7.5, 
         100, 12.0); 
      Assert.assertEquals(1200.0, testDB1.userCost(), 0.000001);
      
   }

   /** The getCostFactorTest method test the getCostFactorTest method. */
   @Test public void getCostFactorTest() {
   
      DistributedDB testDB1 = new DistributedDB("Database One", 2000.0, 7.5, 
         100, 12.0); 
      Assert.assertEquals(1.1, testDB1.getCostFactor(), 0.000001);
   
   }

   /** The userCostTest method test the userCost method. */
   @Test public void userCostTest() {
   
      DistributedDB testDB1 = new DistributedDB("Database One", 2000.0, 7.5, 
         100, 12.0); 
      Assert.assertEquals(1200.0, testDB1.userCost(), 0.000001);
      
   }
   
   /** The monthlyCostTest method test the monthlyCost method. */
   @Test public void monthlyCostTest() {
   
      DistributedDB testDB1 = new DistributedDB("Database One", 2000.0, 7.5, 
         100, 12.0); 
      Assert.assertEquals(3320.0, testDB1.monthlyCost(), 0.000001);
      
   }

   /** The toStringTest methid test the toString method. */
   @Test public void toStringTest() {
   
      DistributedDB testDB1 = new DistributedDB("Database One", 2000.0, 7.5, 
         100, 12.0); 
   
      String result = "Database One (class DistributedDB) Monthly Cost: "
         + "$3,320.00\n"
         + "Storage: 7.500 TB\n"
         + "Base Cost: $2,000.00\n"
         + "Number of Users: 100\n"
         + "Cost per User: $12.00\n"
         + "User Cost: $1,200.00\n"
         + "Cost Factor: 1.1";
      Assert.assertEquals(result, testDB1.toString());
   }
}
