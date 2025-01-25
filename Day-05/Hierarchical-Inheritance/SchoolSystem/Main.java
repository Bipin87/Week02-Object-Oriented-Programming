package SchoolSystem;

public class Main {
    public static void main(String[] args) {
        // Create a Teacher instance
        Teacher teacher = new Teacher("Arun", 35, "Mathematics");
        teacher.displayInfo();
        teacher.displayRole();
        System.out.println();

        // Create a Student instance
        Student student = new Student("Bahadur", 16, 10);
        student.displayInfo();
        student.displayRole();
        System.out.println();

        // Create a Staff intance
        Staff staff = new Staff("Shilpa", 40, "Administration");
        staff.displayInfo();
        staff.displayRole();

    }
    
}
