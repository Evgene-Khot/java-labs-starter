package edu.course.lab02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class CourseToollitTest {

    @Test
    void returnsWithdraw() {
        BankAccount result = new BankAccount(800);

        result.withdraw(500);

        assertEquals(300, result.getBalance());
    }

    @Test
    void returnsWithdrawError() {
        BankAccount result = new BankAccount(800);

        assertThrows(IllegalArgumentException.class, () -> {
                result.withdraw(1000);
        });
    }
}