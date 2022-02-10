import java.util.Scanner;

/**
 * Allows user to create an octahedron with data they enter 
 * and provides calculated information basted on that data.
 * 
 * @author Michael Harden
 * @version September 16, 2020
 */
public class OctahedronApp {
/**
 * 
 * @param args Command line arguments (not used)
 */
   public static void main(String[] args) {
   
      // initializes a scanner
      Scanner userInput = new Scanner(System.in);
   
      // user data
      String label;
      String color;
      String strEdgeLength;
      double edgeLength;
   
      //initializes a octahedron
      Octahedron octahedron;
   
      // promts user for input
      System.out.println("Enter label, color, and edge length for an "
         + "octahedron.");
      System.out.print("\tlabel: ");
      label = userInput.nextLine();
      System.out.print("\tcolor: ");
      color = userInput.nextLine();
      System.out.print("\tedge: ");
      strEdgeLength = userInput.nextLine();
      userInput.close();
     
      edgeLength = Double.parseDouble(strEdgeLength);
      // assigns entered data to octahedron unless edge lenght < 0
      if (edgeLength < 0) {
         System.out.println("Error: edge must be non-negative.");
      } else {
         // returns information based on user input
         System.out.println("");
         octahedron = new Octahedron(label, color, edgeLength);
         System.out.println(octahedron);  
      }
   }
}
