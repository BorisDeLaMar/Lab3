//��� ��������� �������� ��������
package MovesLaba;
import TypeClassesLaba.*;

public class Movement extends AMovement{
	
	public Place WalksTo(String place) {
		this.place.setPlace(place);
		return this.place;
	}
	public Eyesight CloseEyes() {
		eyesight.setEyesight(false);
		return eyesight;
	}
	public Eyesight OpenEyes() {
		eyesight.setEyesight(true);
		return eyesight;
	}
	public String Count(int count, Name name) {
		String s = Integer.toString(count);
		return name.getName() + ":" + " *������* " + s;
	}
	
	@Override
	public String changePlace() {
		IKnowWhereAreYou = place;
		place = new Place("���-��");
		return "������ � ���-��";
	}
	public String goBack() {
		place = new Place(IKnowWhereAreYou.getPlace());
		return place.getPlace();
	}
}
