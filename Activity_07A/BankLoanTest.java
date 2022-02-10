import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * BankLoanTest tests the BankLoan class.
 * 
 * @author Michael Harden
 * @version Oct 10, 2020
 */
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Tests BankLoan initializer. */
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals("", 1100, loan1.getBalance(), .000001);
   }
   /** Tests getLoansCreated. */
   @Test public void getLoansCreatedTest() {
      BankLoan.resetLoansCreated();
      BankLoan loan1 = new BankLoan("Bob", .12);
      BankLoan loan2 = new BankLoan("Pam", .15);
      BankLoan loan3 = new BankLoan("Tom", .07);
      Assert.assertEquals("", 3, BankLoan.getLoansCreated());
   }
   /** Test borrowFromBank. */
   @Test public void borrowFromBankTest() {
      BankLoan loan1 = new BankLoan("jack", .05);
      Assert.assertTrue(loan1.borrowFromBank(99999));
      Assert.assertFalse(loan1.borrowFromBank(100000));
   }
   /**Test isAmountValidTest. */
   @Test public void isAmountValidTest() {
      Assert.assertTrue(BankLoan.isAmountValid(1));
      Assert.assertFalse(BankLoan.isAmountValid(-1));
      Assert.assertTrue(BankLoan.isAmountValid(0));
   }
   /** Test isInDebt. */
   @Test public void isInDebtTest() {
      BankLoan loan1 = new BankLoan("Todd", .21);
      loan1.borrowFromBank(100);
      Assert.assertTrue(BankLoan.isInDebt(loan1));
      Assert.assertFalse(BankLoan.isInDebt(new BankLoan("Sam", .3)));
   }
   /** Test payBank. */
   @Test public void payBankTest() {
      BankLoan loan1 = new BankLoan("Emily", .01);
      loan1.borrowFromBank(1000);
      Assert.assertEquals("", 0, loan1.payBank(1000), .001);
   
      BankLoan loan2 = new BankLoan("Hope", .78);
      loan2.borrowFromBank(900);
      Assert.assertEquals("", 100, loan2.payBank(1000), .001);
   }
   /** Test setInterestRate. */
   @Test public void setInterestRateTest() {
      BankLoan loan1 = new BankLoan("Dwight", 0.5);
      Assert.assertFalse(loan1.setInterestRate(-0.1));
      Assert.assertFalse(loan1.setInterestRate(1.1));
      Assert.assertTrue(loan1.setInterestRate(0.1));
   }
   /** Test toString. */
   @Test public void toStringTest() {
      BankLoan loan1 = new BankLoan("Kevin", .21);
      String outputString = "Name: Kevin\r\nInterest " 
         + "rate: 0.21%\r\nBalance: $0.0\r\n";
      Assert.assertEquals("", 0, outputString.compareTo(loan1.toString()));
   }
}
