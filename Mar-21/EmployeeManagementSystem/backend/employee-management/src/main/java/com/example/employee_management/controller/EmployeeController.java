package com.example.employee_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_management.dto.EmployeeDTO;
import com.example.employee_management.model.Employee;
import com.example.employee_management.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping
	public List<Employee> findAll() {
		return empService.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee find(int id) {
		return empService.find(id);
	}
	
	@GetMapping("/{email}")
	public Employee searchByEmail(String email) {
		return empService.searchByEmail(email);
	}
	
	@GetMapping("/{name}")
	public List<Employee> searchByName(String name) {
		return empService.searchByName(name);
	}
	
	@GetMapping("/sorted")
	public List<Employee> sortBySalary() {
		return empService.sortBySalary();
	}
	
	@PostMapping
	public Employee add(Employee employee) {
		return empService.add(employee);
	}
	
	@PostMapping("/batch")
	public List<Employee> addBatch(List<Employee> employees) {
		return empService.addBatch(employees);
	}
	
	@PatchMapping("/{id}")
	public Employee update(int id, EmployeeDTO emp) {
		return empService.update(id, emp);
	}
	
	@DeleteMapping("/{id}")
	public Employee delete(int id) {
		return empService.delete(id);
	}
	
	@DeleteMapping
	public List<Employee> deleteAll() {
		return empService.deleteAll();
	}
}
