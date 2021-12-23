package MovesLaba;
import TypeClassesLaba.*;
import java.util.ArrayList;

public class HideAndSeek {
	protected Place placeHider = new Place();
	protected Name nameFinder = new Name();
	protected Name nameHider = new Name();
	protected ArrayList<String> UsualPlaces = new ArrayList<String>();
	{
	UsualPlaces.add("�� ������� � ���������");
	UsualPlaces.add("� ����� � �������");
	UsualPlaces.add("��� �������� � �������");
	}
	protected ArrayList<String> UnusualPlaces = new ArrayList<String>();
	{
	UnusualPlaces.add("�� ������ � ��������");
	UnusualPlaces.add("�� ���������� � �������"); 
	UnusualPlaces.add("��� ������ �� �����");
	}
	public String TriesToFind(String name, String nameFinder, String place) {
		this.nameFinder.setName(nameFinder);
		nameHider.setName(name);
		placeHider.setPlace(place);
		for(int i = 0; i < UsualPlaces.size(); i++) {
			if (UsualPlaces.get(i) == placeHider.getPlace()) {
				return this.nameFinder.getName() + ":" + " ������� " + nameHider.getName() + "!";
			}
			if (i == UsualPlaces.size() - 1) {
				UsualPlaces.add(placeHider.getPlace());
				return this.nameFinder.getName() + ":" + " �� �� ����� " + nameHider.getName() + "!";
			}
		}
		return "";
	}
	public String TriesToFindGoodPlace(String place, Name name) {
		for(int i = 0; i < UnusualPlaces.size(); i++) {
			if (UnusualPlaces.get(i) == place) {
				return name.getName() + ":" + " ���� �� �������������. " + place + " ����� ����������" + "!";
			}
			if (i == UnusualPlaces.size() - 1) {
				UnusualPlaces.add(place); 
				return name.getName() + ":" + " " + place + " ��� �������";
			}
		}
		return "";
	}
	public Place Hide(String place) {
		placeHider.setPlace(place);
		return placeHider;
	}
}
