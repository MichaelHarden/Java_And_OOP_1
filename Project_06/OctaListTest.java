import java.io.FileNotFoundException;
import java.util.ArrayList;

class OctaListTest {
   public static void main(String[] args) throws FileNotFoundException {
      // Octahedron octa1 = new Octahedron("Mr", "red", 5.0);
      // Octahedron octa2 = new Octahedron("Mrs", "pink", 4.0);
      // Octahedron octa3 = new Octahedron("Sr", "orange", 3.0);
      // Octahedron octa4 = new Octahedron("Dr", "yellow", 2.0);
   
   
      ArrayList<Octahedron> myList = new ArrayList<Octahedron>();
   
      // myList.add(octa1);
      // myList.add(octa2);
      // myList.add(octa3);
      // myList.add(octa4);
   
      OctahedronList oList = new OctahedronList("", myList);
      
      //oList.addOctahedron("Prof", "green", 6.0);
   
      //oList.editOctahedron("Mrr","purple", 0.5);
      
      
     
      
      oList = oList.readFile("Octahedron_data_1.txt");

      System.out.print(oList);
   
   }
}