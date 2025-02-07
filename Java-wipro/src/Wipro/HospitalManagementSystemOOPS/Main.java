package Wipro.HospitalManagementSystemOOPS;

public class Main {
    public static void main(String[] args) {
        // Create instances of users
        Patient patient1 = new Patient("Kabeer Baliyan", "kabeerbaliyan25@gmail.com.com", "9557197170");
        Doctor doctor1 = new Doctor("Dr. Bansal", "bansaldoc@gmail.com.com", "9087654321", "Cardiology");
        Admin admin1 = new Admin("Admin User", "adminuser@gmail.com", "09876543211");

        // Patient books an appointment
        patient1.bookAppointment(doctor1, "2023-10-01 10:00");
        
        // Doctor views their appointments
        System.out.println("Doctor's Appointments:");
        for (Appointment appointment : doctor1.viewAppointments()) {
            System.out.println("Appointment with " + appointment.getPatient().getName() + " on " + appointment.getDateTime());
        }

        // Patient views their medical history (initially empty)
        System.out.println("Patient's Medical History: " + patient1.viewMedicalHistory());

        // Patient makes a payment
        patient1.makePayment(100.0);

        // Admin manages user data
      //  admin1.manageUser Data(patient1);
       // admin1.manageUser Data(doctor1);

        // Admin generates reports
        admin1.generateReports();
    }
}