package hospitalpatientmanagement;

import java.util.ArrayList;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private ArrayList<String> records;

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    // Implementing calculateBill with out-patient billing logic
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Implementing addRecord from MedicalRecord interface
    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    // Implementing viewRecords from MedicalRecord interface
    @Override
    public void viewRecords() {
        System.out.println("Medical Records for Out-Patient " + getName() + ":");
        for (String record : records) {
            System.out.println(record);
        }
    }
}
