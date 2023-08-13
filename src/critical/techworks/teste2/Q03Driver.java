package critical.techworks.teste2;

import java.util.Objects;

public class Q03Driver {
	
	private String name;
	
	Q03Driver(String name) {
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
		if (!(obj instanceof Q03Driver))
			return false;
		Q03Driver other = (Q03Driver) obj;
		return Objects.equals(name, other.name);
	}
}