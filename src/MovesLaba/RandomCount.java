package MovesLaba;
import java.util.Random;

public class RandomCount {
	public double GetRandomIndex(){
		Random rand = new Random();
		double x = Math.sin(rand.nextInt());
		return x;
	}
}
