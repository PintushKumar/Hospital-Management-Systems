package Models;

public class Patients {
     String pID;
     String name;
     int age;
     long phoneNumber;
     String emailId;
     String gender;
     String diseases;
     Doctor doctor;
     Room room;

    public Patients(String pID, String name, int age, long phoneNumber, String emailId, String gender, String diseases , Doctor doctor , Room room ) {
        this.pID = pID;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.gender = gender;
        this.diseases = diseases;
        this.doctor =doctor;
        this.room=room;
    }
}
