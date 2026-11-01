package Java.Array;

public class Duplicates {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 10, 30, 10, 50, 100, 100, 60, 60, 50 };
        int[] duplicate = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                }

            }
        }

    }

}
