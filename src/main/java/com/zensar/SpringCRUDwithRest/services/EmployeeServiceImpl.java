package com.zensar.SpringCRUDwithRest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.SpringCRUDwithRest.dao.EmployeeRepository;
import com.zensar.SpringCRUDwithRest.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	
	/*@Override
	public List<Employee> getEmployees() {
		
		return dao.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeById(int empid) {
		
		return dao.findById(empid);
	}

	@Override
	public Employee addNewEmployee(Employee emp) {
	
		return dao.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
		return dao.save(emp);
	}

	@Override
	public void deleteEmployeeById(int empid) {
		dao.deleteById(empid);
		
	}

	@Override
	public void deleteAllEmployees() {
		dao.deleteAll();
		
	}*/
	
	public void setRepo(EmployeeRepository repo) {
		
		System.out.println("hiiiiii");
		this.repo = repo;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		
		return repo.save(emp);
	}

	

	@Override
	public Optional<Employee> getEmployee(int id) {
	
		return repo.findById(id);
	}

	@Override
	public String deleteEmployee(int id) {
		repo.deleteById(id);
		return "Record Deleted";
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return repo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee bean) {
		
		return repo.save(bean);
	}

}
