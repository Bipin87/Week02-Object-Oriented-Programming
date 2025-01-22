import java.util.ArrayList;

// Hospital Class
class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display hospital details
    public void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("  - " + doctor.getName() + " (ID: " + doctor.getDoctorId() + ")");
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName() + " (ID: " + patient.getPatientId() + ")");
        }
    }
}

// Doctor Class 
class Doctor {
    private String name;
    private String doctorId;
    private ArrayList<Patient> patients;

    // Constructor
    public Doctor(String name, String doctorId) {
        this.name = name;
        this.doctorId = doctorId;
        this.patients = new ArrayList<>();
    }

    // Get doctor name
    public String getName() {
        return name;
    }

    // Get doctor ID
    public String getDoctorId() {
        return doctorId;
    }

    // Add a patient to the doctor's list
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Maintain bidirectional association
        }
    }

    // Consult a patient
    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " is consulting with patient " + patient.getName());
        } else {
            System.out.println("Dr. " + name + " has no association with patient " + patient.getName());
        }
    }

    // Display all patients of the doctor
    public void displayPatients() {
        System.out.println("Dr. " + name + "'s Patients:");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName());
        }
    }
}

// Patient class
class Patient {
    private String name;
    private String patientId;
    private ArrayList<Doctor> doctors;

    // Constructor
    public Patient(String name, String patientId) {
        this.name = name;
        this.patientId = patientId;
        this.doctors = new ArrayList<>();
    }

    // Get patient name
    public String getName() {
        return name;
    }

    // Get patient ID
    public String getPatientId() {
        return patientId;
    }

    // Add a doctor to the patient's list
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Display all doctors for the patient
    public void displayDoctors() {
        System.out.println("Patient " + name + "'s Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("  - Dr. " + doctor.getName());
        }
    }
}

// Main Class
public class AssociationAndComposition{
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Atul", "D001");
        Doctor doctor2 = new Doctor("Bipul", "D002");

        // Create patients
        Patient patient1 = new Patient("Aman", "P001");
        Patient patient2 = new Patient("Bharat", "P002");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Associate doctors with patients
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient2);

        // Display hospital details
        hospital.displayDetails();

        // Display doctor and patient relationships
        doctor1.displayPatients();
        doctor2.displayPatients();
        patient1.displayDoctors();
        patient2.displayDoctors();

        // Perform consultations
        doctor1.consult(patient1);
        doctor2.consult(patient1); 
        doctor2.consult(patient2);
    }
}
