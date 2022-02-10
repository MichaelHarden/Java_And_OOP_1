/**
 * The InventoryListApp class takes in a list of InventoryItems and prints a 
 * descprition of them.
 * 
 * @author Michael Harden
 * @version Nov 8, 2020
 */
public class InventoryListApp {
/**
 *The main method is the driver method for the class.
 *
 * @param args command line arguments (not used)
 */
   public static void main(String[] args) {
      
      InventoryItem.setTaxRate(0.05);
   
      ItemsList myItems = new ItemsList();
   
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
   
      System.out.println(myItems.toString());
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   
   }
}
