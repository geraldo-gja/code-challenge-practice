package kwan.prova2.q02.banking.resolvida;

import java.util.Objects;

/**
 * The concrete Account holder of Person type.
 */
public class Person extends AccountHolder {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, int idNumber) {
    	super(idNumber);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(firstName, lastName);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
	}

}
