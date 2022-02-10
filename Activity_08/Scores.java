/**
 * The Score class takes in a list of scores that you can run methods on.
 * 
 * @author Michael Harden
 * @version Oct 25, 2020
 */
public class Scores {

   private int[] numbers;

   /**
    * Scores constructs a new instance of the Scores class.
    *
    * @param numbersIn - list of integers
    */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }

   /**
    * findOdds method finds the even numbers in a list of Scores.
    *
    * @return int[] - array of even integers in Scores
    */
   public int[] findEvens() {
      int numOfEvens = 0;
      for (int num : numbers) {
         if (num % 2 == 0 || num % -2 == 0) {
            numOfEvens++;
         }
      }
      int[] evens = new int[numOfEvens];
      int count = 0;
      for (int num : numbers) {
         if (num % 2 == 0 || num % -2 == 0) {
            evens[count] = num;
            count++;
         }
      }
      return evens;
   }

   /**
    * findOdds method finds the odd numbers in a list of Scores.
    *
    * @return int[] - array of odd integers in Scores
    */
   public int[] findOdds() {
      int numOfOdds = 0;
      for (int num : numbers) {
         if (num % 2 == 1 || num % 2 == -1) {
            numOfOdds++;
         }
      }
      int[] odds = new int[numOfOdds];
      int count = 0;
      for (int num : numbers) {
         if (num % 2 == 1 || num % 2 == -1) {
            odds[count] = num;
            count++;
         }
      }
      return odds;
   }

   /**
    * calculateAverage method calculates the average of the numbers in a list of
    * Scores.
    *
    * @return double - average of Scores
    */
   public double calculateAverage() {
      double sum = 0.0;
      for (int num : numbers) {
         sum += num;
      }
      return sum / numbers.length;
   }

   /**
    * ToString method returns a list of Scores as a string as a string.
    *
    * @return String - Scores
    */
   public String toString() {
      String result = "";
      for (int num : numbers) {
         result += num + "\t";
      }
      return result;
   }

   /**
    * ToStringInRevers method returns a list Scores in reverse as a string.
    *
    * @return String - Scores in revers order
    */
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }
}