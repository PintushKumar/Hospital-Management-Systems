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

    public String getpID() {
        return pID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getGender() {
        return gender;
    }

    public String getDiseases() {
        return diseases;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Room getRoom() {
        return room;
    }

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
