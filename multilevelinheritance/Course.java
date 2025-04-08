package week2.multilevelinheritance;
public class Course {
    String courseName;
    String duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
    }
}
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, String duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + isRecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, String duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        Course course = new Course("Java Programming", "3 months");
        OnlineCourse onlineCourse = new OnlineCourse("Python Programming", "2 months", "Udemy", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Data Science", "6 months", "Coursera", false, 1000, 10);

        course.displayCourseInfo();
        System.out.println();
        onlineCourse.displayCourseInfo();
        System.out.println();
        paidOnlineCourse.displayCourseInfo();
}
}
