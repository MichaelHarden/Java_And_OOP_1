import java.util.ArrayList;

public class TempTest {
    public static void main(String[] args) {
      ArrayList<Integer> tempList = new ArrayList<Integer>();

      tempList.add(34);   
      tempList.add(52);
      tempList.add(36);
      tempList.add(65);

      Temperatures temps = new Temperatures(tempList);

      System.out.println(temps);

      System.out.println(temps.lowerMinimum(33)); // 33
      System.out.println(temps.lowerMinimum(35)); // 34
      System.out.println(temps.higherMaximum(66)); // 66
      System.out.println(temps.higherMaximum(64)); // 65



   }
}
