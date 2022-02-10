import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * OctahedronListApp scans a file and feed in the data on the file
 * and stores the data as a ArrayList of Octahedrons.
 * Then returns formatted summary for on each Octahedron contained 
 * in the input file.
 *
 * @author Michael Harden
 * @version Septemer 23, 2020
 */
public class OctahedronListApp {
/**
 * 
 * @param args Command line arguments (not used)
 * @throws FileNotFoundException if entered file is not found
 */
   public static void main(String[] args) throws FileNotFoundException {
   
      // creates and array list of octahedrons
      ArrayList<Octahedron> myList = new ArrayList<Octahedron>();
   
      // promts user to enter the file name that is to be scanned
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      // initializes scanner to scan file
      Scanner scanFile = new Scanner(new File(fileName));
      String octahedronListName = "";
      
      if (scanFile.hasNext()) {
         octahedronListName = scanFile.nextLine();
      }
   
      // steps through the file and adds each octahedron to list
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         String color = scanFile.nextLine();
         String edge = scanFile.nextLine();
      
         Octahedron octa 
            = new Octahedron(label, color, Double.parseDouble(edge));
            
         myList.add(octa);
      }
      scan.close();
      scanFile.close();
   
      // initalizes the OctahedronList Class
      OctahedronList octaList = new OctahedronList(octahedronListName, myList);
   
      // prints out summery of each octahedron in list
      System.out.println("\n" + octaList + "\n");
      System.out.println(octaList.summaryInfo());
   
   }
   
}
