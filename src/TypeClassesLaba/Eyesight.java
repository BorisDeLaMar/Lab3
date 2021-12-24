package TypeClassesLaba;
import InterfacesLaba.*;

public class Eyesight implements StandartMethods{
	
	//Поля
	boolean eyesight;
	
	//Конструкторы
	public Eyesight(boolean eyesight) {
		this.eyesight = eyesight;
	}
	public Eyesight() {}
	
	//Геттер, сеттер
	public boolean getEyesight() {
		return eyesight;
	}
	public void setEyesight(boolean eyesight) {
		this.eyesight = eyesight;
	}
	
	//Стандартные функции
	@Override
	public boolean equals(Object obj) {
		Eyesight smth = (Eyesight) obj;
		Eyesight eyesight = new Eyesight(this.eyesight);
		if (this == obj) {
			return true;
		}
		if (obj == null || obj.getClass() != getClass()) {
			return false;
		}
		return eyesight.toString().equals(smth.toString());
	}
	
	@Override
	public int hashCode() {
		Eyesight eyesight = new Eyesight(this.eyesight);
		String s1 = eyesight.toString();
		int result = 31*s1.hashCode();
		return result;
	}
	@Override
	public String toString() {
		if (eyesight == true) {
			return "true";
		}
		else {
			return "false";
		}
	}
}