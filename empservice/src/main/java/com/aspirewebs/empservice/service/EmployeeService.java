package com.aspirewebs.empservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aspirewebs.empservice.model.Employee;
import com.aspirewebs.empservice.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
	}

	public Employee getEmployeeById(int id) {
		Optional<Employee> findById = empRepository.findById(id);
		return findById.get();
	}

	public Employee saveOrUpdate(Employee employeet) {
		return empRepository.save(employeet);
	}

	public void deleteEmployeeById(int id) {
		empRepository.deleteById(id);
	}

}
