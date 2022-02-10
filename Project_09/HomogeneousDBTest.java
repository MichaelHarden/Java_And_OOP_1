import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The HomogeneousDBTest class test the method in the HomogeneousDB class.
 * 
 * @author Michael Harden
 * @version Nov 5, 2020
 */
public class HomogeneousDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** The getCostFactorTest method test the getCostFactor method. */
   @Test public void getCostFactorTest() {
   
      HomogeneousDB testDB1 = new HomogeneousDB("Database One", 2000.0, 7.5, 
         100, 14.0);
      Assert.assertEquals(1.2, testDB1.getCostFactor(), 0.000001);
   
   }
   /** The monthlyCost method test the monthlyCost method. */
   @Test public void monthlyCost() {
   
      HomogeneousDB testDB1 = new HomogeneousDB("Database One", 2000.0, 7.5, 
         100, 14.0);
      Assert.assertEquals(3680.0, testDB1.monthlyCost(), 0.000001);
   
   }
}
