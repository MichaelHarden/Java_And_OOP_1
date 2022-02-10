import java.io.FileNotFoundException;

/**
 * The DBPart2 class passes in a file to be parsed and prints 3 reports on 
 * the data extracted form the file.
 *
 * @author Michael Harden
 * @version Nov 12, 2020
 */
public class DBPart2 {
   /**
    * The main method runs at the start of the program and takes in the name 
    * of a file to be parsed via the command line. Then generates three 
    * reports on data extracted form the parsed file.
    *
    * @param args Command line argurments take in name of file to parse
    * @throws FileNotFoundException if file is not foind throws exception
    */
   public static void main(String[] args) throws FileNotFoundException {
      
      DBList dbList = new DBList();
      
      if (args.length == 0) {
         System.out.println(
               "File name expected as command line argument.\nProgram ending.");
         return;
      }
      for (String db: args) {
         dbList.readFile(db);
      }
   
      System.out.println(dbList.generateReport());
      System.out.println(dbList.generateReportByName());
      System.out.println(dbList.generateReportByMonthlyCost());
      
   }
}
