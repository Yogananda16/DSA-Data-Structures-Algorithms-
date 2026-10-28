package Java;

public class finding_even {

    static boolean find(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(find(6));
    }
}