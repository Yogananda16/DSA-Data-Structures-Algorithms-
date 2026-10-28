package Java;

public class largenumber {

    static int large(int a, int b) {

        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else
            return a;
    }

    public static void main(String[] args) {
        int result = large(10, 20);
        System.out.println("Larger of 2 numbers is " + result);
    }
}
