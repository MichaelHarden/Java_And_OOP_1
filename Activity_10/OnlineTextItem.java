/**
 * The OnlineTextTem is a child of the InventoryItem class.
 * 
 * @author Michael Harden
 * @version Nov 2, 2020
 */
public abstract class OnlineTextItem extends InventoryItem {

   // -- CONSTRUCTOR --

   /**
    * The OnlineTextItem constructs a new instance of the OnlineTextItem class.
    *
    * @param nameIn  String - name of product
    * @param priceIn double - prie of product
    */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

   // -- METHODS --

   /**
    * returns the price of the product from parent class.
    *
    * @return double - price of product
    */
   public double calculateCost() {
      return price;
   }

}
