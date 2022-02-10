public class Tester {
   public static void main(String[] args) {

      // CentralizedDB cb1 = new CentralizedDB("One", 1200.0, 5.0, 1500);
      // System.out.println(cb1);

      // DistributedDB ddb = new DistributedDB("Database Two", 2000, 7.5, 100, 12);
      // System.out.println(ddb);

      // HomogeneousDB db3 = new HomogeneousDB("Database Three", 2000, 7.5, 100,
      // 14.0);
      // System.out.println(db3);

      HeterogeneousDB db3 = new HeterogeneousDB("Database Four", 2000, 7.5, 100, 14.0);
      System.out.println(db3);
   }

}
