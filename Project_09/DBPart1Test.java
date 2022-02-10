import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The DBPart1Test class test the method in the DBPart1 class.
 * 
 * @author Michael Harden
 * @version Nov 5, 2020
 */
public class DBPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** The mainTest method tests the main method. */
   @Test public void mainTest() {
      DBPart1.main(null);
      Assert.assertEquals(4, DB.getCount());
   }
}
