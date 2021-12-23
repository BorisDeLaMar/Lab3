package MovesLaba;
import TypeClassesLaba.*;
import java.util.ArrayList;

public class HideAndSeek {
	protected Place placeHider = new Place();
	protected Name nameFinder = new Name();
	protected Name nameHider = new Name();
	protected ArrayList<String> UsualPlaces = new ArrayList<String>();
	{
	UsualPlaces.add("За диваном в гостинной");
	UsualPlaces.add("В шкафу в спальне");
	UsualPlaces.add("Под кроватью в спальне");
	}
	protected ArrayList<String> UnusualPlaces = new ArrayList<String>();
	{
	UnusualPlaces.add("На люстре в коридоре");
	UnusualPlaces.add("За занавеской в спальне"); 
	UnusualPlaces.add("Под столом на кухне");
	}
	public String TriesToFind(String name, String nameFinder, String place) {
		this.nameFinder.setName(nameFinder);
		nameHider.setName(name);
		placeHider.setPlace(place);
		for(int i = 0; i < UsualPlaces.size(); i++) {
			if (UsualPlaces.get(i) == placeHider.getPlace()) {
				return this.nameFinder.getName() + ":" + " Нашелся " + nameHider.getName() + "!";
			}
			if (i == UsualPlaces.size() - 1) {
				UsualPlaces.add(placeHider.getPlace());
				return this.nameFinder.getName() + ":" + " Ну ты даешь " + nameHider.getName() + "!";
			}
		}
		return "";
	}
	public String TriesToFindGoodPlace(String place, Name name) {
		for(int i = 0; i < UnusualPlaces.size(); i++) {
			if (UnusualPlaces.get(i) == place) {
				return name.getName() + ":" + " Надо бы перепрятаться. " + place + " всяко понадежнее" + "!";
			}
			if (i == UnusualPlaces.size() - 1) {
				UnusualPlaces.add(place); 
				return name.getName() + ":" + " " + place + " как вариант";
			}
		}
		return "";
	}
	public Place Hide(String place) {
		placeHider.setPlace(place);
		return placeHider;
	}
}
