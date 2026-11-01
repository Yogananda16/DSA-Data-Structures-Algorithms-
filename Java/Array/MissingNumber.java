package Java.Array;

public class MissingNumber {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 4, 5, 6 };

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != i + 1) {
                System.out.println("Missing number: " + (i + 1));
                break;
            }
        }
    }
}
