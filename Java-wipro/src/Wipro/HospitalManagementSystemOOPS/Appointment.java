package Wipro.HospitalManagementSystemOOPS;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String dateTime;
    private String status;

    public Appointment(Patient patient, Doctor doctor, String dateTime) {
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
        this.status = "Scheduled";
    }

    // Getters
    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getStatus() {
        return status;
    }
}