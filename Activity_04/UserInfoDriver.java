/** 
 * UserInfoDriver creates two users, user1 and user2 and sets 
 *  their nama, locations, age, and status and prints info to commandline.
 * 
 * @author Michael harden
 * @version September 14, 2020
 */

public class UserInfoDriver {
   /**
    * 
    * @param args Command line Arguments (not used)
    */   
   public static void main(String[] args) {
   
      // user 1
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
   
      // user 2
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   
   }
}