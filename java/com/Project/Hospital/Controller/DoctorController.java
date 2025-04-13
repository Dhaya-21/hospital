package com.Project.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.Hospital.Model.Appointment;
import com.Project.Hospital.Service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/viewPatients/{doctorId}")
    public List<Appointment> viewPatients(@PathVariable Long doctorId) {
        return doctorService.viewPatients(doctorId);
    }

    @PostMapping("/scheduleAppointment")
    public Appointment scheduleAppointment(@RequestBody Appointment appointment) {
        return doctorService.scheduleAppointment(appointment);
    }

    @GetMapping("/viewReports/{patientId}")
    public List<Appointment> viewReports(@PathVariable Long patientId) {
        return doctorService.viewReports(patientId);
    }
}
