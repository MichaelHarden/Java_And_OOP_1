/**
 * Represents one user with a first and last name, location, age, 
 * and status of on or offline.
* 
* @author Michael Harden
* @version September 14, 2020
*/



public class UserInfo {

   // instance variables 
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;

   // constants
   private static final int OFFLINE = 0, ONLINE = 1;

   // constructors

   /** 
    * Creates new users. 
    * 
    * @param firstNameIn String
    * @param lastNameIn String 
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }  

   // - Methods

   /** @return String - Returns users info in a formatted way. */
   public String toString() {
   
      String output = "Name: " + firstName + " " + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
   
      if (status == OFFLINE) {
         output += "Offline";
      } else {
         output += "Online";
      }
      return output;
   }

   /** 
    * Sets users location.
    * 
    * @param locationIn String
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }

   /** 
    * Sets users age.
    * 
    * @return Boolean
    * @param ageIn int
    */
   public Boolean setAge(int ageIn) {
   
      Boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }

   /** 
    * Returns age from UserInfo.
    *
    * @return int
    */
   public int getAge() {
      return age;
   }

   /** 
    * Returns location from UserInfo.
    *
    *@return String
    */
   public String getLocation() {
      return location;
   }

   /** Changes status to offline.*/
   public void logOff() {
      status = OFFLINE;
   }

   /** Changes status to online. */
   public void logOn() {
      status = ONLINE;
   }
}