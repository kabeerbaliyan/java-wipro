package Wipro.com.EmployeeManagement;

public class Main {
    public static void main(String[] args) {
        EmployeeTaskManagementSystem system = new EmployeeTaskManagementSystem();

        // Adding employees
        system.addEmployee(1, "Alice", "HR");
        system.addEmployee(2, "Bob", "IT");

        // Assigning tasks
        system.assignTask(1, 101, "Update employee records", 1);
        system.assignTask(2, 102, "Fix server issues", 2);
        system.assignTask(1, 103, "Conduct interviews", 3);

        // Retrieve tasks
        system.retrieveTasksByPriority();
        system.retrieveTasksByEmployee("Alice");
        system.retrieveTasksByDepartment("IT");

        // Update task status
        for (Task task : system.getPendingTasks()) { // Using getter method
            if (task.getTaskId() == 102) {
                task.setStatus("Completed");
            }
        }

        // Remove completed tasks
        system.removeCompletedTasks();

        // Track pending tasks
        system.trackPendingTasks();
    }
}
