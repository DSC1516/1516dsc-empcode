package com.rest.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rest.api.entity.Employee;

public interface EmployeeService {
//for create
	Employee saveEmployee(Employee emp);
	
//get All user
	List<Employee> getallEmployees();
// get single Employee
	public Optional<Employee> getEmployee(int id);

	void calculateTaxDetails(Optional<Employee> employee);
}
