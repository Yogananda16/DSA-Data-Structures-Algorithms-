package Java.Inheritence;

// parent class

class Employee {

    String name;
    String email;
    int employeeid;

    // constructor 1
    Employee(String name, String email, int employeeid) {
        this.name = name;
        this.email = email;
        this.employeeid = employeeid;
    }

    // method to display detials
    void displayDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Employee ID: " + employeeid);
    }
}

class Developer extends Employee {

    String programlanguage; // declare the field

    // constructor for Developer
    Developer(String name, String email, int employeeid, String programlanguage) {
        super(name, email, employeeid); // pass 3 up to Employee
        this.programlanguage = programlanguage; // keep 1 for Developer
    }

    void showLanguage() {
        System.out.println("Language: " + programlanguage);
    }
}

public class InheritenceDemo {
    public static void main(String[] args) {

        Developer dev1 = new Developer("Yogananda", "y.com", 18, "Java");
        dev1.displayDetails(); // inherited from Employee
        dev1.showLanguage(); // Developer's own
    }
}
