package week2.objectmodeling;

import java.util.ArrayList;

class Course {
    private String name;
    private ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void displayStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }
}

public class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        School school = new School("SRM School");

        Student student1 = new Student("Aayushi Agarwal");
        Student student2 = new Student("Shubh");

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        school.addStudent(student1);
        school.addStudent(student2);

        student1.displayCourses();
        student2.displayCourses();

        course1.displayStudents();
        course2.displayStudents();
}
}
