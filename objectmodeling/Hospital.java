package week2.objectmodeling;

import java.util.ArrayList;

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void consult(Patient patient, String consultation) {
        System.out.println("Consultation between Dr. " + name + " and " + patient.getName() + ":");
        System.out.println(consultation);
    }
}

public class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public static void main(String[] args) {
        Hospital hospital = new Hospital("SRM Hospital");

        Doctor doctor1 = new Doctor("Aayushi Agarwal");
        Doctor doctor2 = new Doctor("Shubh Agarwal");

        Patient patient1 = new Patient("Patient 1");
        Patient patient2 = new Patient("Patient 2");

        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        doctor1.consult(patient1, "Patient has a fever.");
        doctor2.consult(patient1, "Patient needs to take medication.");
    }
}

