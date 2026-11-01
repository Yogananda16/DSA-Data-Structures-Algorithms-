package Java.Collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        // array
        int[] numbers = { 10, 20, 10, 30, 20, 10 };
        // empty dictonary
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int number : numbers) {
            if (count.containsKey(number)) {
                count.put(number, count.get(number) + 1);
            } else {
                count.put(number, 1);
            }
        }
        System.out.println("Count of each element is " + count);
    }
}
