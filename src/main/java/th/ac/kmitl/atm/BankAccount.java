package th.ac.kmitl.atm;

/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals.
 */
public class BankAccount {
   private double balance;

   /**
    * Constructs a bank account with a given balance.
    * @param initialBalance the initial balance
    */
   public BankAccount(double initialBalance) {
      this.balance = initialBalance;
   }

   /**
    * Withdraws money from the account.
    * @param amount the amount of money to deposit
    */
   public void withdraw(double amount) {
      balance = balance - amount;
   }

   /** 
    * Gets the account balance.
    * @return the account balance
    */
   public double getBalance() {
      return balance; 
   }

}

