package critical.techworks.q02.resolvida;



/**
 * Abstract bank account.
 */
public abstract class Account implements AccountInterface {
    private AccountHolder accountHolder;
    private Long accountNumber;
    private int pin;
    private double balance;

    protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
    	this.accountHolder = accountHolder;
    	this.accountNumber = accountNumber;
    	this.pin = pin;
    	this.balance = startingDeposit;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public boolean validatePin(int attemptedPin) {

    	boolean b = false;
    	if( pin == attemptedPin) 
    		b = true;
    		
        return b;
    }

    public double getBalance() {
        return balance;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void creditAccount(double amount) {
    	balance += amount;
    }

    public boolean debitAccount(double amount) {
    	
    	boolean b = false;
    	if( balance - amount >= 0 ) {
    		b = true;
    		balance -= amount;
    	}
    		
        return b;
    }
}
