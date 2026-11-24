
public class Account {

    private double balance = 0;
    private int pin = 1234;

    public double deposit(double amount, int enteredPin) {

        if (validatePin(enteredPin)) {
            if (amount > 0) {
                balance = balance + amount;
            }
        }

        return balance;
    }

    public double withdraw(double amount, int enteredPin) {

        if (validatePin(enteredPin)) {
            if (amount > 0 && amount <= balance) {
                balance = balance - amount;
            }
        }

        return balance;
    }

    public boolean validatePin(int enteredPin) {

        if (pin == enteredPin) {
            return true;
        }

        return false;
    }

}
