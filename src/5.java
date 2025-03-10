import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        Random r = new Random();
        int code = r.nextInt(1000000);
        System.out.println(code);
    }
}