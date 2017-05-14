/**
 * Created by D on 23/02/2017.
 */

//	- could get wrong balance?
// could add the money to someone ele's balance?
// could compare money to wrong balance?

public class BankAccount {

  private int balance = 0;

  public synchronized int getBalance() {
    return balance;
  }

  public synchronized void deposit(int money) {
    balance = balance + money;
  }

  public synchronized int retrieve(int money) {
    int result = 0;
    if (balance > money) {
      result = money;
    } else {
      result = balance;
    }
    balance = balance - result;
    return result;
  }
}
// All 3 methods need to be synchronized I believe
