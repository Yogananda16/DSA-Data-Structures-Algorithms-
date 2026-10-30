package Java.Abstraction;

// abstract parent class
abstract class Payment {

    // abstract method
    // No impl3mentation is given here
    abstract void pay(double amount);

    // normal method
    void showMessage() {
        System.out.println("Payment processing....");
    }
}

// child 1 creditcard
class CreditCardPayment extends Payment {

    // overriding parent class
    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}

// child 2 Paypal
class Paypal extends Payment {

    // overrriding Parent
    @Override
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using Paypal");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {

        // create object reference parent class with child 1
        Payment payment1 = new CreditCardPayment();
        payment1.showMessage();
        payment1.pay(100);

        System.out.println("----");

        // create object reference to parent class with child 2
        Payment payment2 = new Paypal();
        payment2.showMessage();
        payment2.pay(10);
    }
}
