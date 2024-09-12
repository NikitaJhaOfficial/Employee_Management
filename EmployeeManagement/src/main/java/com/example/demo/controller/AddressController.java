package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	public AddressService addressService;
	
	@GetMapping("/all")
	public String viewAlladdress() {
		return "You can see the address Details here";
	}
	@GetMapping("/view")  //http://localhost:8081/address/view
	public List<Address> viewAddress(){
		return addressService.viewAddress();
	}
	@PostMapping("/add")  //http://localhost:8081/address/add
	public Address addaddress(@RequestBody Address a) {
		return addressService.addAddress(a);
	}
	
	
}

