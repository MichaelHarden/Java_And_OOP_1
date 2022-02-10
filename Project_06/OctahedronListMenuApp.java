import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * OctahedronListMenueApp callows the user to preform multipul actions
 * on a list of Octahedrons through a user interface.
 * 
 * @author Michael Harden
 * @version September 29, 2020
 */
public class OctahedronListMenuApp {
   /**
    * main run and allows user to enter file for data extraction to find
    * octahedrons. the users can preform actions on that data.
    *
    * @param args Command line arguments (not used)
    * @throws FileNotFoundException - if file is not found
    */
   public static void main(String[] args) throws FileNotFoundException {
   
      String name = "";
   
      // initilizes Arraylist and OctahedronList classes
      ArrayList<Octahedron> octahedrons = new ArrayList<Octahedron>();
      OctahedronList octahedronList = new OctahedronList(name, octahedrons);
      
      // initilizes the Scanner class
      Scanner userInput = new Scanner(System.in);
   
      // promts user to select what action to preform
      System.out.println("Octahedron List System Menu");
      System.out.println("R - Read File and Create Octahedron List");
      System.out.println("P - Print Octahedron List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add Octahedron");
      System.out.println("D - Delete Octahedron");
      System.out.println("F - Find Octahedron");
      System.out.println("E - Edit Octahedron");
      System.out.println("Q - Quit");
      
      
      char choice = 'Q';
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'R': // reads in a file
               System.out.print("\tFile Name: ");
               octahedronList = octahedronList.readFile(userInput.nextLine());
               System.out.println("\tFile read in and Octahedron List "
                  + "created\n");
               break;
         
            case 'P': // prints octahedron from the file
               System.out.println(octahedronList);
               break;
         
            case 'S': // prints a summary of the octahedron
               System.out.println("\n" + octahedronList.summaryInfo() + "\n");
               break;
         
            case 'A': // adds octahedron to 
               System.out.print("\tLabel: ");
               String label = userInput.nextLine();
               System.out.print("\tColor: ");
               String color = userInput.nextLine();
               System.out.print("\tEdge: ");
               Double edge = Double.parseDouble(userInput.nextLine());
               octahedronList.addOctahedron(label, color, edge);
               System.out.println("\t*** Octahedron added ***\n");
               break;
         
         
            case 'D': // deletes octahedron
               System.out.print("\tLabel: ");
               String deleteLabel = userInput.nextLine();
               if (octahedronList.findOctahedron(deleteLabel) != null) {
                  deleteLabel = octahedronList.deleteOctahedron(deleteLabel)
                     .getLabel();
                  System.out.println("\t\"" + deleteLabel + "\" deleted\n");
                  break;
               
               } else if (octahedronList.deleteOctahedron(deleteLabel) 
                  == null) {
                  System.out.println("\t\"" + deleteLabel + "\" not found\n");
                  break;
               }
               break;
         
            case 'F': // finds octahedron and if it exists prints it
               System.out.print("\tLabel: ");
               String findLabel = userInput.nextLine();
               if (octahedronList.findOctahedron(findLabel) != null) {
                  octahedronList.findOctahedron(findLabel);
                  System.out.println(octahedronList.findOctahedron(
                     findLabel) + "\n");
                  break;
               
               } else if (octahedronList.findOctahedron(findLabel) == null) {
                  System.out.println("\t\"" + findLabel + "\" not found\n");
                  break;
               }
               break;
         
            case 'E': // edits octahedron
               System.out.print("\tLabel: ");
               String editLabel = userInput.nextLine();
               System.out.print("\tColor: ");
               String editColor = userInput.nextLine();
               System.out.print("\tEdge: ");
               Double editEdge = Double.parseDouble(userInput.nextLine());
            
               if (octahedronList.findOctahedron(editLabel) 
                  != null) {
                  editLabel = octahedronList.editOctahedron(editLabel, 
                     editColor, editEdge).getLabel();
                  System.out.println("\t\"" + editLabel + "\" successfully" 
                     + " edited\n");
                  break;
               } else if (octahedronList.findOctahedron(editLabel) == null) {
                  System.out.println("\t\"" + editLabel + "\" not found\n");
                  break;
               }
               break;
         
            case 'Q': // quit out of the UI
               break;
         
            default:
               System.out.println("\t*** invalid code ***\n");
         
         }
      } while (choice != 'Q');
      userInput.close();
   }
}