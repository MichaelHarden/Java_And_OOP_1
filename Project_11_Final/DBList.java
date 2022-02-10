import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * The DBList class creates a list to store databases. you can add data bases 
 * by passing in properly formatted files or by using the class methods.
 * 
 * @author Michael Harden
 * @version Nov 12, 2020
 */
public class DBList {
   
   // -- FIELDS --

   private DB[] dbArray;
   private String[] invalidRecordsArray;

   // -- CONSTRUCTORS --

   /**
    * The DBList constructor initializes an instance of the DBList class with 
    * empty lists.
    */
   public DBList() {
      dbArray = new DB[0];
      invalidRecordsArray = new String[0];
   }

   // -- METHODS --

   /**
    * The getDBArray method returns a referance to the dbArray list.
    * @return DB[] - the dbArray list of class
    */
   public DB[] getDBArray() {
      return dbArray;
   }

   /**
    * The getInvalidRecordsArray method returns a referance to the 
    * invalidRecordsArray list.
    * @return String[] - the invalidRecordsArray list of class
    */
   public String[] getInvalidRecordsArray() {
      return invalidRecordsArray;
   }

   /**
    * The addDB method resizes the dbArray and adds databaseIn to the last 
    * index of the list.
    *
    * @param databaseIn DB - the database to add to dbArray
    */
   public void addDB(DB databaseIn) {
   
      dbArray = Arrays.copyOf(dbArray, dbArray.length + 1);
      dbArray[dbArray.length - 1] = databaseIn;
   
   }

   /**
    * The addInvalidRecord method resizes the invalidRecordsArray and adds 
    * invalidRecordIn to the last index of the list.
    *
    * @param invalidRecordIn String - the String to add to invalidRecordsArray
    */
   public void addInvalidRecord(String invalidRecordIn) {
   
      invalidRecordsArray = Arrays.copyOf(
         invalidRecordsArray, 
         invalidRecordsArray.length + 1);
      invalidRecordsArray[invalidRecordsArray.length - 1] = invalidRecordIn;
   
   }

   /**
    * The readFile method takes in and parses a file, if the file is 
    * correctly formattted, it will add the database objects found in it 
    * to the dbArray list.
    *
    * @param dataFile String - name of file to parse
    * @throws FileNotFoundException - if file is not found throws exeception
    */
   public void readFile(String dataFile) throws FileNotFoundException {
   
      Scanner scanFile = new Scanner(new File(dataFile));
      
      while (scanFile.hasNext()) {
         // nextline parses in the next line of the file
         String nextline = scanFile.nextLine(); 
         
         try {
            readLineInFile(nextline);
         
         } catch (InvalidCategoryException categoryException) {
            String record = nextline + "\n" + categoryException + "\n\n";
            addInvalidRecord(record);
         
         } catch (NumberFormatException numException) {
            String record = nextline + "\n" + numException + "\n\n";
            addInvalidRecord(record);
         
         } catch (NoSuchElementException elementException) {
            String record = nextline + "\n" + elementException 
               + ": For missing input data\n\n";
            addInvalidRecord(record);
         }
      }
      scanFile.close();
   }

