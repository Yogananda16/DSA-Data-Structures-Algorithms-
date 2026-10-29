package Java;

class Person {
    String name;

    // Parent constructor
    Person(String name) {
        this.name = name;
    }

    class Student extends Person {

        int marks;

        // child constructor
        Student(String name, int marks) {

            // call [parent Person constructore
            super(name);
            this.marks = marks;
        }
    }
}

public class Calling {
    public static void main(String[] args) {
        Student s1 = new Student("Yogananda", 90);
        System.out.println("Student name: " + s1.name);
        System.out.println("Student marks: " + s1.marks);
    }
}