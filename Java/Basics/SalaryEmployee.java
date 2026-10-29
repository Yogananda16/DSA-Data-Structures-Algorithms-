package Java;

class SalaryofEmployee {

    private String name;
    private double salary;

    // constructor 1
    SalaryofEmployee(String name, double salary) {
        this.name = name;
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }

    }

    // raise method, check first, change if valid
    void giveRaise(double percent) {
        if (percent <= 0) {
            System.out.println("Invalid raise");
        } else if (percent > 50) {
            System.out.println("Raise too high");
        } else {
            salary = salary + (salary * percent / 100);
        }
    }

    // setter for name
    void setName(String name) {
        this.name = name;
    }

    // getter for name
    String getName() {
        return name;
    }

    // getter for salary
    double getSalary() {
        return salary;
    }

}

public class SalaryEmployee {
    public static void main(String[] args) {

        SalaryofEmployee employee = new SalaryofEmployee("Yogananda", 50000.00);
        employee.giveRaise(10);
        System.out.println(employee.getName() + "'s salary: " + employee.getSalary());

        employee.giveRaise(-5);
        employee.giveRaise(60);

        System.out.println("Final salary: " + employee.getSalary());
    }
}
