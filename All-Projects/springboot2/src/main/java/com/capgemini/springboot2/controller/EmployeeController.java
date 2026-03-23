package com.capgemini.springboot2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboot2.dto.EmployeeDTO;
import com.capgemini.springboot2.model.Employee;
import com.capgemini.springboot2.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> show() {
		return employeeService.sortByName();
	}
	
	@GetMapping("/{id}")
	public Employee findById(@PathVariable int id) {
		return employeeService.findById(id);
	}
	
	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}
	
	@PostMapping("/batch")
	public List<Employee> saveAll(@RequestBody List<Employee> employees) {
		return employeeService.saveAll(employees);
	}
	
	@PutMapping
	public Employee update(@RequestBody Employee employee) {
		return employeeService.update(employee);
	}

	@PatchMapping("/{id}")
	public Employee updateById(@PathVariable int id, @RequestBody EmployeeDTO emp) {
		return employeeService.updateById(id, emp);
	}
	
	@DeleteMapping
	public List<Employee> deleteAll() {
		return employeeService.deleteAll();
	}
	
	@DeleteMapping("/{id}")
	public Employee deletebyId(@PathVariable int id) {
		return employeeService.deleteById(id);
	}
}
