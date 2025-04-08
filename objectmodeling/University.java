package week2.objectmodeling;

import java.util.ArrayList;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private ArrayList<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }
}

public class University {
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void displayUniversityInfo() {
        System.out.println("University Name: " + name);
        for (Department department : departments) {
            System.out.println("Department Name: " + department.getName());
            for (Faculty faculty : department.getFaculties()) {
                System.out.println("Faculty Name: " + faculty.getName());
            }
        }
    }

    public static void main(String[] args) {
        University university = new University("SRM University");

        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mathematics");

        Faculty faculty1 = new Faculty("Aayushi Agarwal");
        Faculty faculty2 = new Faculty("Kishore sir");

        department1.addFaculty(faculty1);
        department2.addFaculty(faculty2);

        university.addDepartment(department1);
        university.addDepartment(department2);
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.displayUniversityInfo();
        university = null;
    }
}
