/**
 * the InvalidCategoryException is an extention of the Exception class and is
 * throught when a incorrect category is given.
 * 
 * @author Michael Harden
 * @version Nov 18, 2020
 */
public class InvalidCategoryException extends Exception {

   /**
    * The InvalidCategory InvalidCategoryException takes in a invalid category
    * and returns a description of the error.
    * 
    * @param categoryIn String - the invalid category
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}
