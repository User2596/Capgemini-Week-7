package com.example.employee_management.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee_management.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public List<Employee> findAllByNameIgnoreCase(String name);
	public Optional<Employee> findByEmailIgnoreCase(String email);
	public List<Employee> findAllByOrderBySalaryDesc();
}
