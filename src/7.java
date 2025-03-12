import java.util.*;

class Solution {
    public static void main(String[] args) {
        int n = 10; // Random number between 1 and 20
        System.out.println("Random number: " + getRandomNumber(n));
    }

    public static int getRandomNumber(int maxValue) {
        return (int)(Math.random() * maxValue);
    }
}