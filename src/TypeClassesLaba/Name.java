package TypeClassesLaba;
import InterfacesLaba.*;

public class Name implements StandartMethods{

	//Поля
	protected String name;
	
	//Конструкторы
	public Name(String name) {
		this.name = name;
	}
	public Name() {}
	
	//Геттер, Сеттер
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Стандартные функции
	@Override
	public boolean equals(Object obj) {
		Name name = (Name) obj;
		if (name == obj) {
			return true;
		}
		if (obj == null || obj.getClass() == getClass()) {
			return false;
		}
		return this.getName().equals(name.getName());
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