

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    public void TestThatMoneyCanBeDeposited() {
        Account account = new Account();

        double actual = account.deposit(5000, 1234);
        double expected = 5000;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatMoneyCanBeWithdrawn() {
        Account account = new Account();

        account.deposit(5000, 1234);

        double actual = account.withdraw(2000, 1234);
        double expected = 3000;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatAccountBalanceCannotGoBelowZero() {
        Account account = new Account();

        account.deposit(5000, 1234);

        double actual = account.withdraw(6000, 1234);
        double expected = 5000;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatCorrectPinIsAccepted() {
        Account account = new Account();

        boolean actual = account.validatePin(1234);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatIncorrectPinIsRejected() {
        Account account = new Account();

        boolean actual = account.validatePin(1233);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatMoneyCannotBeDepositedWithWrongPin() {
        Account account = new Account();

        double actual = account.deposit(5000, 1233);
        double expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatMoneyCannotBeWithdrawnWithWrongPin() {
        Account account = new Account();

        account.deposit(5000, 1234);

        double actual = account.withdraw(2000, 1233);
        double expected = 5000;

        Assertions.assertEquals(expected, actual);
    }

}
