package TypeClassesLaba;
import InterfacesLaba.*;
public class Name implements StandartMethods{
	protected String name;
	
	public Name(String name) {
		this.name = name;
	}
	public Name() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(StandartMethods smth) {
		Name name = (Name) smth;
		if (this.name == name.getName()) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		Name name = new Name(this.name);
		String s1 = name.toString();
		int result = 31*s1.hashCode();
		return result;
	}
	@Override
	public String toString() {
		return name.toString();
	}
}
