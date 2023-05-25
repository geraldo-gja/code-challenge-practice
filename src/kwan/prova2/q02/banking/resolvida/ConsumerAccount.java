package kwan.prova2.q02.banking.resolvida;

/**
 * Account implementation for consumer (domestic) customers.
 * The account's holder is a {@link Person}.
 */
public class ConsumerAccount extends Account {

	
    public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
    	super(person, accountNumber, pin, currentBalance);
    }

}
