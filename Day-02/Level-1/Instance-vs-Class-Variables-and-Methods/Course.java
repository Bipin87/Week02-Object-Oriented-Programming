class CourseManagement{
    // Instance Variable
    String courseName;
    int duration;
    int fee;

    // Class Variable
    static String instituteName;

    // Parameterized Constructor
    CourseManagement(String courseName, int duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method to display course details
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " Months");
        System.out.println("Fee: $" + fee);
        System.out.println();
    }

    // Class Method to update institute name
    static void updateInstituteName(String newInstituteName) {
        CourseManagement.instituteName = newInstituteName;
        
    }


}
public class Course {

    public static void main(String[] args) {
        // Set the institute name
        CourseManagement.updateInstituteName("RGPV Institute");
        // Create an instance of CourseManagement
        CourseManagement course1 = new CourseManagement("Python Programming", 6, 5000);
        CourseManagement course2 = new CourseManagement("Data Science", 9, 8000);
        
        // Display course details
        System.out.println("Course details before institute name update: ");
        System.out.println();
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Update institute name
        CourseManagement.updateInstituteName("Technocrats Institute of Technology");

        // Display course details after institute name update
        System.out.println("Course details after institute name update: ");
        System.out.println();
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }



}