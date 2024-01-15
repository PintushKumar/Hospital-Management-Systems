package Models;

public class Room {
    String roomId;
    boolean isOccupied;
    Patients patients;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Patients getPatients() {
        return patients;
    }

    public void setPatients(Patients patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", isOccupied=" + isOccupied +
                '}';
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    Doctor doctor;

    public Room(String roomId, boolean isOccupied, Patients patients, Doctor doctor) {
        this.roomId = roomId;
        this.isOccupied = isOccupied;
        this.patients = patients;
        this.doctor = doctor;
    }

}
