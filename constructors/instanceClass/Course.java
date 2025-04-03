package constructors.instanceClass;

public class Course {
    String courseName;
    String duration;
    int fee;
    static String instituteName = "SRM Institute of Science and Technology";
    Course(String courseName, String duration, int fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }
    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", "3 months", 10000);
        Course course2 = new Course("Data Science", "6 months", 20000);
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();

        Course.updateInstituteName("SRM University");

        System.out.println("\nUpdated Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nUpdated Course 2 Details:");
        course2.displayCourseDetails();
    }
}

