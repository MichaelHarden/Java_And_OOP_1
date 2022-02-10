/**
 * The InventoryItem Class creates a new item with a name and price.
 * 
 * @author Michael Harden
 * @version Nov 3, 2020
 */
public class InventoryItem {

   // -- VARIABLES --

   protected String name = "";
   protected double price = 0.0;
   private static double taxRate = 0.0;

   // -- CONSTRUCTORS --

   /**
    * InventoryItem method constructs a new instance of the InventoryItem class.
    *
    * @param nameIn  String - name of product
    * @param priceIn double - price of product
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }

   // -- METHODS --

   /**
    * The getName method returns the name of the product.
    *
    * @return String - name of product
    */
   public String getName() {
      return name;
   }

   /**
    * The calculateCost method returns the cost of the product plus the cost of 
    * tax on the product.
    *
    * @return double - total cost
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }

   /**
    * The setTaxRate method sets the taxRate to percentage entered.
    *
    * @param taxRateIn double - new Tax rate
    */
   public static void setTaxRate(double taxRateIn) {
      if (taxRateIn >= 0.0) {
         taxRate = taxRateIn;
      }
   }

   /**
    * The toString method returns details about the product.
    *
    * @return String - product descripttion
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}