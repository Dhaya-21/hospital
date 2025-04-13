package com.Project.Hospital.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Project.Hospital.Model.Appointment;
import com.Project.Hospital.Model.Doctor;
import com.Project.Hospital.Service.PatientService;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/doctorDetails/{doctorId}")
    public Doctor getDoctorDetails(@PathVariable Long doctorId) {
        return patientService.getDoctorDetails(doctorId);
    }

    @GetMapping("/viewReports/{patientId}")
    public List<Appointment> viewReports(@PathVariable Long patientId) {
        return patientService.viewReports(patientId);
    }

    @GetMapping("/appointmentDetails/{patientId}")
    public Appointment getAppointmentDetails(@PathVariable Long patientId) {
        return patientService.getAppointmentDetails(patientId);
    }
}
 