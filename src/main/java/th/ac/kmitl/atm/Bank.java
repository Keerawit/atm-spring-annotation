package th.ac.kmitl.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * A bank contains customers with bank accounts.
 */
@Component
public class Bank {

   private final Map<Integer,Customer> customers;

   /**
    * Constructs a bank with no customers.
    */
   @Autowired
   public Bank(DataSource dataSource) {
      this.customers = dataSource.readCustomers();
   }

   /**
    * Finds a customer in the bank.
    * @param id a customer id
    * @return the matching customer, or null if no customer
    * matches
    */
   public Customer findCustomer(int id) {
      return customers.get(id);
   }
}

