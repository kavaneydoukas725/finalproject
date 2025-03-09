import java.util.*;

public class RandomCode {
    public static void main(String[] args) {
        // Generate a random number between 1 and 10
        int num = (int)(Math.random()*10+1);
        System.out.println("Random number: " + num);
        
        // Generate a random string of length 5
        String str = RandomStringUtils.random(5, true, false);
        System.out.println("Random string: " + str);
    }
}