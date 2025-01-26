package hospitalpatientmanagement;

public class Main {
    // Method to process patient and display their billing details
    public static void processPatient(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Total Bill: " + patient.calculateBill());

        // If the patient has medical records, display them
        if (patient instanceof MedicalRecord) {
            MedicalRecord medicalRecordPatient = (MedicalRecord) patient;
            medicalRecordPatient.viewRecords();
        }
    }

    public static void main(String[] args) {
        // Create instances of InPatient and OutPatient
        InPatient inPatient = new InPatient("IP001", "Arvindra", 45, 200.0, 5);
        OutPatient outPatient = new OutPatient("OP001", "Jayant Yadav", 30, 50.0);

        // Adding medical records for both patients
        inPatient.addRecord("Admitted for surgery.");
        inPatient.addRecord("Recovering well.");
        outPatient.addRecord("Consulted for fever.");

        // Process patients and display details
        System.out.println("Processing In-Patient:");
        processPatient(inPatient);

        System.out.println("\nProcessing Out-Patient:");
        processPatient(outPatient);
    }
}
