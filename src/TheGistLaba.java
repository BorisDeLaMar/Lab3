import TypeClassesLaba.*;
public class TheGistLaba {
	public static void main(String[] args) {
		System.out.println(Today.shortInfo());
		Moomins sniff = new Moomins("�����");
		Moomins moomintroll = new Moomins("�����-������");
		System.out.println(sniff.WalksTo("����"));
		System.out.println(sniff.CloseEyes("������"));
		for(int c = 1; c <= 10; c++) {
			System.out.println(sniff.Count(c));
			if (c == 3) {
				moomintroll.Hide("��� ������ �� �������");
			}
			if ((c >= 3) &&  (moomintroll.getNervousCondition() == false)) {
				moomintroll.Hesitate(c);
			}
			if (moomintroll.getNervousCondition()) {
				System.out.println(moomintroll.TriesToFindGoodPLace("������� � ���� �������"));
			}
		}
		sniff.OpenEyes();
		System.out.println(sniff.TriesToFind("�����-������", "��� ������ �� �������"));
		//System.out.println(sniff.changePlace());
		//System.out.println(sniff.goBack());
	}
}