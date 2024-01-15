package database_dev;

import Models.Patients;

import java.util.HashMap;

public class PatientsDatabase {
    HashMap<String , Patients> patientsDB;
   public PatientsDatabase(){
        this.patientsDB = new HashMap<>();
   }
    public void addPatient(Patients obj){
       String pId = obj.getpID();
       patientsDB.put(pId , obj);
    }
    public Patients getPatients(String pId){
        return patientsDB.get(pId);
    }

    public int getTotalPatientCount(){
       return patientsDB.size();
    }


}
