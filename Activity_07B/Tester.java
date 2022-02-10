public class Tester {
   public static void main(String[] args) {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(30);
      // System.out.println(cstmr.getBalance());

      cstmr.changeBalance(-5);
      // System.out.println(cstmr.getBalance());

      cstmr.setLocation("Boston, MA");
      // System.out.println(cstmr.getLocation());

      cstmr.setLocation("Atlanta", "GA");
      // System.out.println(cstmr.getLocation());
      
      System.out.println(cstmr);

      Customer cstmr2 = new Customer("Todd Packer");
      cstmr2.changeBalance(25.000001);
      int bigger = cstmr.compareTo(cstmr2);
      System.out.println("\n" + bigger);

      Customer cstmr3 = new Customer("Todd Packer");
      cstmr3.changeBalance(25);
      int bigger3 = cstmr.compareTo(cstmr3);
      System.out.println("\n" + bigger3);

      Customer cstmr4 = new Customer("Todd Packer");
      cstmr4.changeBalance(24.99999);
      int bigger4 = cstmr.compareTo(cstmr4);
      System.out.println("\n" + bigger4);

   }
}
