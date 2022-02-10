import java.util.Comparator;
/**
 * The MonthlyCostComparator implements the Comparator interface and 
 * compares two databases.
 *
 * @author Michael Harden.
 * @version Nov 12, 2020
 */
public class MonthlyCostComparator implements Comparator<DB> {

   /**
    * The compare method compares two databases by their monthly cost.
    *
    * @param db1 first database in comparison
    * @param db2 second database in comparison
    * @return int - If db2 has higher value, the method returns 1.
    *               If db1 has higher value, the method returns -1.
    *               If db1 and db2 are equal the method returns 0.
    */
   public int compare(DB db1, DB db2) {
      
      if (db1.monthlyCost() > db2.monthlyCost()) {
         return -1;
      
      } else if (db2.monthlyCost() > db1.monthlyCost()) {
         return 1;
      
      } else {
         return 0;
      }
   }
   
}
