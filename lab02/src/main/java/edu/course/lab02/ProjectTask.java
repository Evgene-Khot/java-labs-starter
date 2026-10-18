package edu.course.lab02;

import java.util.Objects;

public final class ProjectTask {
    
    private final String id;
    private final String title;
    private TaskStatus status;
    private int estimatedHours;
    
    private static String requireText(String value, String fieldName) {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException(fieldName + " не должен быть null или пустым");
        
        return value;
    }

    public ProjectTask(String id, String title, TaskStatus status, int estimatedHours) {
        this.id = requireText(id, "id");
        this.title = requireText(title, "title");
        this.status = Objects.requireNonNull(status, "status не должен быть null");

        if (estimatedHours <= 0)
            throw new IllegalArgumentException("Оценка должна быть больше нуля");
        
        this.estimatedHours = estimatedHours;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public void changeStatus(TaskStatus newStatus) {
        this.status = Objects.requireNonNull(newStatus, "Новый статус не должен быть null");
    }

    public boolean isCompleted() {
        return status == TaskStatus.DONE;
    }

    public void increaseEstimatedHours(int hours) {
        if (hours <= 0)
            throw new IllegalArgumentException("Добавляемое число часов должно быть положительным");

        estimatedHours = Math.addExact(estimatedHours, hours);
    }    
}
