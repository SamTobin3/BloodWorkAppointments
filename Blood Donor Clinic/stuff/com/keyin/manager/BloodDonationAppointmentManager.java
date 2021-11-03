package com.keyin.manager;

import static java.time.temporal.ChronoUnit.DAYS;

import java.util.List;

import com.keyin.domain.Database;
import com.keyin.domain.appointment.AppointmentSlot;
import com.keyin.domain.appointment.BloodDonationAppointment;


public class BloodDonationAppointmentManager {
    private static final InvalidDonationSchedulingException INVALID_DONATION_SCHEDULING_EXCEPTION = new InvalidDonationSchedulingException("The donor is under 18 years of age.");
    private static final InvalidDonationSchedulingException INVALID_DONATION_SCHEDULING_EXCEPTION2 = INVALID_DONATION_SCHEDULING_EXCEPTION;
    private Database database;

    public BloodDonationAppointmentManager(Database database) {
        this.database = database;
    }

    public BloodDonationAppointment bookAppointment(int bloodDonorId) {
        BloodDonationAppointment bloodDonationAppointment = new BloodDonationAppointment();

        database.getDonor(bloodDonorId);
        // Ensure donor doesn't already have an appointment scheduled
        if(bloodDonor.getNextAppointmentDate() != null) {
            throw new InvalidDonationSchedulingException(("The donor already has an appointment scheduled"));
        }
        // Ensure donor is at least 18 years old and under 80 years old
        if(bloodDonor.getAge() < 18) {
            throw INVALID_DONATION_SCHEDULING_EXCEPTION2;
        }
        if(bloodDonor.getAge() > 79) {
            throw new InvalidDonationSchedulingException(("The donor is 80 years of age or older."));
        }

        bloodDonationAppointment.setDonorId(bloodDonor.getId());
        bloodDonationAppointment.setBloodType(bloodDonor.getBloodType());

        if(bloodDonor.getLastDonationDate() == null){
            bloodDonationAppointment.setFirsttimeDonor(true);
        } else {
            bloodDonationAppointment.setFirsttimeDonor((false));
        }


        List<AppointmentSlot> appointmentSlotList = database.getAppointmentSlots();

        for (AppointmentSlot appointmentSlot: appointmentSlotList) {
            if (appointmentSlot.getBloodType().equalsIgnoreCase(bloodDonor.getBloodType())) {
                if (((DAYS.between(bloodDonor.getLastDonationDate(), appointmentSlot.getDate())) >= 56
                        && (DAYS.between(bloodDonor.getLastDonationDate(), appointmentSlot.getDate())) <= 365)
                        || (bloodDonationAppointment.isFirsttimeDonor())) {
                    bloodDonationAppointment.setLocation(appointmentSlot.getLocation());
                    bloodDonationAppointment.setDate(appointmentSlot.getDate());
                    bloodDonationAppointment.setStartTime((appointmentSlot.getStartTime()));
                    bloodDonationAppointment.setEndTime((appointmentSlot.getEndTime()));
                    bloodDonationAppointment.setId("MOCK-APPOINTMENT-123");
                } else if (DAYS.between(bloodDonor.getLastDonationDate(), appointmentSlot.getDate()) < 56) {
                    throw new InvalidDonationSchedulingException(("Donor must wait at least 56 days until next donation."));
                } else {
                    throw new InvalidDonationSchedulingException(("Last donation was over a year ago."));
                }
            }
            if (bloodDonationAppointment.getStartTime() == null) {
                System.out.println(bloodDonationAppointment);
                throw new InvalidDonationSchedulingException("No appointments available for this blood type.");
            }
        }

        return bloodDonationAppointment;
    }
}