package Java.Collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 20, 40, 10 };

        // every number passed so far
        HashSet<Integer> seen = new HashSet<>();
        // only the repeated numbers
        HashSet<Integer> duplicates = new HashSet<>();

        // traversering each number
        for (int number : numbers) {
            if (seen.contains(number)) {
                duplicates.add(number); // already seen it is a duplicate
            } else {
                seen.add(number); // first time, remember it

            }
        }
        System.out.println("Duplicates " + duplicates);
    }
}
