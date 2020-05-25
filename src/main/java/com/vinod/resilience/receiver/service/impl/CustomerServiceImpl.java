package com.vinod.resilience.receiver.service.impl;

import com.vinod.resilience.receiver.model.Customer;
import com.vinod.resilience.receiver.repository.CustomerRepository;
import com.vinod.resilience.receiver.service.ICustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
	private static final Logger LOGGER= LogManager.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		LOGGER.trace("Request came to fetch all the customer information");
		List<Customer> customerList=customerRepository.findAll();
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> findCustomerById(Long id) {
		LOGGER.trace("Request came to find customer with id: {}",id);
		return customerRepository.findById(id);
	}

	@Override
	public Customer addCustomer(Customer customer) {
		LOGGER.trace("Request came to add customer : {}",customer);
		return customerRepository.save(customer);
	}
}
