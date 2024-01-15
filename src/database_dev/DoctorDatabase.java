package database_dev;

import Models.Doctor;
import Models.Patients;

import java.util.HashMap;
import java.util.List;

public class DoctorDatabase {
    HashMap<String , Doctor> doctorDB;

   public DoctorDatabase(){
       this.doctorDB=new HashMap<>();
   }
    public Doctor getMinimumPatientDoctor(){
        Doctor minDoc = null;
        int min = Integer.MAX_VALUE;
        for(String key : doctorDB.keySet()){
            Doctor doc = doctorDB.get(key);
            List<Patients> patientList = doc.getPatientsList();
            if(patientList.size() < min){
                minDoc = doc;
                min = patientList.size();
            }
        }
        return minDoc;
    }

    public Doctor getDoctorId(String id){
       return doctorDB.get(id);
    }

    public void addDoctorToDB(Doctor doctor){
       String docId = doctor.getDocId();
       doctorDB.put(docId , doctor);
    }

    public  int getTotalDoctors(){
       return doctorDB.size();
    }
}
