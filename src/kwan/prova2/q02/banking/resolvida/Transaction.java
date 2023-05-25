package kwan.prova2.q02.banking.resolvida;

/**
 * A bank transaction implementation.
 */
public class Transaction implements TransactionInterface {
    private Long accountNumber;
    private BankInterface bank;

    /**
     * @param bank          The bank where the account is housed.
     * @param accountNumber The customer's account number.
     * @param attemptedPin  The PIN entered by the customer.
     * @throws Exception Account validation failed.
     */
    public Transaction(BankInterface bank, Long accountNumber, int attemptedPin) throws Exception {
    	this.accountNumber = accountNumber;
    	this.bank = bank;
		if( bank.authenticateUser(accountNumber, attemptedPin) == false )
			throw new Exception("User not authorized");
    }

    public double getBalance() { 
        return bank.getBalance(accountNumber);
    }

    public void credit(double amount) {
    	bank.credit(accountNumber, amount);
    }

    public boolean debit(double amount) {
        return bank.debit(accountNumber, amount);
    }
}
