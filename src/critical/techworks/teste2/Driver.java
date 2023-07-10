package critical.techworks.teste2;

import java.util.Objects;

public class Driver {
	
	private String name;
	
	Driver(String name) {
	  this.name = name;
	}
	public String getName() {
	  return this.name;
	}
	
	@Override
	public String toString() {
		return "Driver [name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Driver))
			return false;
		Driver other = (Driver) obj;
		return Objects.equals(name, other.name);
	}
}