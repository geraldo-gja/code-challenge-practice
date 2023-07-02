package critical.techworks.q02.resolvida;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The Bank implementation.
 */
public class Bank implements BankInterface {
	
    private LinkedHashMap<Long, Account> accounts;

    public Bank() {
    	accounts = new LinkedHashMap<Long, Account>();
    }

    private Account getAccount(Long accountNumber) {
        return accounts.get(accountNumber);
    }

    public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
    	Long accountNumber = (long) (accounts.size() + 1);
    	CommercialAccount commercialAccount = new CommercialAccount(company, accountNumber, pin, startingDeposit);
    	accounts.put(accountNumber, commercialAccount);
    	
        return accountNumber;
    }

    public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
    	Long accountNumber = (long) (accounts.size() + 1);
    	ConsumerAccount consumerAccount = new ConsumerAccount(person, accountNumber, pin, startingDeposit);
    	accounts.put(accountNumber, consumerAccount);
    	
        return accountNumber;
    }
    
    public double getBalance(Long accountNumber) {
    	double balance = -1;
    	Account a = accounts.get(accountNumber);
    	if( a != null)
    		balance = a.getBalance();
    	
        return balance;
    }

    public void credit(Long accountNumber, double amount) {
    	Account a = getAccount(accountNumber);
    	a.creditAccount(amount);
    }

    public boolean debit(Long accountNumber, double amount) {
    	Account a = getAccount(accountNumber);
        return a.debitAccount(amount);
    }

    public boolean authenticateUser(Long accountNumber, int pin) {
    	Account a = getAccount(accountNumber);
        return a.validatePin(pin);
    }
    
    public void addAuthorizedUser(Long accountNumber, Person authorizedPerson) {
    	CommercialAccount a = (CommercialAccount) getAccount(accountNumber);
    	a.addAuthorizedUser(authorizedPerson);
    }

    public boolean checkAuthorizedUser(Long accountNumber, Person authorizedPerson) {
    	boolean b = false;
    	Account a = getAccount(accountNumber);
    	if( a instanceof CommercialAccount ) 
    		b = ((CommercialAccount) a).isAuthorizedUser(authorizedPerson);
    	
        return b;
    }

    public Map<String, Double> getAverageBalanceReport() {

    	LinkedHashMap<String, Double> mapBalanceReport = new LinkedHashMap<String, Double>();
    	Double avarageConsumer = 0.0;
    	Double avarageCommercial = 0.0;
    	int countConsumer = 0;
    	int countCommercial = 0;
    	
    	for (Account a : accounts.values() ) { 
    		if( a instanceof ConsumerAccount ) {
    			avarageConsumer += a.getBalance();
    			countConsumer++;    			
    		}else {
    			avarageCommercial += a.getBalance();
    			countCommercial++;
    		}
		}		
    	avarageConsumer = avarageConsumer / countConsumer;
    	avarageCommercial = avarageCommercial / countCommercial;
    	
    	mapBalanceReport.put(ConsumerAccount.class.getSimpleName(), avarageConsumer);
    	mapBalanceReport.put(CommercialAccount.class.getSimpleName(), avarageCommercial);
    	
        return mapBalanceReport;
    }
}
