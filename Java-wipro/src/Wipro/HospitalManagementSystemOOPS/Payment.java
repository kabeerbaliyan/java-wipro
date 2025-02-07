package Wipro.HospitalManagementSystemOOPS;

public class Payment {
    private double amount;
    private Patient patient;
    private String status;

    public Payment(double amount, Patient patient) {
        this.amount = amount;
        this.patient = patient;
        this.status = "Pending";
    }

    public void processPayment() {
        // Logic to process payment
        this.status = "Completed";
        System.out.println("Payment of " + amount + " processed for patient: " + patient.getName());
    }
}