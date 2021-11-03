package com.keyin.domain.appointment;

import java.time.LocalDate;
import java.time.LocalTime;

public class BloodAppointment {
    private String id;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String location;
    private String bloodType;
    private boolean firsttimeDonor;
    private int donorId;

    public BloodAppointment() {

    }


    public BloodAppointment(String bloodType, boolean firsttimeDonor, int donorId) {
        this.bloodType = bloodType;
        this.firsttimeDonor = firsttimeDonor;
        this.donorId = donorId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public boolean isFirsttimeDonor() {
        return firsttimeDonor;
    }

    public void setFirsttimeDonor(boolean firsttimeDonor) {
        this.firsttimeDonor = firsttimeDonor;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public String toString() {
        return "BloodDonationAppointment. ID: " + this.id + ", Location: " + this.location + ", Date: " + this.date +
                ", Start Time: " + this.startTime + ", End Time: " + this.endTime + ", Blood type: " + this.bloodType
                + ", First-time donor: " + this.firsttimeDonor + ", Donor ID: " + this.donorId;
    }

}