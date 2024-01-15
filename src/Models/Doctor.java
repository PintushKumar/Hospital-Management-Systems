package Models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    String docId;
    String docDegree;
    String name;

    public String getDocId() {
        return docId;
    }

    public String getDocDegree() {
        return docDegree;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getSalary() {
        return salary;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public List<Patients> getPatientsList() {
        return patientsList;
    }

    long phoneNumber;
    String speciality;

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public void setDocDegree(String docDegree) {
        this.docDegree = docDegree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public void setPatientsList(List<Patients> patientsList) {
        this.patientsList = patientsList;
    }

    int salary;
    String timeSlot;

    List<Patients> patientsList;

    public Doctor(String docId, String docDegree, String name, long phoneNumber, String speciality, int salary, String timeSlot) {
        this.docId = docId;
        this.docDegree = docDegree;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
        this.salary = salary;
        this.timeSlot = timeSlot;
        this.patientsList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Doctor  { \n " +
                "docId='" + docId + '\'' +
                ",\t docDegree='" + docDegree + '\'' +
                ", \t name='" + name + '\'' +
                ", \t phoneNumber=" + phoneNumber +
                ", \t speciality='" + speciality + '\'' +
                ", \t salary=" + salary +
                ", \t timeSlot='" + timeSlot + '\'' +"\n"+
                '}';
    }
}
