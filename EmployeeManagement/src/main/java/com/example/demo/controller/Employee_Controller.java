package com.example.demo.controller;

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

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class Employee_Controller {
	
	
	@Autowired
	public EmployeeService employeeService;
	
	
	@GetMapping("/all")
	public String viewAllemployees() {
		return "You can see the Employee Details here";
	}
	//1.Insert
	@PostMapping("/add")  //http://localhost:8081/employee/add
	public String addEmployee(@RequestBody Employee e) {
		employeeService.addEmployee(e);
		return "Hi " +e.getName()+" Employee added successfully";
		
	}
	@GetMapping("/view")  //http://localhost:8081/employee/view
	public List<Employee> viewEmployees(){
		return employeeService.viewEmployees();
	}
	@DeleteMapping("/delete/{id}")  //http://localhost:8081/employee/delete/1
	public void deleteById(@PathVariable int id) {
		this.employeeService.deleteById(id);
		
	}
	@GetMapping("/view/{id}") //http://localhost:8081/employee/view/1
								//http://localhost:8081/employee/view
	public Optional<Employee> getById(@PathVariable int id){
		return employeeService.getById(id);
		
	}
	@PutMapping("/edit/{id}")   //http://localhost:8081/employee/edit/1
	public Employee updateEmployee(@RequestBody Employee e) {
		return employeeService.updateEmployee(e);
		
	}
//	@PostMapping("/add") //method:post    //http://localhost:8080/employee/add
//	public String addEmployee1( @RequestBody Employee e) {
//		 employeeService.addEmployee(e);
//		 return "Hi " +e.getName()+" Employee added successfully";
//		
//	}

}
