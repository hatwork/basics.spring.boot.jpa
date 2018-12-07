package com.hatim.basics.spring.boot.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hatim.basics.spring.boot.jpa.dao.CustomerRepository;
import com.hatim.basics.spring.boot.jpa.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repo;
	
	@Override
	public Customer save(Customer c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public Optional<Customer> findById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public List<Customer> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return repo.findByLastName(lastName);
	}

	@Override
	public Iterable<Customer> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
