package com.hatim.basics.spring.boot.jpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hatim.basics.spring.boot.jpa.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
	
}
