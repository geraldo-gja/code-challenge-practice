package critical.techworks.q02.original;


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
        // TODO: complete the constructor
    }

    public AccountHolder getAccountHolder() {
        // TODO: complete the method
        return null;
    }

    public boolean validatePin(int attemptedPin) {
        // TODO: complete the method
        return false;
    }

    public double getBalance() {
        // TODO: complete the method
        return -1;
    }

    public Long getAccountNumber() {
        // TODO: complete the method
        return -1L;
    }

    public void creditAccount(double amount) {
        // TODO: complete the method
    }

    public boolean debitAccount(double amount) {
        // TODO: complete the method
        return false;
    }
}
