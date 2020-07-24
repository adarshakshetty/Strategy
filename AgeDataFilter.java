package com.example.patient.startgeypatient;

public class AgeDataFilter implements IFilterDataInfo {

    int age;



    public void setAge(int age) {
        this.age = age;
    }




    @Override
    public boolean filter(PatientDataModel patientDataModel) {
        return false;
    }
}