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

   /**
    * Fixture initialization (common initialization for all tests).
    **/
   @Before
   public void setUp() {
   }

   /** Tests setLabel and getLabel methods. */
   @Test
   public void getLabelTest() {
      Spherocylinder example = new Spherocylinder("", 0.0, 0.0);
      example.setLabel("  Ex 1 ");
      Assert.assertEquals("Ex 1", example.getLabel());
      example.setLabel(null);
      Assert.assertEquals("Ex 1", example.getLabel());
   }

   /** Tests setRadius and getRadius methods. */
   @Test
   public void getRadiusTest() {
      Spherocylinder example = new Spherocylinder("Ex 1", 0.0, 0.0);
      example.setRadius(1.5);
      Assert.assertEquals(1.5, example.getRadius(), .000001);
      example.setRadius(-1.5);
      Assert.assertEquals(1.5, example.getRadius(), .000001);
   }

   /** Tests setCylinderHeight and getCylinderHeight methods. */
   @Test
   public void getCylinderHeightTest() {
      Spherocylinder example = new Spherocylinder("Ex 1", 0.0, 0.0);
      example.setCylinderHeight(1.5);
      Assert.assertEquals(1.5, example.getCylinderHeight(), .000001);
      example.setCylinderHeight(-1.5);
      Assert.assertEquals(1.5, example.getCylinderHeight(), .000001);
   }

   /** Tests circumference method. */
   @Test
   public void circumferenceTest() {
      Spherocylinder example1 = new Spherocylinder("Ex 1", 0.5, 0.25);
      Assert.assertEquals(3.14159265, example1.circumference(), .000001);
      Spherocylinder example2 = new Spherocylinder("Ex 2", -0.5, 0.25);
      Assert.assertEquals(0.0, example2.circumference(), .000001);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 0.0, 0.25);
      Assert.assertEquals(0.0, example3.circumference(), .000001);
   }

   /** Tests surfaceArea method. */
   @Test
   public void surfaceAreaTest() {
      Spherocylinder example1 = new Spherocylinder("Ex 1", 10.8, 10.1);
      Assert.assertEquals(2151.111319, example1.surfaceArea(), .00001);
      Spherocylinder example2 = new Spherocylinder("Ex 2", -10.8, 10.1);
      Assert.assertEquals(0.0, example2.surfaceArea(), .0000001);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 0.0, 10.1);
      Assert.assertEquals(0.0, example3.surfaceArea(), .0000001);
   }

   /** Tests volume method. */
   @Test
   public void volumeTest() {
      Spherocylinder example1 = new Spherocylinder("Ex 1", 0.5, 0.25);
      Assert.assertEquals(0.71994831, example1.volume(), .0000001);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 0.0, 0.25);
      Assert.assertEquals(0.0, example2.volume(), .0000001);
      Spherocylinder example3 = new Spherocylinder("Ex 3", -0.5, 0.25);
      Assert.assertEquals(0.0, example3.volume(), .0000001);
   
   }

   /** Tests equals method. */
   @Test
   public void equalsTest() {
      Spherocylinder example = new Spherocylinder("Ex 1", 5.0, 3.2);
      Assert.assertFalse(example.equals((Double) 5.5));
      Assert.assertFalse(example.equals(new Spherocylinder("", 5.0, 3.2)));
      Assert.assertFalse(example.equals(new Spherocylinder("Ex 1", 3.0, 3.2)));
      Assert.assertFalse(example.equals(new Spherocylinder("Ex 1", 5.0, 3.0)));
      Assert.assertTrue(example.equals(new Spherocylinder("Ex 1", 5.0, 3.2)));
   }

   /** Tests compareTo method. */
   @Test
   public void compareToTest() {
      Spherocylinder example1 = new Spherocylinder("Ex 1", 5.0, 3.2);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 5.0, 3.2);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 5.0, 6.0);
   
      Assert.assertEquals(0, example1.compareTo(example2));
      Assert.assertEquals(-1, example1.compareTo(example3));
      Assert.assertEquals(1, example3.compareTo(example2));
   }

   /** Test hashCode method. */
   @Test
   public void hashCodeTest() {
      Spherocylinder example = new Spherocylinder("Ex 1", 5.0, 3.2);
      Assert.assertEquals(0, example.hashCode());
   }

   /** Tests toString method. */
   @Test
   public void toStringTest() {
      Spherocylinder example = new Spherocylinder("Small Example", 0.5, 0.25);
      String expected = "";
      expected += "Spherocylinder \"Small Example\" with radius 0.5 and " 
         + "cylinder height 0.25 has:\n\t";
      expected += "circumference = 3.142 units\n\t";
      expected += "surface area = 3.927 square units\n\t";
      expected += "volume = 0.72 cubic units";
      Assert.assertEquals(expected, example.toString());
   }

   /** Tests getCount method. */
   @Test
   public void getCountTest() {
      Spherocylinder.resetCount();
      Spherocylinder example1 = new Spherocylinder("Ex 1", 5.0, 3.2);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 4.0, 3.3);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 3.0, 3.4);
      Assert.assertEquals(3, Spherocylinder.getCount());
   }

   /** Tests resetCount method. */
   @Test
   public void resetCountTest() {
      Spherocylinder example1 = new Spherocylinder("Ex 1", 5.0, 3.2);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 4.0, 3.3);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 3.0, 3.4);
      Spherocylinder.resetCount();
      Assert.assertEquals(0, Spherocylinder.getCount());
   }
}
