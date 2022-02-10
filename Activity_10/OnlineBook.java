
/**
 * The OnlineBook class is a child of the OnlineArticle class.
 * 
 * @author Michael Harden
 * @version Nov 2, 2020
 */
public class OnlineBook extends OnlineArticle {

   // -- VARIABLES --

   protected String author;

   // -- CONSTRUCTOR --

   /**
    * The OnlineBook constructer constructs an instance of the OnlineBook class
    * with a name and price.
    *
    * @param nameIn  String - name of author
    * @param priceIn double
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }

   // -- METHODS --

   /**
    * The setAuthor method sets the name of the author of the book.
    *
    * @param authorIn String - author of book
    */
   public void setAuthor(String authorIn) {
      if (authorIn == null) {
         return;
      }
      author = authorIn;
   }

   /**
    * Prints detailed description of book.
    *
    * @return String - description of book
    */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
}
