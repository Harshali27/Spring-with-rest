package com.zensar.SpringCRUDwithRest.services;

import java.util.List;
import java.util.Optional;

import com.zensar.SpringCRUDwithRest.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);
	
	public Optional<Employee> getEmployee(int id);
	
	public String deleteEmployee(int id);
	
	public List<Employee> getAllEmployees();
	
	public Employee updateEmployee(Employee bean);
	
	/*public List<Employee> getEmployees();
	public Optional <Employee> getEmployeeById(int empid);
	public Employee addNewEmployee(Employee emp);
	public Employee updateEmployee(Employee emp);
	public void deleteEmployeeById(int empid);
	public void deleteAllEmployees();*/
}
