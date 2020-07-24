package com.example.patient.startgeypatient;

public class NameDataFilter implements IFilterDataInfo {

   String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean filter(PatientDataModel patientDataModel) {
        return false;
    }
}