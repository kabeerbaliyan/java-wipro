package Wipro.HospitalManagementSystemOOPS;

public class Admin extends User {

    public Admin(String name, String email, String phone) {
        super(name, email, phone);
    }

    public void manageUserData(User user) {
        // Logic to manage user data (add, update, delete)
        System.out.println("Managing user data for: " + user.getName());
    }

    public void generateReports() {
        // Logic to generate system-wide reports
        System.out.println("Generating reports...");
    }
}