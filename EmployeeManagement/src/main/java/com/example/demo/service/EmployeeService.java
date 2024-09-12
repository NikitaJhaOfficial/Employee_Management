package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	public EmployeeRepository employeeRepository;

	public  Employee addEmployee(Employee e) {
		
		return employeeRepository.save(e);
	}

	public List<Employee> viewEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		this.employeeRepository.deleteById(id);
	}

	public Optional<Employee> getById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return employeeRepository.save(e);
	}

//	public List<Employee> viewEmployees() {
//		
//		return employeeRepository.findAll();
//	}
//	
	

}
