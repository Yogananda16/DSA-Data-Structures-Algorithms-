package Java;

class Studentdata {

    // private variables cannot be accessed driectly from outside class
    private String name;
    private int marks;

    // Setter method to set name
    void setName(String name) {
        this.name = name;
    }

    // Getter method to get name
    String getName() {
        return name;
    }

    // Setter method for marks with validation
    void setMarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    // Getter method to get marks
    int getMarks() {
        return marks;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        // creating Student object
        Studentdata s1 = new Studentdata();

        // setting values using setter methods
        s1.setName("Yogananda");
        s1.setMarks(90);

        // getting values using getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
    }
}
