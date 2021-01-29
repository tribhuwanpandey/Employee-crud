package com.aspirewebs.empservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aspirewebs.empservice.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{}
