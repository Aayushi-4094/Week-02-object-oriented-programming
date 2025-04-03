package constructors.accessmodifier;

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNumber = 1;
        s1.setName("Pritesh Agarwal");
        s1.setCGPA(8.5);
        System.out.println("Roll Number: " + s1.rollNumber);
        System.out.println("Name: " + s1.getName());
        System.out.println("CGPA: " + s1.getCGPA());
    }
}

class PostgraduateStudent extends Student {
    private String researchTopic;

    public void setResearchTopic(String topic) {
        this.researchTopic = topic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void displayDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Research Topic: " + researchTopic);
    }

    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent();
        pgStudent.rollNumber = 2;
        pgStudent.setName("Aayushi Agarwal");
        pgStudent.setCGPA(9.0);
        pgStudent.setResearchTopic("Artificial Intelligence");
        pgStudent.displayDetails();
}
}
