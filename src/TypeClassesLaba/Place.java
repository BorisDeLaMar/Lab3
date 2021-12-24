package TypeClassesLaba;
import InterfacesLaba.*;

public class Place implements StandartMethods{
	
	//Поля
	protected String place;
	
	//Конструкторы
	public Place(String place) {
		this.place = place;
	}
	public Place() {}
	
	//Геттер, Сеттер
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	//Стандартные методы
	@Override
	public boolean equals(Object obj) {
		Place place = (Place) obj;
		if (this == obj) {
			return true;
		}
		if (obj == null || obj.getClass() != getClass()) {
			return false;
		}
		return place.getPlace().equals(this.getPlace());
	}
	@Override
	public int hashCode() {
		Place place = new Place(this.place);
		String s1 = place.toString();
		int result = 31*s1.hashCode();
		return result;
	}
	@Override
	public String toString() {
		return place.toString();
	}
}