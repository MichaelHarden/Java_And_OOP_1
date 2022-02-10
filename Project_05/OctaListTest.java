import java.util.ArrayList;

class OctaListTest {
   public static void main(String[] args) {
      Octahedron octa1 = new Octahedron("Mr", "red", 5.0);
      Octahedron octa2 = new Octahedron("Mrs", "pink", 4.0);
      Octahedron octa3 = new Octahedron("Sr", "orange", 3.0);
      Octahedron octa4 = new Octahedron("Dr", "yellow", 2.0);


      ArrayList<Octahedron> myList = new ArrayList<Octahedron>();

      myList.add(octa1);
      myList.add(octa2);
      myList.add(octa3);
      myList.add(octa4);

      OctahedronList oList = new OctahedronList("file", myList);

      System.out.println(oList);

   }
}