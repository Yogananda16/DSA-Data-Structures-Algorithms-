package Java.Collections;

import java.util.HashSet;

public class HashSetDemoBoolean {
    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 20, 40, 10 };

        // every number passed so far
        HashSet<Integer> seen = new HashSet<>();
        // only the repeated numbers
        boolean hasDuplicate = false;

        // traversering each number
        for (int number : numbers) {
            if (seen.contains(number)) {
                hasDuplicate = true; // found a repeat
                break; // no need to check further
            }
            // seen.add(number); // remember this number
        }
        System.out.println("Duplicates " + hasDuplicate);
    }
}
