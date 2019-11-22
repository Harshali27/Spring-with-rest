package com.zensar.SpringCRUDwithRest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.SpringCRUDwithRest.model.Employee;

import com.zensar.SpringCRUDwithRest.services.EmployeeServiceImpl;

@RestController
@RequestMapping(value="/user")
public class RestApiController {

	@Autowired
	EmployeeServiceImpl service;
	
	
	
	public void setService(EmployeeServiceImpl service) {
		
		System.out.println("hello");
		this.service = service;
	}

	@PostMapping(value="/add")
	public String addEmployee(@RequestBody Employee emp)
	{
		service.addEmployee(emp);
		return "Employee added Successfully";
	}
	
	@GetMapping(value="/get/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id)
	{
		return service.getEmployee(id);
	}
	
	@GetMapping(value="/get")
	public List<Employee> getAllEmployee()
	{
		return service.getAllEmployees();
	}
	
	@PutMapping(value = "/update")
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		Employee e1 = new Employee();
		
		e1.setId(emp.getId());
		e1.setName(emp.getName());
		e1.setDepartment(emp.getDepartment());
		e1.setSalary(emp.getSalary());
		
		return service.updateEmployee(e1);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		service.deleteEmployee(id);
		return"Employee Deleted Sucessfully";
	}
	
}
