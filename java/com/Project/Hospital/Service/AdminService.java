package com.Project.Hospital.Service;

import com.Project.Hospital.Model.Doctor;
import com.Project.Hospital.Model.Patient;
import com.Project.Hospital.Repository.DoctorRepository;
import com.Project.Hospital.Repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

  
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
    
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    
    public void deleteDoctor(Long doctorId) {
        doctorRepository.deleteById(doctorId);
    }

 
    public List<Patient> getPatientList() {
        return patientRepository.findAll();
    }
}
