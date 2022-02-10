import java.io.FileNotFoundException;

/**
 * The DBPart3 clss demenostrates reading using the methods within the DBList 
 * class to read in a file and parse its data in to a list of databases.
 * 
 * @author Michael Harden 
 * @version Nov 19, 2020
 */
public class DBPart3 {

   /**
    * The main method takes in a name of a file through the commandline 
    * arguments and tried to read that file. if the file does not exist 
    * the error is caught and a message is printed to the console.
    *
    * @param args Command line arguments are used for reading in file name.
    */
   public static void main(String[] args) {
      
      if (args.length == 0) {
         System.out.println(
            "File name expected as command line argument.\nProgram ending.");
         return;
      }
   
      String fileName = "";
      
      fileName = args[0];
      
      try {
         DBList dbList = new DBList();
         dbList.readFile(fileName);
         System.out.println(dbList.generateReport());
         System.out.println(dbList.generateReportByName());
         System.out.println(dbList.generateReportByMonthlyCost());
         System.out.println(dbList.generateInvalidRecordsReport());
      
      } catch (FileNotFoundException fileException) {
         System.out.println("*** Attempted to read file: " 
            + fileName + " (No such file or directory)");
      }
   }
}

