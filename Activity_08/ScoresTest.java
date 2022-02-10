public class ScoresTest {
   public static void main(String[] args) {
      int[] nums = { -1, -2, -3, 4, 6, 7, 8, -9, -10 };
      Scores points = new Scores(nums);

      System.out.print("Evens\n");
      for (int num : points.findEvens()) {
         System.out.print(num + "\t");
      }

      System.out.print("\n");
      System.out.print("Odds\n\n");
      for (int num : points.findOdds()) {
         System.out.print(num + "\t");
      }

      System.out.print("\n\n");
      System.out.print("Average\n");
      System.out.print(points.calculateAverage() + "\n");

      System.out.println(points.toString());
      System.out.print(points.toStringInReverse());
   }

}
