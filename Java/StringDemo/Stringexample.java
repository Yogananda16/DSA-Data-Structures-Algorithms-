package Java.StringDemo;

public class Stringexample {

    public static void main(String[] args) {
        String name = "JavaPython";
        String reversed = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reversed = reversed + name.charAt(i);
        }
        System.out.println("Reversed String: " + reversed);
    }
}