/**
 * The OnlineArticle is a child of the OnlineTextItem class.
 * 
 * @author Michael Harden
 * @version Nov 2, 2020
 */
public class OnlineArticle extends OnlineTextItem {

   // -- VARIABLES --

   private int wordCount;

   // -- CONSTRUCTOR --

   /**
    * The OnlineArticle method constructs a new instance of the OnlineArticle
    * class.
    *
    * @param nameIn  String - name of OnlineTextItem
    * @param priceIn double - price of OnlineTextItem
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }

   // -- METHODS --

   /**
    * The setWordCount method sets the word count.
    *
    * @param wordCountIn Int - word count
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}
