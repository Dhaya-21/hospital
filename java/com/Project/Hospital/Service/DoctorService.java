package com.Project.Hospital.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.Hospital.Model.Appointment;
import com.Project.Hospital.Model.Doctor;
import com.Project.Hospital.Repository.AppointmentRepository;
import com.Project.Hospital.Repository.DoctorRepository;



@Service
public class DoctorService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    

    @Autowired
    private DoctorRepository doctorRepository;


    public List<Appointment> viewPatients(Long doctorId) {
        return appointmentRepository.findByDoctorId(doctorId);
    }

    public Appointment scheduleAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> viewReports(Long patientId) {
        return appointmentRepository.findByPatientId(patientId);
    }
    
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
}

