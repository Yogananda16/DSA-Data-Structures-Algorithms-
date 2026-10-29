package Java;

class Employee {

    String name;
    int age;
    double salary;

    void displaydetails() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.name = "Yogananda";
        emp1.age = 27;
        emp1.salary = 5000.00;
        emp1.displaydetails();

    }
}