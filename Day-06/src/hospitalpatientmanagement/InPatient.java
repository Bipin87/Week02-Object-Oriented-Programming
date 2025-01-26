package hospitalpatientmanagement;
import java.util.ArrayList;
public class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int daysAdmitted;
    private ArrayList<String> records;

    // Constructor
    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
        this.records = new ArrayList<>();
    }

    // Implementing calculateBill with in-patient billing logic
    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    // Implementing addRecord from MedicalRecord interface
    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    // Implementing viewRecords from MedicalRecord interface
    @Override
    public void viewRecords() {
        System.out.println("Medical Records for In-Patient " + getName() + ":");
        for (String record : records) {
            System.out.println(record);
        }
    }
}