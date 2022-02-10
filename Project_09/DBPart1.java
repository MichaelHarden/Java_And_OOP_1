/**
 * The DBPart1 class create one of each type of data base.
 *
 * @author Michael Harden  
 * @version Nov 4, 2020
 */
public class DBPart1 {

   /**
    * The main method creates one database of each type and prints their
    * description.
    *
    * @param args Command line arguments (not used)
    */
   public static void main(String[] args) {
      DB.resetCount();
      CentralizedDB db1 = new CentralizedDB("Database One", 1200.0, 5.0, 1500);
      System.out.println("\n" + db1 + "\n");
   
      DistributedDB db2 = new DistributedDB("Database Two", 2000, 7.5, 100, 12);
      System.out.println(db2 + "\n");
   
      HomogeneousDB db3 = new HomogeneousDB(
         "Database Three", 2000, 7.5, 100, 14.0);
      System.out.println(db3 + "\n");
   
      HeterogeneousDB db4 = new HeterogeneousDB(
         "Database Four", 2000, 7.5, 100, 14.0);
      System.out.println(db4);
   }
}
