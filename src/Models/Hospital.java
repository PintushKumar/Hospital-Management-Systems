package Models;

import database_dev.DoctorDatabase;
import database_dev.PatientsDatabase;
import database_dev.RoomDatabase;

public class Hospital {
    private String name;
    private String address;
    private String emailId;
    private long phoneNumber;
    private PatientsDatabase patientsDatabase;
    private DoctorDatabase doctorDatabase;
    private RoomDatabase roomDatabase;

    public Hospital(String name, String address, String emailId, long phoneNumber) {
        this.name = name;
        this.address = address;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.patientsDatabase= new PatientsDatabase();
        this.doctorDatabase=new DoctorDatabase();
        this.roomDatabase=new RoomDatabase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void admitPatient(String name ,int age , long phoneNumber , String emailId , String gender , String diseases ){
        // Now it is work of hospital to  assign doctor to patient
        // Hospital will assign rooms to patient
        // Hospital will create id for patient
        // When we will get all the details we will create patient object
        // and we will be using our database to save that patient object

        // 1. Generate Id for the patient ->
        int totalPatientCount = patientsDatabase.getTotalPatientCount() + 1;
        String pId = "PID"+totalPatientCount;

        // 2. Get the doctor who is handeling minimum number of patient
        Doctor doctor = doctorDatabase.getMinimumPatientDoctor();

        // 3. get the room which is not occupied
        Room room = roomDatabase.getUnoccupiedRoom();
        room.setOccupied(true);

        Patients p = new Patients(pId , name , age, phoneNumber , emailId , gender , diseases , doctor , room , true);
        doctor.patientsList.add(p);

        System.out.println("Patient admitted Successfully.......\n"+p);
    }

    public void createRoom(){
        String roomId = "Room_Id :- "+(roomDatabase.getTotalRoom()+1);
        Room r = new Room(roomId , false , null , null);
        roomDatabase.addRoomToDB(r);
        System.out.println("Room Provided Successfully .... \n "+r);
    }

    public void  appoinmentDoctor(String docDegree , String name , long phoneNumber , String speciality , int salary  , String timeSlot){
        String docId = "Doctor_Id :- "+(doctorDatabase.getTotalDoctors()+1);
        Doctor doc = new Doctor(docId , docDegree , name ,phoneNumber, speciality , salary , timeSlot );
        doctorDatabase.addDoctorToDB(doc);
        System.out.println("Doctor added Successfully to Hospital .... \n "+doc);
    }

}
