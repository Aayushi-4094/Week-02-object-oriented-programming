package staticfinalthis;

public class Patient {
public static String hospitalName = "Apollo Hospital";
public static int totalPatients = 0;

public static int getTotalPatients() {
    return totalPatients;
}

public final int patientID;
public String name;
public int age;
public String ailment;

public Patient(int patientID, String name, int age, String ailment) {
    this.patientID = patientID;
    this.name = name;
    this.age = age;
    this.ailment = ailment;
    totalPatients++;
}

public void displayPatientDetails() {
    System.out.println("Patient ID: " + patientID);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Ailment: " + ailment);
}

public static void main(String[] args) {
    Patient patient1 = new Patient(1, "Pankaj", 30, "Fever");
    Patient patient2 = new Patient(2, "Ritu", 25, "Cold");

    if (patient1 instanceof Patient) {
        patient1.displayPatientDetails();
    }

    if (patient2 instanceof Patient) {
        patient2.displayPatientDetails();
    }

    System.out.println("Total Patients: " + getTotalPatients());
    System.out.println("Hospital Name: " + hospitalName);
}

}