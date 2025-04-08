package week2.staticfinalthis;

public class Student {
    public static String universityName;
    public String name;
    public final int rollNumber;
    public char grade;

    public static int totalStudents = 0;

    public static int displayTotalStudents(){
        return totalStudents;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade);
    }
    Student(String name, int rollNumber, char grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; 

    }


    public static void main(String[] args) {
        Student s1 = new Student("SRM ", 1, 'A');
        if (s1 instanceof Student) {
            s1.displayDetails();
        }
        }
    }
    

