package com.sa.telecom.plm.infrastructure.persistance.repository;

import com.sa.telecom.plm.models.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails,Integer> {
}
