package Java.Array;

public interface maxAraay {
    public static void main(String[] args) {

        // creating array
        int[] numbers = { 10, 50, 20, 90, 180 };

        // assume first element as maximum
        int max = numbers[0];

        // chexking remaining elements
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max number is " + max);
    }
}
