package week2.objectmodeling;

import java.util.ArrayList;

class Course {
    private String name;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
        course.enrollStudent(this);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}

public class University2 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Aayushi Agarwal");

        Course course1 = new Course("Mathematics");
        course1.assignProfessor(professor1);

        Student student1 = new Student("Student 1");
        student1.enrollCourse(course1);

        System.out.println("Course Name: " + course1.getName());
        System.out.println("Professor Name: " + course1.getProfessor().getName());
        System.out.println("Students in Course:");
        for (Student student : course1.getStudents()) {
            System.out.println(student.getName());
        }
    }
}
