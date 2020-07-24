package com.example.patient.startgeypatient;

public class PatientInfo {

 public static void main(String[] args)
 {
  PatientDataProvider patientDataProvider =new PatientDataProvider();
  patientDataProvider.getPatientInfo(new NameDataFilter());


  patientDataProvider.getPatientInfo(new AgeDataFilter());


  patientDataProvider.getPatientInfo(new EmailDataFilter());


 }


}


