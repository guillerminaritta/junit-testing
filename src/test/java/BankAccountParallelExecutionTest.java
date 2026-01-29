import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(BankAccountParameterResolver.class)
@Execution(ExecutionMode.CONCURRENT)

public class BankAccountParallelExecutionTest {
    @Test
    @DisplayName("Deposit 500 successfully")
    public void testDeposit1(BankAccount bankAccount){
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 500 successfully")
    public void testDeposit2(BankAccount bankAccount){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 500 successfully")
    public void testDeposit3(BankAccount bankAccount){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }
}
