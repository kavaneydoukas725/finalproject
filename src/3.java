import java.util.Random;

public class FinalProject {
  public static void main(String[] args) {
    Random rand = new Random();
    int number = rand.nextInt(10);
    System.out.println("The random number is: " + number);
  }
}
