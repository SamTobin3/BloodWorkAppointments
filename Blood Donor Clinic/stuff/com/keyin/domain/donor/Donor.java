package com.keyin.domain.donor;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class Donor {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String bloodType;
    private LocalDate nextAppointmentDate;
    private LocalDate lastDonationDate;

    public Donor() {

    }

    public Donor(int id, String firstName, String lastName, LocalDate dob, String bloodType, LocalDate nextAppointmentDate, LocalDate lastDonationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.bloodType = bloodType;
        this.nextAppointmentDate = nextAppointmentDate;
        this.lastDonationDate = lastDonationDate;
    }

    public Donor(int id, String firstName, String lastName, LocalDate dob, String bloodType, LocalDate lastDonationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.bloodType = bloodType;
        this.nextAppointmentDate = null;
        this.lastDonationDate = lastDonationDate;
    }

    public Donor(int id, String firstName, String lastName, LocalDate dob, String bloodType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.bloodType = bloodType;
        this.nextAppointmentDate = null;
        this.lastDonationDate = null;
    }

    public long getAge() {
        LocalDate today = LocalDate.now();
        long age = YEARS.between(dob, today);
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dob = dob;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public LocalDate getNextAppointmentDate() {
        return nextAppointmentDate;
    }

    public void setNextAppointmentDate(LocalDate nextAppointmentDate) {
        this.nextAppointmentDate = nextAppointmentDate;
    }

    public LocalDate getLastDonationDate() {
        return lastDonationDate;
    }

    public void setLastDonationDate(LocalDate lastDonationDate) {
        this.lastDonationDate = lastDonationDate;
    }

    public String toString() {
        return "Blood Donor. ID: " + id + ", First name: " + firstName + ", Last name: " + lastName + "Date of birth: "
                + dob + ", Blood type: " + bloodType + "Next appointment: " + nextAppointmentDate
                + ", Last donation date: " + lastDonationDate;
    }
}