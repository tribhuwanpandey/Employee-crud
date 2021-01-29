package com.aspirewebs.empservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aspirewebs.empservice.model.Employee;
import com.aspirewebs.empservice.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return empService.getAllEmployee();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable(name = "id") int id) {
		return empService.getEmployeeById(id);
	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployeeById(@PathVariable(name = "id") int id) {
		empService.deleteEmployeeById(id);
	}

	@PostMapping("/employees/add")
	public Employee save(@RequestBody Employee employee) {
		return empService.saveOrUpdate(employee);
	}

	@PutMapping("/employees")
	public Employee update(@RequestBody Employee employee) {
		return empService.saveOrUpdate(employee);
	}
}
