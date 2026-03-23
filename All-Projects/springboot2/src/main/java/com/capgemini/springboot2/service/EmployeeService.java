package com.capgemini.springboot2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.capgemini.springboot2.dto.EmployeeDTO;
import com.capgemini.springboot2.exception.AlreadyExistsException;
import com.capgemini.springboot2.exception.NotFoundException;
import com.capgemini.springboot2.model.Employee;
import com.capgemini.springboot2.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee save(Employee employee) {
		if (employeeRepo.existsById(employee.getId())) 
			throw new AlreadyExistsException("Employee with ID "+employee.getId()+" already exists.");
		return employeeRepo.save(employee);
	}
	
	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}
	
	public List<Employee> saveAll(List<Employee> employees) {
		return employeeRepo.saveAll(employees);
	}
	
	public Employee findById(int id) {
		return employeeRepo.findById(id).orElseThrow(()-> new NotFoundException("Employee with id "+id+" not found"));
	}
	
	public Employee update(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public Employee updateById(int id, EmployeeDTO emp) {
		Employee employee = employeeRepo.findById(id).orElseThrow(()-> new NotFoundException("Employee with id "+id+" not found"));
		if (emp.getName()!=null) employee.setName(emp.getName());
		if (emp.getEmail()!=null) employee.setEmail(emp.getEmail());
		if (emp.getMobile()!=null) employee.setMobile(emp.getMobile());
		return employeeRepo.save(employee);
	}
	
	public Employee deleteById(int id) {
		Employee employee = employeeRepo.findById(id).orElseThrow(()-> new NotFoundException("Employee with id "+id+" not found"));
		employeeRepo.delete(employee);
		return employee;
	}
	
	public List<Employee> deleteAll() {
		List<Employee> employees = employeeRepo.findAll();
		employeeRepo.deleteAllInBatch();
		return employees;
	}
	
	public List<Employee> sortByName() {
//		return employeeRepo.findAll(Sort.by("name"));
		return employeeRepo.findAllByOrderByNameDesc();
	}
}
