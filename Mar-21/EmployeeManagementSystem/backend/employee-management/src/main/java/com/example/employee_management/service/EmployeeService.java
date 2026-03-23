package com.example.employee_management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee_management.dao.EmployeeRepository;
import com.example.employee_management.dto.EmployeeDTO;
import com.example.employee_management.exception.NotFoundException;
import com.example.employee_management.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	public Employee add(Employee employee) {
		return empRepo.save(employee);
	}
	
	public List<Employee> addBatch(List<Employee> employees) {
		return empRepo.saveAll(employees);
	}
	
	public Employee find(int id) {
		return empRepo.findById(id).orElseThrow(() ->
			new NotFoundException("Employee with id "+id+" could not be found"));
	}
	
	public List<Employee> findAll() {
		return empRepo.findAll();
	}
	
	public List<Employee> searchByName(String name) {
		return empRepo.findAllByNameIgnoreCase(name);
	}
	
	public Employee searchByEmail(String email) {
		return empRepo.findByEmailIgnoreCase(email).orElseThrow(()->
			new NotFoundException("Employee with email "+email+" could not be found"));
	}
	
	public List<Employee> sortBySalary() {
		return empRepo.findAllByOrderBySalaryDesc();
	}
	
	public Employee update(int id, EmployeeDTO emp) {
		Employee employee = find(id);
		if (emp.getName()!=null) employee.setName(emp.getName());
		if (emp.getEmail()!=null) employee.setEmail(emp.getEmail());
		if (emp.getMobile()!=null) employee.setMobile(emp.getMobile());
		if (emp.getRole()!=null) employee.setRole(emp.getRole());
		if (emp.getSalary()!=null) employee.setSalary(emp.getSalary());
		return empRepo.save(employee);
	}
	
	public Employee delete(int id) {
		Employee employee = find(id);
		empRepo.delete(employee);
		return employee;
	}
	
	public List<Employee> deleteAll() {
		List<Employee> employees = findAll();
		empRepo.deleteAll();
		return employees;
	}
}
