package com.hatim.basics.spring.boot.jpa.service;

import java.util.Optional;

import com.hatim.basics.spring.boot.jpa.model.Customer;

public interface CustomerService {
	
	Customer save(Customer c);
	Optional<Customer> findById(Long id);
	Iterable<Customer> findByLastName(String lastName);
	Iterable<Customer> findAll();
	
}
