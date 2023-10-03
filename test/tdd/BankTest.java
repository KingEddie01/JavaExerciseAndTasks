package tdd;

import BankApp.Bank;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class BankTest {
    @Test
        public void bankExist(){
            Bank bank = new Bank("ACCESS BANK NIGERIA PLC");
            assertNotNull(bank);
        }
    @Test
        public void testToRegisterAccount() {
        Bank bank = new Bank("ACCESS BANK NIGERIA PLC");
        bank.register("Edmund", "Udeh", "pin");
        assertEquals(1, bank.numberOfRegisteredAccount());
    }

    @Test
        public void testToDepositInYourAccount(){
            Bank bank = new Bank("ACCESS BANK NIGERIA PLC");
            bank.register("Edmund","Udeh","pin");
            bank.findAccount("1");
            bank.deposit("1",5000.00);
            assertEquals(5000.00, bank.checkBalance("1","pin"));

        }

    @Test
        public void testYouCannotDepositNegativeAmountIntoAccount(){
        Bank bank = new Bank("ACCESS BANK NIGERIA PLC");
        bank.register("Edmund","Udeh","pin");
        bank.findAccount("1");
        assertThrows(IllegalArgumentException.class, ()-> bank.deposit("1", -5000.00));        ;

    }
    @Test
        public void testToWithdrawFromAccount(){
        Bank bank = new Bank("ACCESS BANK NIGERIA PLC");
        bank.register("Edmund","Udeh","pin");
        bank.findAccount("1");
        bank.deposit("1",5000.00);
        assertEquals(5000.00,bank.checkBalance("1", "pin"));
        bank.withdraw(3000.00, "1","pin");
        assertEquals(2000.00,bank.checkBalance("1", "pin"));
    }

    @Test
    public void testToTransferToOtherBank(){
        Bank bank = new Bank("ACCESS BANK NIGERIA PLC");
        bank.register("Edmund","Udeh","pin");
        bank.findAccount("1");
        bank.deposit( "1",5000.00);
        assertEquals(5000.00,bank.checkBalance("1", "pin"));
        bank.register("Ashley","Ndabai","pin1");
        bank.findAccount("2");
        assertEquals(0.0,bank.checkBalance("2", "pin1"));
        bank.transfer(2000.00, "1","2","pin");
        assertEquals(2000.00,bank.checkBalance("2", "pin1"));
        assertEquals(3000.00,bank.checkBalance("1", "pin"));

    }









        }








