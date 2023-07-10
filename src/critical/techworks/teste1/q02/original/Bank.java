package critical.techworks.teste1.q02.original;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The Bank implementation.
 */
public class Bank implements BankInterface {
	@SuppressWarnings("unused")
    private LinkedHashMap<Long, Account> accounts;

    public Bank() {
        // complete the constructor
    }

    @SuppressWarnings("unused")
	private Account getAccount(Long accountNumber) {
        // complete the method
        return null;
    }

    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
        // complete the method
        return -1L;
    }

    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
        // complete the method
        return -1L;
    }

    public double getBalance(Long accountNumber) {
        // complete the method
        return -1;
    }

    public void credit(Long accountNumber, double amount) {
        // complete the method
    }

    public boolean debit(Long accountNumber, double amount) {
        // complete the method
        return false;
    }

    public boolean authenticateUser(Long accountNumber, int pin) {
        // complete the method
        return false;
    }
    
    public void addAuthorizedUser(Long accountNumber, Person authorizedPerson) {
        // complete the method
    }

    public boolean checkAuthorizedUser(Long accountNumber, Person authorizedPerson) {
        // complete the method
        return false;
    }

    public Map<String, Double> getAverageBalanceReport() {
        // complete the method
        return new HashMap<>();
    }
}
