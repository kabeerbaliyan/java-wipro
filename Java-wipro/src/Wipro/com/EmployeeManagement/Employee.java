package Wipro.com.EmployeeManagement;

public class Employee {
    private int employeeId;
    private String name;
    private String department;

    public Employee(int employeeId, String name, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + employeeId +
                ", Name='" + name + '\'' +
                ", Department='" + department + '\'' +
                '}';
    }
}
