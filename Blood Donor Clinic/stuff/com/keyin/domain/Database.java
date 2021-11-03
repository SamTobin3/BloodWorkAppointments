package com.keyin.domain;

import com.keyin.domain.appointment.AppointmentSlot;
import com.keyin.domain.appointment.AppointmentTime;
import com.keyin.domain.donor.BloodDonor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Database<AppointmentSlot, BloodDonor> {

    public List<AppointmentTime> getAppointmentSlots() {
        ArrayList<AppointmentSlot> appointmentSlots = new ArrayList<com.keyin.domain.appointment.AppointmentTime>();
        new AppointmentSlot(4, "Billy Van's Totally Legit Clinic",
                LocalDate.of(2021, Month.NOVEMBER, 29), LocalTime.of(11, 45),
                LocalTime.of(12, 15), "O positive");
        new AppointmentSlot(5, "Billy Van's Totally Legit Clinic",
                LocalDate.of(2021, Month.NOVEMBER, 29), LocalTime.of(12, 0),
                LocalTime.of(12, 30), "AB negative");
        new AppointmentSlot(6, "Billy Van's Totally Legit Clinic",
                LocalDate.of(2021, Month.NOVEMBER, 29), LocalTime.of(12, 15),
                LocalTime.of(12, 45), "O negative");

        return (List<SRC.com.keyin.domain.appointment.AppointmentTime>) appointmentSlots;
    }

    public BloodDonor getDonor(int id) {
        BloodDonor bd1 = new BloodDonor(1, "Daria", "Morgendorffer",
                LocalDate.of(1981, Month.OCTOBER, 28), "O negative",
                LocalDate.of(2021, Month.MAY, 25));
        BloodDonor bd2 = new BloodDonor(2, "Bojack", "Horseman",
                LocalDate.of(1971, Month.MARCH, 25), "O positive",
                LocalDate.of(2021, Month.AUGUST, 1));
        BloodDonor bd3 = new BloodDonor(3, "Turtle", "Princess",
                LocalDate.of(1991, Month.JANUARY, 2), "AB negative",
                LocalDate.of(2021, Month.OCTOBER, 21));

        HashMap<Integer, BloodDonor> bloodDonors = new HashMap<Integer, BloodDonor>();
        bloodDonors.put(1, bd1);
        bloodDonors.put(2, bd2);
        bloodDonors.put(3, bd3);

        BloodDonor targetBloodDonor = bloodDonors.get(id);

        return targetBloodDonor;
    }
}