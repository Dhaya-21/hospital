package com.Project.Hospital.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.Hospital.Model.Appointment;
import com.Project.Hospital.Model.Doctor;
import com.Project.Hospital.Repository.AppointmentRepository;
import com.Project.Hospital.Repository.DoctorRepository;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor getDoctorDetails(Long doctorId) {
        return doctorRepository.findById(doctorId).orElse(null);
    }

    public List<Appointment> viewReports(Long patientId) {
        return appointmentRepository.findByPatientId(patientId);
    }

    public Appointment getAppointmentDetails(Long patientId) {
        return appointmentRepository.findByPatientId(patientId).get(0); // assuming one appointment
    }
}
