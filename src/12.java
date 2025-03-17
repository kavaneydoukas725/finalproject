import java.util.Random;

public class RandomCode {
	public static void main(String[] args) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(10);
		System.out.println("The generated random number is: " + randomNumber);
	}
}