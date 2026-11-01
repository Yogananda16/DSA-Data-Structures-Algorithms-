package Java.TryCatch;

public class TryCatchExceptionDemo {
    public static void main(String[] args) {
        try {
            // risky code
            int result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {

            // Handles divide by zero error
            System.out.println("Cannot divide by 0");
        }
    }
}
