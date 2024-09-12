package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.service.AddressService;

@SpringBootApplication
public class MainAddress {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
		System.out.println("app is running...");

	}
	
	
	

}
