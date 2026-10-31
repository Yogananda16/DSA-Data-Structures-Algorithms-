package Java.Abstraction;

// interface
interface Notification {

    // interface method
    // classes implementing this interface must provide implementation
    void send(String message);
}

// EmailNotification implements Notification
class EmailNotification implements Notification {

    // providing implemenation of send()
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// SMSNotification implements Notification
class SMSNotification implements Notification {

    // Providing different implementation of send()
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

public class AbstractionInterface {
    public static void main(String[] args) {
        // interface reference pointing to email notifcaiton
        Notification notification1 = new EmailNotification();

        // interface referecne pointing to SMSMnotifcaiton object
        Notification notification2 = new SMSNotification();

        // Calling respective implementations
        notification1.send("Interview scheduled");

        notification2.send("Application submitted");
    }

}
