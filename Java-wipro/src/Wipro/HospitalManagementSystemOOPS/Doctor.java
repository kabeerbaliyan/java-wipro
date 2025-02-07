package Wipro.HospitalManagementSystemOOPS;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends User {
    private String specialization;
    private List<Appointment> appointments;

    public Doctor(String name, String email, String phone, String specialization) {
        super(name, email, phone);
        this.specialization = specialization;
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> viewAppointments() {
        return appointments;
    }

    public void accessPatientRecords(Patient patient) {
        // Logic to access patient records based on specialization
        System.out.println("Accessing records for patient: " + patient.getName());
    }
}
