import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The HeterogeneousDBTest class test the method in the HeterogeneousDB class.
 * 
 * @author Michael Harden
 * @version Nov 5, 2020
 */
public class HeterogeneousDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** The getCostFactorTest method test the getCostFactor method. */
   @Test public void getCostFactorTest() {
   
      HeterogeneousDB testDB1 = new HeterogeneousDB("Database One", 2000.0, 
         7.5, 100, 14.0);
      Assert.assertEquals(1.3, testDB1.getCostFactor(), 0.000001);
   
   }

   /** The monthlyCost method test the monthlyCost method. */
   @Test public void monthlyCost() {
   
      HeterogeneousDB testDB1 = new HeterogeneousDB("Database One", 2000.0, 
         7.5, 100, 14.0);
      Assert.assertEquals(3820.0, testDB1.monthlyCost(), 0.000001);
   
   }
}
