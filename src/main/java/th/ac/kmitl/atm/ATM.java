package th.ac.kmitl.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * An ATM that accesses a bank.
 */
@Component
public class ATM {
	private final Bank bank;
	private Customer loginCustomer;

	/**
	 * Constructs an ATM for a bank.
	 */
	@Autowired
	public ATM(Bank bank) {
		this.bank = bank;
		this.loginCustomer = null;
	}

	/**
	 * Finds customer in bank.
	 * @param id current customer id
	 * @param pin pin being inputted
	 */
	public String validateCustomer(int id, int pin) {
		Customer customer = bank.findCustomer(id);

		if (customer != null && customer.checkPin(pin)) {
			loginCustomer = customer;
			return loginCustomer.getName();
		}
		return null;
	}

	/**
	 * Withdraws amount from current account.
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount) {
		loginCustomer.getAccount().withdraw(amount);
	}

	/**
	 * Gets the balance of the current account.
	 * @return the balance
	 */
	public double getBalance() {
		return loginCustomer.getAccount().getBalance();
	}


}
