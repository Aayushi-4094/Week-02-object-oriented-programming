package week2.encapsulation;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private double treatmentCharge;
    private StringBuilder medicalRecords;

    public InPatient(String patientId, String name, int age, double roomCharge, double treatmentCharge) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.treatmentCharge = treatmentCharge;
        this.medicalRecords = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return roomCharge + treatmentCharge;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.append(record).append("\n");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records for " + getName());
        System.out.println(medicalRecords.toString());
    }
}

class OutPatient extends Patient {
    private double consultationCharge;

    public OutPatient(String patientId, String name, int age, double consultationCharge) {
        super(patientId, name, age);
        this.consultationCharge = consultationCharge;
    }

    @Override
    public double calculateBill() {
        return consultationCharge;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient inPatient = new InPatient("IP001", "Aayushi Agarwal", 22, 1000, 500);
        Patient outPatient = new OutPatient("OP001", "Pritesh Agarwal", 21, 200);

        System.out.println(inPatient.getPatientDetails());
        System.out.println("Bill: " + inPatient.calculateBill());
        if (inPatient instanceof MedicalRecord) {
            MedicalRecord medicalRecord = (MedicalRecord) inPatient;
            medicalRecord.addRecord("Diagnosis: Fever");
            medicalRecord.addRecord("Treatment: Medication");
            medicalRecord.viewRecords();
        }

        System.out.println(outPatient.getPatientDetails());
        System.out.println("Bill: " + outPatient.calculateBill());
}
}

