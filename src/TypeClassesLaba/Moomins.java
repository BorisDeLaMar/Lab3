//Только создание объекта и изменение его полей
package TypeClassesLaba;
import MovesLaba.*;
import InterfacesLaba.*;
public class Moomins implements StandartMethods{
	//Поля
	protected Name name = new Name();
	protected Place place = new Place();
	protected HideAndSeek game = new HideAndSeek();
	protected Feel feel = new Feel();
	protected Movement move = new Movement();
	protected Eyesight eyesight = new Eyesight(true); 
	protected Feel BrokenNervous = new Feel(false);
	
	//Конструкторы
	public Moomins(String name) {
		this.name = new Name(name);
	}
	
	//Стандартные методы
	@Override
	public boolean equals(StandartMethods smth) {
		Moomins moomin = (Moomins) smth;
		if (this.name.equals(moomin.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		String s1 = this.name.getName();
		int result = 31*s1.hashCode();
		return result;
	}
	@Override
	public String toString() {
		return "Имя: " + name.getName() + "\n" + "Место: " + place.getPlace() + "\n";
	}

	
	//Методы, реализующие движение
	public String WalksTo(String place) {
		this.place = move.WalksTo(place);
		return name.getName() + " отошел в " + this.place.getPlace();
	}
	public String CloseEyes(String stuff) {
		this.eyesight = move.CloseEyes();
		return name.getName() + " закрыл лицо " + stuff;
	}
	public void OpenEyes() {
		eyesight = move.OpenEyes();
	}
	public String Count(int count) {
		return move.Count(count, name);
	}
	public String changePlace() {
		return name.getName() + ": " + move.changePlace();
	}
	public String goBack() {
		return name.getName() + ": " + move.goBack();
	}
	
	//Прятки
	public String TriesToFind(String name, String place) {
		return game.TriesToFind(name, this.name.getName(), place);
	}
	public String Hide(String place) {
		this.place = game.Hide(place);
		return this.place.getPlace();
	}
	public void Hesitate(int HesitateLevel) {
		BrokenNervous.setNervous(feel.Hesitate(HesitateLevel, name));
	}
	public String TriesToFindGoodPLace(String place) {
		return game.TriesToFindGoodPlace(place, name);
	}
	
	//Состояние души
	public boolean getNervousCondition() {
		return BrokenNervous.getNervous();
	}
	
}
