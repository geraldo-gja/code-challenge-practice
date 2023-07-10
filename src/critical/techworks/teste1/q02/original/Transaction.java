package critical.techworks.teste1.q02.original;

/**
 * A bank transaction implementation.
 */
public class Transaction implements TransactionInterface {
	@SuppressWarnings("unused")
    private Long accountNumber;
	@SuppressWarnings("unused")
    private BankInterface bank;

    /**
     * @param bank          The bank where the account is housed.
     * @param accountNumber The customer's account number.
     * @param attemptedPin  The PIN entered by the customer.
     * @throws Exception Account validation failed.
     */
    public Transaction(BankInterface bank, Long accountNumber, int attemptedPin) throws Exception {
        // complete the constructor
    }

    public double getBalance() {
        // complete the method
        return -1;
    }

    public void credit(double amount) {
        // complete the method
    }

    public boolean debit(double amount) {
        // complete the method
        return false;
    }
}
