package tdd;

import BankApp.Account;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class AccountTest {


    @Test
    public void depositMoneyBalanceIncreases(){
        Account account = new Account("AccountName","AccountNumber", "pin");
        assertEquals(0,account.CheckBalance("pin"));
        account.deposit(5_000);
        assertEquals(5_000, account.CheckBalance("pin"));
    }
    @Test
    public void cannotDepositNegativeAmount() {
        Account account = new Account("AccountName", "AccountNumber", "pin");
        account.deposit(5_000);
        assertEquals(5_000, account.CheckBalance("pin"));
        account.deposit(-3_000);
        assertEquals(5_000,account.CheckBalance("pin"));
    }
    @Test
    public void checkBalance(){
        Account account = new Account("AccountName","AccountNumber", "pin");
        account.deposit(5_000);
        assertEquals(5_000,account.CheckBalance("pin"));
        account.withdraw(3_000,"pin");
        assertEquals(2_000,account.CheckBalance("pin"));
    }

    @Test
    public  void canWithdrawMoneyBalanceDecreases(){
        Account account = new Account("AccountName","AccountNumber", "pin");
        account.deposit(5_000);
        account.withdraw(2_000,"pin");
        assertEquals(3_000,account.CheckBalance("pin"));
    }
    @Test
    public void cannotWithdrawAmountHigherThanBalance(){
        Account account = new Account("AccountName","AccountNumber", "pin");
        account.deposit(5_000);
        assertThrows(NullPointerException.class, ()->{account.withdraw(6_000,  "pin");});
        assertEquals(5_000,account.CheckBalance("pin"));
    }

    @Test
    public void cannotWithdrawNegativeAmount(){
        Account account = new Account("AccountName","AccountNumber", "pin");
        account.deposit(5_000);
        assertThrows(NullPointerException.class, ()->{account.withdraw(-2_000,  "pin");});
        assertEquals(5_000,account.CheckBalance("pin"));
    }
    @Test
        public void testToUpdatePin(){
        Account account = new Account("AccountName", "AccountNumber","pin");
        account.deposit(5000.00);
        assertEquals(5_000,account.CheckBalance("pin"));
        account.updatePin("pin","pin2");
        account.deposit(5000.00);
        assertEquals(10000,account.CheckBalance("pin2"));
    }

    }










