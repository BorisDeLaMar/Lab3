package TypeClassesLaba;

import MovesLaba.RandomCount;
import InterfacesLaba.*;
public enum Today implements ConvertToString{
	MONDAY("Понедельник-день-бездельник"),
	TUESDAY("Вторник-повторник"),
	WEDNESDAY("Среда-тамада"),
	THURSDAY("Четверг-я заботы все отверг"),
	FRIDAY("Пятница-пьяница"),
	SATURDAY("Суббота-безработа"),
	SUNDAY("Воскресенье-день веселья");
	
	private String title;
	Today(String title){
		this.title = title;
	}
	
	public static String shortInfo(){
		RandomCount rInd = new RandomCount();
		double index = 6*Math.abs(rInd.GetRandomIndex());
		int today = (int) index;
		if (today == 0) {
			return Today.MONDAY.toString();
		}
		else if(today == 1){
			return Today.TUESDAY.toString();
		}
		else if(today == 2){
			return Today.WEDNESDAY.toString();
		}
		else if(today == 3){
			return Today.THURSDAY.toString();
		}
		else if(today == 4){
			return Today.FRIDAY.toString();
		}
		else if(today == 5){
			return Today.SATURDAY.toString();
		}
		else{
			return Today.SUNDAY.toString();
		}
	}
	
	@Override
	public String toString() {
		return title;
	}
}