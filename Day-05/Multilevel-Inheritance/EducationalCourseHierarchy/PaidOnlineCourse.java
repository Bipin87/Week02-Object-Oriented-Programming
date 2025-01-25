package EducationalCourseHierarchy;
// subclass
public class PaidOnlineCourse extends OnlineCourse{
    // Attributes
    private double fee;
    private double discount; 

    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Overriding the displayCourseInfo method
    @Override
    public void displayCourseInfo() {
        double finalFee = fee - (fee * discount / 100);
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee + "\n Discount: " + discount + "%\n Final Fee: $" + finalFee);
    }

    
}
