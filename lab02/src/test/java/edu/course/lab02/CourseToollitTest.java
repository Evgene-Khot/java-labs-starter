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

    @Test
    void СreateTaskhValidValues() {
        ProjectTask task = new ProjectTask("TASK-1", "Добавить авторизацию", TaskStatus.TODO, 8);

        assertEquals("TASK-1", task.getId());
        assertEquals("Добавить авторизацию", task.getTitle());
        assertEquals(TaskStatus.TODO, task.getStatus());
        assertEquals(8, task.getEstimatedHours());
    }

    @Test
    void rejectsBlankId() {
        assertThrows(IllegalArgumentException.class, () ->
                new ProjectTask("", "Задача", TaskStatus.TODO, 8));
    }

    @Test
    void rejectsNullTitle() {
        assertThrows(IllegalArgumentException.class, () ->
                new ProjectTask("TASK-1", null, TaskStatus.TODO, 8));
    }

    @Test
    void rejectsNullStatus() {
        assertThrows(NullPointerException.class, () ->
                new ProjectTask("TASK-1", "Задача", null, 8));
    }

    @Test
    void rejectsNonPositiveEstimatedHours() {
        assertThrows(IllegalArgumentException.class, () ->
            new ProjectTask("TASK-1", "Задача", TaskStatus.TODO, 0));
    }
}
