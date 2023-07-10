package critical.techworks.teste1.q02.original;


/**
 * Abstract bank account.
 */
public abstract class Account implements AccountInterface {
	@SuppressWarnings("unused")
    private AccountHolder accountHolder;
	@SuppressWarnings("unused")
    private Long accountNumber;
	@SuppressWarnings("unused")
    private int pin;
	@SuppressWarnings("unused")
    private double balance;

    protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
        // complete the constructor
    }

    public AccountHolder getAccountHolder() {
        // complete the method
        return null;
    }

    public boolean validatePin(int attemptedPin) {
        // complete the method
        return false;
    }

    public double getBalance() {
        // complete the method
        return -1;
    }

    public Long getAccountNumber() {
        // complete the method
        return -1L;
    }

    public void creditAccount(double amount) {
        // complete the method
    }

    public boolean debitAccount(double amount) {
        // complete the method
        return false;
    }
}
