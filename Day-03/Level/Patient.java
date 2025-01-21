
class HospitalManagementSystem{
	static String hospitalName="City Hospital";
	static int totalPatientCounts;
	private String patientName;
	private int patientAge;
	private String patientAilment;
	final int patientID;
	
	HospitalManagementSystem(int patientID,String patientName, int patientAge, String patientAilment){
		this.patientID = patientID;
		this.patientName=patientName;
		this.patientAge = patientAge;
		this.patientAilment = patientAilment;
		totalPatientCounts++;
	}
	
	static void getTotalPatients(){
		System.out.println("Total patients: " + totalPatientCounts);
	}
	
	void displayPatientsDetails(){
		System.out.println("Hospital Name: " + hospitalName);
		System.out.println("Patient ID: " + patientID);
		System.out.println("Patient Name: " + patientName);
		System.out.println("Patient Age: " + patientAge);
		System.out.println("Patient Aliment: " + patientAilment);
	}
	
}
public class Patient{
	public static void main(String [] args){
		HospitalManagementSystem hospital1= new HospitalManagementSystem(01, "B.K. Sharma", 34, "Cancer" );
		HospitalManagementSystem hospital2= new HospitalManagementSystem(03, "Rachit Sharma", 58, "fever" );
		
		if(hospital1 instanceof HospitalManagementSystem){
			hospital1.displayPatientsDetails();
		}
		if(hospital2 instanceof HospitalManagementSystem){
			hospital2.displayPatientsDetails();
		}
		HospitalManagementSystem.getTotalPatients();
		
	}
     
}