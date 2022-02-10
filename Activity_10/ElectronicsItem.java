/**
 * The ElectrongsItem class is a child of the InventoryItem class.
 * 
 * @author Michael Harden
 */
public class ElectronicsItem extends InventoryItem {

   // -- VARIABLES --

   protected double weight = 0.0;

   /** Cost of shipping per pount. */
   public static final double SHIPPING_COST = 1.5;

   // -- CONSTRUCTOR --

   /**
    * The ElectronicsItem constructor constructs an object of the 
    * ElectronicsItem class.
    *
    * @param nameIn   String - name of product
    * @param priceIn  double - price of product
    * @param weightIn double - weight of product
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }

   // -- Methods --

   /**
    * The calculateCost method calculates the total cost of a product.
    *
    * @return double - total cost
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }

}
