import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * SpherocylinderListTest class tests the methods within the SpherocylinderList
 * lass using jUnit.
 * 
 * @author Micael Harden
 * @version Oct 27, 2020
 */
public class SpherocylinderListTest {

   /**
    * Fixture initialization (common initialization for all tests).
    **/
   @Before
   public void setUp() {
   }

   /** Tests the getName() method. **/
   @Test
   public void getNameTest() {
      Spherocylinder example = new Spherocylinder("", 0.0, 0.0);
      Spherocylinder[] spherocylindersExample = { example };
      SpherocylinderList sphList = new SpherocylinderList(
         "List 1", spherocylindersExample, 1);
      Assert.assertEquals("List 1", sphList.getName());
   }

   /** Tests the addSpherocylinderTest() method. **/
   @Test
   public void addSpherocylinderTest() {
   
      Spherocylinder example1 = new Spherocylinder("Ex 1", 0.5, 0.5);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 1.0, 1.0);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 0.25, 0.25);
      Spherocylinder[] spherocylindersList = { example1, example2, example3 };
      SpherocylinderList sphListExample = new SpherocylinderList(
         "List 1", spherocylindersList, 3);
   
      sphListExample.addSpherocylinder("Ex 4", 1.5, 1.5);
   
      Assert.assertEquals(4, sphListExample.numberOfSpherocylinders());
   }

   /** Tests the findSpherocylinder() method. **/
   @Test
   public void findSpherocylinderTest() {
   
      Spherocylinder example1 = new Spherocylinder("Ex 1", 0.5, 0.5);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 1.0, 1.0);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 0.25, 0.25);
      Spherocylinder[] spherocylindersList = { 
         null, example1, example2, example3 };
      SpherocylinderList sphListExample = new SpherocylinderList(
         "List 1", spherocylindersList, 3);
   
      Assert.assertEquals("Ex 3", sphListExample.findSpherocylinder(
         "Ex 3").getLabel());
   
      Assert.assertEquals(null, sphListExample.findSpherocylinder("Ex 4"));
   
   }

   /** Tests the deleteSpherocylinder() method. **/
   @Test
   public void deleteSpherocylinderTest() {
   
      Spherocylinder example1 = new Spherocylinder("Ex 1", 0.5, 0.5);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 1.0, 1.0);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 0.25, 0.25);
      Spherocylinder[] spherocylindersList = { 
         null, example1, example2, example3 };
      SpherocylinderList sphListExample = new SpherocylinderList(
         "List 1", spherocylindersList, 1);
   
      Assert.assertEquals(null, sphListExample.deleteSpherocylinder("Ex 4"));
   
      sphListExample.deleteSpherocylinder("  ex 2  ");
      Assert.assertEquals("Ex 3", sphListExample.getList()[1].getLabel());
   
   }

   /** Tests the editSpherocylinder() method. **/
   @Test
   public void editSpherocylinderTest() {
   
      Spherocylinder example1 = new Spherocylinder("Ex 1", 0.5, 0.5);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 1.0, 1.0);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 0.25, 0.25);
      Spherocylinder[] spherocylindersList = { 
         null, example1, example2, example3 };
      SpherocylinderList sphListExample = new SpherocylinderList(
         "List 1", spherocylindersList, 3);
   
      sphListExample.editSpherocylinder("    ex 1  ", 1.0, 1.0);
      Assert.assertTrue(sphListExample.editSpherocylinder(
         "    ex 1  ", 1.0, 1.0));
   
      Assert.assertFalse(sphListExample.editSpherocylinder("Ex 5", 3.2, 3.4));
   
   }

   /** Tests the editSpherocylinder() method. **/
   @Test
   public void findSpherocylinderWithLargestVolumeTest() {
   
      Spherocylinder example1 = new Spherocylinder("Ex 1", 0.5, 0.5);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 1.0, 1.0);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 0.25, 0.25);
   
      Spherocylinder[] spherocylindersList1 = {
         null, example1, null, example2, example3 };
      SpherocylinderList sphListExample1 = new SpherocylinderList(
         "List 1", spherocylindersList1, 3);
   
      Assert.assertEquals("Ex 2", sphListExample1
         .findSpherocylinderWithLargestVolume().getLabel());
   
      Spherocylinder[] spherocylindersList2 = { null };
      SpherocylinderList sphListExample2 = new SpherocylinderList(
         "List 2", spherocylindersList2, 0);
      Assert.assertEquals(
         null, sphListExample2.findSpherocylinderWithLargestVolume());
   
   }

   /** Tests the totalSurfaceArea() method. **/
   @Test
   public void totalSurfaceAreaTest() {
   
      Spherocylinder example1 = new Spherocylinder("Ex 1", 0.5, 0.5);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 1.0, 1.0);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 0.25, 0.25);
   
      Spherocylinder[] spherocylindersList1 = { example1, example2, example3 };
      SpherocylinderList sphListExample1 = new SpherocylinderList(
         "List 1", spherocylindersList1, 3);
   
      Assert.assertEquals(
         24.740042147, sphListExample1.totalSurfaceArea(), 0.000001);
   
      Spherocylinder[] spherocylindersList2 = {};
      SpherocylinderList sphListExample2 = new SpherocylinderList(
         "List 2", spherocylindersList2, 0);
      Assert.assertEquals(0.0, sphListExample2.totalSurfaceArea(), 0.000001);
   
      Spherocylinder[] spherocylindersList3 = { 
         example1, example2, example3, null };
      SpherocylinderList sphListExample3 = new SpherocylinderList(
         "List 3", spherocylindersList3, 3);
      Assert.assertEquals(
         24.740042147, sphListExample3.totalSurfaceArea(), 0.000001);
   
   }

   /** Tests the averageSurfaceArea() method. **/
   @Test
   public void averageSurfaceAreaTest() {
   
      Spherocylinder example1 = new Spherocylinder("Ex 1", 0.5, 0.5);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 1.0, 1.0);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 0.25, 0.25);
   
      Spherocylinder[] spherocylindersList1 = { example1, example2, example3 };
      SpherocylinderList sphListExample1 = new SpherocylinderList(
         "List 1", spherocylindersList1, 3);
   
      Assert.assertEquals(
         8.24668071567, sphListExample1.averageSurfaceArea(), 0.000001);
   
      Spherocylinder[] spherocylindersList2 = { null };
      SpherocylinderList sphListExample2 = new SpherocylinderList(
         "List 2", spherocylindersList2, 0);
      Assert.assertEquals(0.0, sphListExample2.averageVolume(), 0.000001);
   
   }

   /** Tests the totalVolume() method. **/
   @Test
   public void totalVolumeTest() {
   
      Spherocylinder example1 = new Spherocylinder("Ex 1", 0.5, 0.5);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 1.0, 1.0);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 0.25, 0.25);
   
      Spherocylinder[] spherocylindersList1 = { example1, example2, example3 };
      SpherocylinderList sphListExample1 = new SpherocylinderList(
         "List 1", spherocylindersList1, 3);
   
      Assert.assertEquals(
         8.36121794784, sphListExample1.totalVolume(), 0.000001);
   
      Spherocylinder[] spherocylindersList2 = {};
      SpherocylinderList sphListExample2 = new SpherocylinderList(
         "List 2", spherocylindersList2, 0);
      Assert.assertEquals(0.0, sphListExample2.totalVolume(), 0.000001);
   
      Spherocylinder[] spherocylindersList3 = { 
         example1, example2, example3, null };
      SpherocylinderList sphListExample3 = new SpherocylinderList(
         "List 3", spherocylindersList3, 3);
      Assert.assertEquals(
         8.36121794784, sphListExample3.totalVolume(), 0.000001);
   
   }

   /** Tests the averageVolume() method. **/
   @Test
   public void averageVolumeTest() {
   
      Spherocylinder example1 = new Spherocylinder("Ex 1", 0.5, 0.5);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 1.0, 1.0);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 0.25, 0.25);
   
      Spherocylinder[] spherocylindersList1 = { example1, example2, example3 };
      SpherocylinderList sphListExample1 = new SpherocylinderList(
         "List 1", spherocylindersList1, 3);
   
      Assert.assertEquals(
         2.78707264928, sphListExample1.averageVolume(), 0.000001);
   
      Spherocylinder[] spherocylindersList2 = { null };
      SpherocylinderList sphListExample2 = new SpherocylinderList(
         "List 2", spherocylindersList2, 0);
      Assert.assertEquals(0.0, sphListExample2.averageVolume(), 0.000001);
   
   }

   /** Tests the toString() method. **/
   @Test
   public void toStringTest() {
   
      Spherocylinder example1 = new Spherocylinder("Ex 1", 0.5, 0.5);
      Spherocylinder example2 = new Spherocylinder("Ex 2", 1.0, 1.0);
      Spherocylinder example3 = new Spherocylinder("Ex 3", 0.25, 0.25);
   
      Spherocylinder[] spherocylindersList1 = { example1, example2, example3 };
      SpherocylinderList sphListExample1 = new SpherocylinderList(
         "List 1", spherocylindersList1, 3);
   
      String expected = "----- Summary for List 1 -----\n";
      expected += "Number of Spherocylinders: 3\n";
      expected += "Total Surface Area: 24.74\n";
      expected += "Total Volume: 8.361\n";
      expected += "Average Surface Area: 8.247\n";
      expected += "Average Volume: 2.787";
      Assert.assertEquals(expected, sphListExample1.toString());
   
   }

}
