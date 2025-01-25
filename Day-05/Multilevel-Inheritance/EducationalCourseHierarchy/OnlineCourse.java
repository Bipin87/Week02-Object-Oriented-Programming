package EducationalCourseHierarchy;

public class OnlineCourse extends Course{
    // Attributes
    private String platform;
    private boolean isRecorded;

    // Constructor
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overriding the displayCourseInfo method
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform + "\n Recorded: " + (isRecorded ? "Yes" : "No"));
    }
    
}
