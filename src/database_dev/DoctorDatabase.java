package database_dev;

import Models.Doctor;

import java.util.HashMap;

public class DoctorDatabase {
    HashMap<String , Doctor> doctorDB;

    DoctorDatabase(){
        this.doctorDB=new HashMap<>();
    }
}
