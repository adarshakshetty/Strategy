package com.example.patient.startgeypatient;

public class EmailDataFilter implements IFilterDataInfo {

    String email;


    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean filter(PatientDataModel patientDataModel) {
        return false;
    }
}