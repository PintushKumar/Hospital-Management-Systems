package Models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    String docId;
    String docDegree;
    String name;
    long phoneNumber;
    String speciality;
    int salary;
    String timeSlot;

    List<Patients> patientsList;

    public Doctor(String docId, String docDegree, String name, long phoneNumber, String speciality, int salary, String timeSlot , List<Patients> patientsList) {
        this.docId = docId;
        this.docDegree = docDegree;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
        this.salary = salary;
        this.timeSlot = timeSlot;
        this.patientsList = new ArrayList<>();
    }
}
