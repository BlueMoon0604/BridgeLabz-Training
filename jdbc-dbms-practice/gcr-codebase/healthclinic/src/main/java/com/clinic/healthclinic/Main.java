package com.clinic.healthclinic;

import java.sql.Date;
import java.sql.Time;

import com.clinic.healthclinic.dao.*;
import com.clinic.healthclinic.model.Patient;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Nova",Date.valueOf("2003-05-10"),"8967568090","nova344@gmail.com","Dublin","O+");
        PatientDAO patientDAO = new PatientDAO();
        patientDAO.addPatient(patient);
        
        DoctorDAO doctorDAO = new DoctorDAO();
        doctorDAO.addDoctor("Dr.Welson", "6745892310", 5000.0, 1);

        AppointmentDAO appointmentDAO = new AppointmentDAO();
        appointmentDAO.bookAppointment(1, 1,Date.valueOf("2002-06-28"),Time.valueOf("10:30:00"));
        
        VisitDAO visitDAO = new VisitDAO();
        visitDAO.recordVisit(1, "Fever", "Mild viral infection");

        BillingDAO billingDAO = new BillingDAO();
        billingDAO.generateBill(1, 500.0);
    }
}
