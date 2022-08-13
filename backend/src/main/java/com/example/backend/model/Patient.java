package com.p196.db.model;

import com.nimbusds.jose.shaded.json.JSONObject;
import org.apache.tomcat.jni.Local;

import java.beans.Transient;
import java.time.LocalDate;
import java.time.Period;

public class Patient
{
    private Integer patientId;
    private String name;
    private String gender;
    private String status;
    private String doctor;
    private String doctorStatus;
    private String treatment;
    private LocalDate dob;
    private String healthStatus;
    private Integer age;
    private String image;

    public Patient() {
    }

    public Integer getpatientId() {
        return patientId;
    }

    public void setpatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge() {
        this.age = Period.between(dob, LocalDate.now()).getYears();
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public String toString() {
        return "PatientRegistration{" +
                "patientId=" + patientId +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", treatment='" + treatment + '\'' +
                ", dob=" + dob +
                ", healthStatus='" + healthStatus + '\'' +
                ", age=" + age +
                '}';
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("patientId", patientId);
        json.put("gender", gender);
        json.put("name", name);
        json.put("treatment", treatment);
        json.put("dob", dob);
        json.put("healthStatus", healthStatus);
        json.put("age", age);
        return json;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getdoctor() {
		return doctor;
	}

	public void setdoctor(String string) {
		this.doctor = string;
	}

	public String getdoctorStatus() {
		return doctorStatus;
	}

	public void setdoctorStatus(String technicianStatus) {
		this.doctorStatus = technicianStatus;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
