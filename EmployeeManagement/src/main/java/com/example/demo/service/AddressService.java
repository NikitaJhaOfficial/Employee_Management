package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	public AddressRepository addressRepository;

	public List<Address> viewAddress() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

	public Address addAddress(Address a) {
		// TODO Auto-generated method stub
		return addressRepository.save(a);
	}
	

}
