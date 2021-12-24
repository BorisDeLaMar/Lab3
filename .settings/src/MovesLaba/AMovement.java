package MovesLaba;
import TypeClassesLaba.*;

public abstract class AMovement {
	//Поля
	protected Place place = new Place();
	protected Eyesight eyesight = new Eyesight();
	protected Name name = new Name();
	protected Place IKnowWhereAreYou = new Place(place.getPlace());
	
	//Методы
	public abstract String changePlace();
	public abstract String goBack();
}