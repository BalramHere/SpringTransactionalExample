package com.springtransaction.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springtransaction.entity.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {
}
