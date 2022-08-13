package com.p196.db.model;


public class Doctor extends User {
    private String Specialist;
    private Integer numPatients;

    public String getSpecialist() {
        return Specialist;
    }

    public void setType(String specialist) {
        Specialist = specialist;
    }

    public Integer getNumPatients() {
        return numPatients;
    }

    public void setNumPatients(Integer numPatients) {
        this.numPatients = numPatients;
    }
}
