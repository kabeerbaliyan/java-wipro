package Wipro.com.EmployeeManagement;

public class Task implements Comparable<Task> {
    private int taskId;
    private String description;
    private int priority; // 1 = High, 2 = Medium, 3 = Low
    private String status; // "Pending", "Completed"

    public Task(int taskId, String description, int priority, String status) {
        this.taskId = taskId;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "Task ID=" + taskId +
                ", Description='" + description + '\'' +
                ", Priority=" + priority +
                ", Status='" + status + '\'' +
                '}';
    }
}
