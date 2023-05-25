package kwan.prova2.q02.banking.resolvida;

public class Company extends AccountHolder {
	
	private String companyName;

	public Company(String companyName, int taxId) {
		super(taxId);
		this.companyName = companyName;
	}

	public String getCompanyName() {
        return companyName;
	}
	
}
