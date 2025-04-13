package com.Project.Hospital.Repository;

import com.Project.Hospital.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}