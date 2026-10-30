package Java.Polymorphism;

// parent class

class Employee {

    // parent method
    void work() {
        System.out.println("Employee is working");
    }
}

// child class

class Developer extends Employee {

    // Overriding parent method
    @Override
    void work() {
        System.out.println("Develeoper is writing code");
    }

}

// another child class

class Manager extends Employee {

    // overriding this class method
    @Override
    void work() {
        System.out.println("Manager is managing the team");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        // parent reference pointing to Developer object
        Employee emp1 = new Developer();

        // parent refernece pointing to Manager object
        Employee emp2 = new Manager();

        // java decides which work() method to run
        // based on the actual object

        emp1.work();
        emp2.work();
    }

}
