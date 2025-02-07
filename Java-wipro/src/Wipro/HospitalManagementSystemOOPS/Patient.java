package Wipro.HospitalManagementSystemOOPS;

import java.util.ArrayList;
import java.util.List;
public class Patient extends User {
	private List<String> medicalHistory;
    private List<Appointment> appointments;

    public Patient(String name, String email, String phone) {
        super(name, email, phone);
        this.medicalHistory = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void bookAppointment(Doctor doctor, String dateTime) {
        Appointment appointment = new Appointment(this, doctor, dateTime);
        appointments.add(appointment);
        doctor.addAppointment(appointment);
        System.out.println("Appointment booked with Dr. " + doctor.getName() + " on " + dateTime);
    }

    public List<String> viewMedicalHistory() {
        return medicalHistory;
    }

    public void makePayment(double amount) {
        Payment payment = new Payment(amount, this);
        payment.processPayment();
    }
	
	

}
