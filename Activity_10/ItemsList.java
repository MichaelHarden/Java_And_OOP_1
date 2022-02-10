/**
 * The ItemsList class is a list of Inventory items.
 * 
 * @author Michael Harden
 * @version Nov 8, 2020
 */
public class ItemsList {
   
   // -- FIELDS --

   private InventoryItem[] inventory;
   private int count;

   // -- CONSTRUCTOR --

   /**
    * The ItemsList constructor creates a new instance of the ItemsList calss.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }

   // -- METHODS --

   /**
    * The addItem method adds an item to the inventory list.
    *
    * @param itemIn InventoryItem - item to add
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }

   /**
    * The calculateTotal method calculates the total of each item in the 
    *inventory field.
    *
    * @param electronicsSurcharge double - dollar amount to add to total 
                                           for electronic items
    * @return double - total cost of inventory
    */
   public double calculateTotal(double electronicsSurcharge) {
   
      double total = 0;
      for (int i = 0; i < count; i++) {
      
         total += inventory[i].calculateCost();
      
         if (inventory[i] instanceof ElectronicsItem) {
            total += electronicsSurcharge;
         }
      }
      return total;
   }

   /**
    * The toString method returns a formatted description of the items in 
    * the inventory field.
    *
    * @return String - description of class
    */
   public String toString() {
      String output = "All inventory:\n\n";
   
      for (int i = 0; i < count; i++) {
         output += inventory[i].toString() + "\n";
      }
   
      return output;
   }
}