   /**
    * The readLineInFile is a helper method to readFile method. The current 
    * line is passed in from the scanner in the readFile method. The current 
    * line is parsed and if the data is properly formatted then a data base 
    * is added to the dbArray. if the data is improperly formatted a error 
    * is generated and added to the invalidRecordsArray.
    *
    * @param currentLine String - the current line of the file that readFile is 
    *                             on
    * @throws InvalidCategoryException throw when the key in the currentline 
                does not beling to any database type.
    */
   private void readLineInFile(String currentLine) 
      throws InvalidCategoryException {
      // scanLine parses across a given line and extracts the data from that 
      // single line
      Scanner scanLine = new Scanner(currentLine).useDelimiter(",");
   
      // key is the character code to tell the switch statement which 
      // case to run
      char key = scanLine.next().toUpperCase().charAt(0);
   
      switch (key) {
         
         case 'C': // case for Centralized databases
            String centralizedDbName = scanLine.next();
            double centralizedDbBaseCost = Double.parseDouble(scanLine.next());
            double centralizedDbStorge = Double.parseDouble(scanLine.next());
            int centralizedDbLicense = Integer.parseInt(scanLine.next());
               
            CentralizedDB scannedCentralizedDb = new CentralizedDB(
                  centralizedDbName,
                  centralizedDbBaseCost, 
                  centralizedDbStorge, 
                  centralizedDbLicense
                  );
            
            addDB(scannedCentralizedDb);
            
            break;
         
         case 'D': // case for Distributed databases
            String distributedDbName = scanLine.next();
            double distributedDbBaseCost = Double.parseDouble(scanLine.next());
            double distributedDbStorge = Double.parseDouble(scanLine.next());
            int distributedDbNumberOfUsers = Integer.parseInt(scanLine.next());
            double distributedDbCostPerUser = Double.parseDouble(
               scanLine.next());
            
            DistributedDB scannedDistributedDb = new DistributedDB(
                  distributedDbName, 
                  distributedDbBaseCost, 
                  distributedDbStorge, 
                  distributedDbNumberOfUsers,
                  distributedDbCostPerUser
               );
            
            addDB(scannedDistributedDb);
            
            break;
            
         case 'H': // case for HomogeneousDB databases
            String homogeneousDbName = scanLine.next();
            double homogeneousDbBaseCost = Double.parseDouble(scanLine.next());
            double homogeneousDbStorge = Double.parseDouble(scanLine.next());
            int homogeneousDbNumberOfUsers = Integer.parseInt(scanLine.next());
            double homogeneousDbCostPerUser = Double.parseDouble(
               scanLine.next());
            
            HomogeneousDB scannedHomogeneousDb = new HomogeneousDB(
                  homogeneousDbName, 
                  homogeneousDbBaseCost, 
                  homogeneousDbStorge, 
                  homogeneousDbNumberOfUsers,
                  homogeneousDbCostPerUser
               );
            
            addDB(scannedHomogeneousDb);
            
            break;
         
         case 'E': // case for Heterogeneous databases
            String heterogeneousDbName = scanLine.next();
            double heterogeneousDbBaseCost = Double.parseDouble(
               scanLine.next());
            double heterogeneousDbStorge = Double.parseDouble(scanLine.next());
            int heterogeneousDbNumberOfUsers = Integer.parseInt(
               scanLine.next());
            double heterogeneousDbCostPerUser = Double.parseDouble(
               scanLine.next());
            
            HeterogeneousDB scannedHeterogeneousDb = new HeterogeneousDB(
                  heterogeneousDbName, 
                  heterogeneousDbBaseCost, 
                  heterogeneousDbStorge, 
                  heterogeneousDbNumberOfUsers,
                  heterogeneousDbCostPerUser
               );
            
            addDB(scannedHeterogeneousDb);
            
            break;
         
         default: // runs when no other case is met
            scanLine.close();
            throw new InvalidCategoryException(Character.toString(key));
      }
      scanLine.close();
   }


   /**
    * The generateReport method runs the toString method for each database in 
    * the dbArray list and returns a report from each database.
    *
    * @return String - report of databases in the list.
    */
   public String generateReport() {
   
      String report = "-------------------------------\n";
      report += "Monthly Database Report\n";
      report += "-------------------------------\n";
   
      for (int i = 0; i < dbArray.length; i++) {
         report += (dbArray[i].toString() + "\n\n");
      }
      
      return report;
   } 

   /**
    * The generateReportByName method orders the databases in the dbArray list 
    * by name alphabeticly and then runs the toString method for each and 
    * returns a report from the databases.
    *
    * @return String - report of databases in the list ordered by name.
    */
   public String generateReportByName() {
      Arrays.sort(dbArray);
      
      String report = "-----------------------------------------\n";
      report += "Monthly Database Report (by Name)\n";
      report += "-----------------------------------------\n";
   
      for (int i = 0; i < dbArray.length; i++) {
         report += (dbArray[i].toString() + "\n\n");
      }
      
      return report;
   }

   /**
    * The generateReportByMonthlyCost method orders the databases in the 
    * dbArray list by montly cost from lowest to highest and then runs 
    * the toString method for each and returns a report from the databases.
    *
    * @return String - report of databases in the list ordered by monthly cost.
    */
   public String generateReportByMonthlyCost() {
      Arrays.sort(dbArray, new MonthlyCostComparator());
   
      String report = "-------------------------------------------------\n";
      report += "Monthly Database Report (by Monthly Cost)\n";
      report += "-------------------------------------------------\n";
   
      for (int i = 0; i < dbArray.length; i++) {
         report += (dbArray[i].toString() + "\n\n");
      }
      
      return report;
   }
   
   /**
    * The generateInvalidRecordsReport method prints out the 
    * invalidRecordsArray 
    * which contains a description of all invalid Records found in a file.
    *
    * @return String - report of all invalid records
    */
   public String generateInvalidRecordsReport() {
      String report = "----------------------\n";
      report += "Invalid Records Report\n";
      report += "----------------------\n";
      
      for (String record: invalidRecordsArray) {
         report += record;
      }
   
      return report;
   }
}
