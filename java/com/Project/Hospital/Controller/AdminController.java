package com.Project.Hospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.Project.Hospital.Model.Doctor;
import com.Project.Hospital.Model.Patient;
import com.Project.Hospital.Service.AdminService;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/Doctors")
    public ResponseEntity<Doctor> addDoctor(@Valid @RequestBody Doctor doctor) {
        Doctor savedDoctor = adminService.addDoctor(doctor);
        return new ResponseEntity<>(savedDoctor, HttpStatus.OK);
    }
    
    @PostMapping("/Patients")
    public ResponseEntity<Patient> addPatient(@Valid @RequestBody Patient patient) {
        Patient savedPatient = adminService.addPatient(patient);
        return new ResponseEntity<>(savedPatient, HttpStatus.OK);
    }

    @DeleteMapping("/deleteDoctor/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        adminService.deleteDoctor(id);
    }

    @GetMapping("/patientList")
    public List<Patient> getPatientList() {
        return adminService.getPatientList();
    }
    
}
