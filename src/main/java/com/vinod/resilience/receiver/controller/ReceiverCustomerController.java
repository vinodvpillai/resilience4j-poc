package com.vinod.resilience.receiver.controller;

import com.vinod.resilience.receiver.model.Customer;
import com.vinod.resilience.receiver.service.ICustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ReceiverCustomerController {
	private static final Logger LOGGER= LogManager.getLogger(ReceiverCustomerController.class);

	//TODO: Need to appropriate log message.
	//TODO: Need to handle exception properly.
	//TODO: Need to add appropriate comments.

	@Autowired
	private ICustomerService customerService;

	@GetMapping(value = "/receive-customer")
	public List<Customer> customerList(Model model) {
		LOGGER.trace("Request came to get all the customer details");
		List<Customer> customerlist = customerService.getAllCustomers();
		return customerlist;
	}

	@GetMapping(value = "/receive-customer/{id}")
	public Customer getCustomerById(@PathVariable Long id) {
		LOGGER.trace("Request came to get customer detail information for customer id: {}",id);
		Customer customer=null;
		Optional<Customer> optionalCustomer=customerService.findCustomerById(id);
		if(optionalCustomer.isPresent()) {
			return optionalCustomer.get();
		}
		return customer;
	}

	@PostMapping(value = "/receive-customer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		LOGGER.trace("Request came to add new for customer email id: {}",customer.getEmailid());
		return customerService.addCustomer(customer);
	}
}
