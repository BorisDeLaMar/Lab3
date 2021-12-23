package MovesLaba;
import InterfacesLaba.*;
import TypeClassesLaba.Name;

public class Feel implements StandartMethods{
	RandomCount rInd = new RandomCount();
	protected boolean BrokenNervous;
	protected Name name;
	String[] Emotions = {"Слишком неподходящее место для прятки...", "Он непременно приподымет скатерть!", "Я пропал...", "Я не могу найти ничего подходящего!!!"};
	
	public Feel(boolean BrokenNervous) {
		this.BrokenNervous = BrokenNervous;
	}
	public Feel() { }
		
	public boolean Hesitate(int HesitateLevel, Name name) {
		this.name = name;
		double index = rInd.GetRandomIndex(); 
		double div = (double) HesitateLevel;
		if (div/10.0 >= Math.abs(index)) {
			for(int h = 0; h < Emotions.length; h++) {
				int y = (int) (index+1)%Emotions.length;
				index += 1;
				System.out.println(name.getName() + ": " + Emotions[y]);
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean getNervous() {
		return BrokenNervous;
	}
	public void setNervous(boolean BrokenNervous) {
		this.BrokenNervous = BrokenNervous;
	}
	
	@Override
	public boolean equals(StandartMethods smth) {
		Feel feel = (Feel) smth;
		if (BrokenNervous == feel.getNervous()) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		Feel feel = new Feel(BrokenNervous);
		String s1 = feel.toString();
		int result = 31*s1.hashCode();
		return result;
	}
	@Override
	public String toString() {
		if (BrokenNervous == true) {
			return "true";
		}
		else {
			return "false";
		}
	}
}
