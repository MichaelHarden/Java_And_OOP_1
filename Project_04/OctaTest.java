public class OctaTest {
   public static void main(String[] args) {
      //Octahedron octa1 = new Octahedron("Ex 1", "red", 1);
      Octahedron octa2 = new Octahedron(null, "    red   ", 2);
      // Octahedron octa3 = new Octahedron("    Ex3    ", "     red     ", 3);
      // Octahedron octa4 = new Octahedron(null, null, 5);
      Octahedron octa5 = new Octahedron("Ex 5", null, 6);
   
      //System.out.println(octa1);
      System.out.println(octa2);
      //System.out.println(octa3);
      //System.out.println(octa4);
      //System.out.println(octa5);
   
      System.out.println(octa2.getLabel());
      System.out.println(octa5.getColor());
  
   }
  
}
