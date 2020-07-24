package com.example.patient.startgeypatient;
import  java.util.*;
        import java.util.ArrayList;

public class PatientDataProvider {

    ArrayList<PatientDataModel> patientDataModels;

    public ArrayList<PatientDataModel> getPatientInfo(IFilterDataInfo iGetPatientInfo)
    {


        Iterator<PatientDataModel> iterator= patientDataModels.iterator();
        while(iterator.hasNext()){
           if(iGetPatientInfo.filter(iterator.next())){

            }
        }

        return null;
    }
}
