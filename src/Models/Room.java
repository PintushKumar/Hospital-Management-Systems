package Models;

public class Room {
    String roomId;
    boolean isOccupied;
    Patients patients;
    Doctor doctor;

    public Room(String roomId, boolean isOccupied, Patients patients, Doctor doctor) {
        this.roomId = roomId;
        this.isOccupied = isOccupied;
        this.patients = patients;
        this.doctor = doctor;
    }
}
