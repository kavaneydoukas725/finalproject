import java.util.*;
public class RandomCode {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        System.out.println("Random number: " + list.get(0));
    }
}
