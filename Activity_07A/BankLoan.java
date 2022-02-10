/**
 * BankLoan class creates a new loan for a customer and keeps track 
 * all loans.
 * 
 * @author Michael Harden
 * @version Oct 10, 2020
 */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   //static variables (modified for all instnaces of the class)
   private static int loansCreated = 0;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

   /**
    * Initilizes new BankLoan.
    * @param customerNameIn String - Name of customer
    * @param interestRateIn Double - interest rate for the customer
    */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

   /**
    * Checks to see if the given amount is a valid loan size.
    * @param amount Double - size of loan
    * @return Boolean
    */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }

   /**
    * Gets the amount of loans the bank has created.
    * @return Int
    */
   public static int getLoansCreated() {
      return loansCreated;
   }

   /** resets the loans created to 0. */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

   /**
    * Checks to see if the customer has outstanding debt.
    * @param loan BankLoan - instance of BankLoan
    * @return Boolean
    */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }

   /**
    * Assigns the loan made to the customers account.
    * @param amount Int - size of loan
    * @return Boolean
    */
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

   /**
    * Removes the amount paid from the outstanding balance.
    * @param amountPaid Double - amount customer paid
    * @return Double - new balance
    */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
    * Gets the balance of the loan on the account.
    * @return double
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * Sets interest rate for the customers loan.
    * @param interestRateIn Double - APR
    * @return Boolean
    */
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
    * Gets the interest rate for the customer.
    * @return Double
    */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
    * Increaces the balance by the interest rate.
    */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
    * Returns a formatted version of the customers account.
    * @return String
    */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
