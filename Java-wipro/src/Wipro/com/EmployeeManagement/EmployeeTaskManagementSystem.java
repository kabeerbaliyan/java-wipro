package Wipro.com.EmployeeManagement;

import java.util.*;

public class EmployeeTaskManagementSystem {
    private HashMap<Integer, Employee> employees = new HashMap<>();
    private HashMap<Integer, List<Task>> employeeTasks = new HashMap<>();
    private PriorityQueue<Task> taskPriorityQueue = new PriorityQueue<>();
    private LinkedList<Task> pendingTasks = new LinkedList<>();

    // Add a new employee
    public void addEmployee(int id, String name, String department) {
        Employee employee = new Employee(id, name, department);
        employees.put(id, employee);
        employeeTasks.put(id, new ArrayList<>());
        System.out.println("Employee added: " + employee);
    }

    // Assign a task to an employee
    public void assignTask(int employeeId, int taskId, String description, int priority) {
        if (!employees.containsKey(employeeId)) {
            System.out.println("Employee not found!");
            return;
        }
        Task task = new Task(taskId, description, priority, "Pending");
        employeeTasks.get(employeeId).add(task);
        taskPriorityQueue.add(task);
        pendingTasks.add(task);
        System.out.println("Task assigned: " + task);
    }

    // Retrieve tasks by priority
    public void retrieveTasksByPriority() {
        System.out.println("Tasks by Priority:");
        while (!taskPriorityQueue.isEmpty()) {
            System.out.println(taskPriorityQueue.poll());
        }
    }

    // Retrieve tasks by employee name
    public void retrieveTasksByEmployee(String employeeName) {
        for (Map.Entry<Integer, List<Task>> entry : employeeTasks.entrySet()) {
            if (employees.get(entry.getKey()).getName().equalsIgnoreCase(employeeName)) {
                System.out.println("Tasks for " + employeeName + ": " + entry.getValue());
            }
        }
    }

    // Retrieve tasks by department
    public void retrieveTasksByDepartment(String department) {
        System.out.println("Tasks for Department: " + department);
        for (Map.Entry<Integer, List<Task>> entry : employeeTasks.entrySet()) {
            if (employees.get(entry.getKey()).getDepartment().equalsIgnoreCase(department)) {
                System.out.println("Employee: " + employees.get(entry.getKey()));
                System.out.println("Tasks: " + entry.getValue());
            }
        }
    }

    // Remove completed tasks
    public void removeCompletedTasks() {
        Iterator<Task> iterator = pendingTasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getStatus().equalsIgnoreCase("Completed")) {
                iterator.remove();
            }
        }
        System.out.println("Completed tasks removed.");
    }

    // Track pending tasks
    public void trackPendingTasks() {
        System.out.println("Pending Tasks:");
        for (Task task : pendingTasks) {
            System.out.println(task);
        }
    }

    // Getter for pendingTasks
    public LinkedList<Task> getPendingTasks() {
        return pendingTasks;
    }
}
