//������ �������� ������� � ��������� ��� �����
package TypeClassesLaba;
import MovesLaba.*;
import InterfacesLaba.*;
public class Moomins implements StandartMethods{
	//����
	protected Name name = new Name();
	protected Place place = new Place();
	protected HideAndSeek game = new HideAndSeek();
	protected Feel feel = new Feel();
	protected Movement move = new Movement();
	protected Eyesight eyesight = new Eyesight(true); 
	protected Feel BrokenNervous = new Feel(false);
	
	//������������
	public Moomins(String name) {
		this.name = new Name(name);
	}
	
	//����������� ������
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
		return "���: " + name.getName() + "\n" + "�����: " + place.getPlace() + "\n";
	}

	
	//������, ����������� ��������
	public String WalksTo(String place) {
		this.place = move.WalksTo(place);
		return name.getName() + " ������ � " + this.place.getPlace();
	}
	public String CloseEyes(String stuff) {
		this.eyesight = move.CloseEyes();
		return name.getName() + " ������ ���� " + stuff;
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
	
	//������
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
	
	//��������� ����
	public boolean getNervousCondition() {
		return BrokenNervous.getNervous();
	}
	
}
