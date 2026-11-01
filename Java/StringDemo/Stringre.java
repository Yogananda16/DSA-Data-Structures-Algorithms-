package Java.StringDemo;

public class Stringre {
    public static void main(String[] args) {

        String name = "Yogananda";
        String result = "";

        // for loop to iterate char by char
        for (int i = name.length() - 1; i >= 0; i--) {
            result = result + name.charAt(i);
        }
        System.out.println("Reversed String is " + result);
    }
}
