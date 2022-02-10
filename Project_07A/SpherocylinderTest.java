import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * SpherocylinderTest class test methods with JUnit from the Spherocylinder 
 * class.
 * 
 * @author Michael Harden
 * @version Oct 11, 2020
 */
public class SpherocylinderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Tests setLabel and getLabel methods. */
   @Test public void getLabelTest() {
      Spherocylinder test1 = new Spherocylinder("", 0.0, 0.0);
      test1.setLabel("  Test ");
      Assert.assertEquals("", 0, test1.getLabel().compareTo("Test"));
      test1.setLabel(null);
      Assert.assertEquals("", 0, test1.getLabel().compareTo("Test"));
   }

   /** Tests setRadius and getRadius methods. */
   @Test public void getRadiusTest() {
      Spherocylinder test1 = new Spherocylinder("", 0.0, 0.0);
      test1.setRadius(1.5);
      Assert.assertEquals("", 1.5, test1.getRadius(), .0000001);
      test1.setRadius(-1.5);
      Assert.assertEquals("", 1.5, test1.getRadius(), .0000001);
   }

   /** Tests setCylinderHeight and getCylinderHeight methods. */
   @Test public void getCylinderHeightTest() {
      Spherocylinder test1 = new Spherocylinder("", 0.0, 0.0);
      test1.setCylinderHeight(1.5);
      Assert.assertEquals("", 1.5, test1.getCylinderHeight(), .0000001);
      test1.setCylinderHeight(-1.5);
      Assert.assertEquals("", 1.5, test1.getCylinderHeight(), .0000001);
   }
   
   /** Tests circumference method. */
   @Test public void circumferenceTest() {
      Spherocylinder test1 = new Spherocylinder("", 0.5, 0.25);
      Assert.assertEquals("", 3.14159265, test1.circumference(), .0000001);
      Spherocylinder test2 = new Spherocylinder("", -0.5, 0.25);
      Assert.assertEquals("", 0.0, test2.circumference(), .0000001);
      Spherocylinder test3 = new Spherocylinder("", 0.0, 0.25);
      Assert.assertEquals("", 0.0, test3.circumference(), .0000001);
   }

   /** Tests surfaceArea method. */
   @Test public void surfaceAreaTest() {
      Spherocylinder test1 = new Spherocylinder("", 10.8, 10.1);
      Assert.assertEquals("", 2151.111319, test1.surfaceArea(), .00001);
      Spherocylinder test2 = new Spherocylinder("", -10.8, 10.1);
      Assert.assertEquals("", 0.0, test2.surfaceArea(), .0000001);
      Spherocylinder test3 = new Spherocylinder("", 0.0, 10.1);
      Assert.assertEquals("", 0.0, test3.surfaceArea(), .0000001);
   }

   /** Tests volume method. */
   @Test public void volumeTest() {
      Spherocylinder test1 = new Spherocylinder("", 0.5, 0.25);
      Assert.assertEquals("", 0.71994831, test1.volume(), .0000001);
      Spherocylinder test2 = new Spherocylinder("", 0.0, 0.25);
      Assert.assertEquals("", 0.0, test2.volume(), .0000001);
      Spherocylinder test3 = new Spherocylinder("", -0.5, 0.25);
      Assert.assertEquals("", 0.0, test3.volume(), .0000001);
      
   }

   /** Tests equals method. */
   @Test public void equalsTest() {
      Spherocylinder test1 = new Spherocylinder("  hi ", 5.0, 3.2);
      Assert.assertFalse("", test1.equals((Double) 5.5));
      Assert.assertFalse("", test1.equals(new Spherocylinder("", 5.0, 3.2)));
      Assert.assertFalse("", test1.equals(new Spherocylinder("hi", 3.0, 3.2)));
      Assert.assertFalse("", test1.equals(new Spherocylinder("hi", 5.0, 3.0)));
      Assert.assertTrue("", test1.equals(new Spherocylinder("hi", 5.0, 3.2)));
   }

   /** Test hashCode method. */
   @Test public void hashCodeTest() {
      Spherocylinder test1 = new Spherocylinder("  hi ", 5.0, 3.2);
      Assert.assertEquals("", 0, test1.hashCode());
   }

   /** Tests toString method. */
   @Test public void toStringTest() {
      Spherocylinder test1 = new Spherocylinder("Small Example", 0.5, 0.25);
      String expected = "";
      expected += "Spherocylinder \"Small Example\" with radius 0.5 and " 
         + "cylinder height 0.25 has:\n\t";
      expected += "circumference = 3.142 units\n\t";
      expected += "surface area = 3.927 square units\n\t";
      expected += "volume = 0.72 cubic units";
      Assert.assertEquals("", 0, test1.toString().compareTo(expected));
   }

   /** Tests getCount method. */
   @Test public void getCountTest() {
      Spherocylinder.resetCount();
      Spherocylinder test1 = new Spherocylinder("ex1", 5.0, 3.2);
      Spherocylinder test2 = new Spherocylinder("ex2", 4.0, 3.3);
      Spherocylinder test3 = new Spherocylinder("ex3", 3.0, 3.4);
      Assert.assertEquals("", 3, Spherocylinder.getCount());
   }

   /** Tests resetCount method. */
   @Test public void resetCountTest() {
      Spherocylinder test1 = new Spherocylinder("ex1", 5.0, 3.2);
      Spherocylinder test2 = new Spherocylinder("ex2", 4.0, 3.3);
      Spherocylinder test3 = new Spherocylinder("ex3", 3.0, 3.4);
      Spherocylinder.resetCount();
      Assert.assertEquals("", 0, Spherocylinder.getCount());
   }
}
