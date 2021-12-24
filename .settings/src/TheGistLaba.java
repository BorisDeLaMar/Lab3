import TypeClassesLaba.*;

public class TheGistLaba {
	public static void main(String[] args) {
		
		System.out.println(Today.shortInfo());
		
		Moomins sniff = new Moomins("Снифф");
		Moomins moomintroll = new Moomins("Мумми-тролль");
		
		System.out.println(sniff.WalksTo("угол"));
		System.out.println(sniff.CloseEyes("лапами"));
		
		for(int c = 1; c <= 10; c++) {
			System.out.println(sniff.Count(c));
			if (c == 3) {
				moomintroll.Hide("Под столом на веранде");
			}
			if ((c >= 3) &&  (moomintroll.getNervousCondition() == false)) {
				moomintroll.Hesitate(c);
			}
			if (moomintroll.getNervousCondition()) {
				System.out.println(moomintroll.TriesToFindGoodPLace("Цилиндр в углу веранды"));
			}
		}
		
		sniff.OpenEyes();
		
		System.out.println(sniff.TriesToFind("Мумми-тролль", "Под столом на веранде"));
		System.out.println(sniff.TriesToFind("Мумми-тролль", "Под столом на веранде"));
		//System.out.println(sniff.changePlace());
		//System.out.println(sniff.goBack());
	}
}
