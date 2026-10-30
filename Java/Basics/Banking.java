package Java.Basics;

class BankAccount {

    // Hide balance from direct access
    private double balance;

    // Method to deposit money
    void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
        }
    }

    // Method to read balance
    double getBalance() {
        return balance;
    }
}

public class Banking {
    public static void main(String[] args) {

        // creating bankaccount object
        BankAccount account = new BankAccount();

        // deposit amount
        account.deposit(10.00);

        // print the balance
        System.out.println("Balance is: " + account.getBalance());
        // b1.getBalance();
    }

}
