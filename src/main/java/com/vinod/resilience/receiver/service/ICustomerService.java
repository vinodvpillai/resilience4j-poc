package com.vinod.resilience.receiver.service;

import com.vinod.resilience.receiver.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {

	Optional<Customer> findCustomerById(Long id);

	List<Customer> getAllCustomers();

	Customer addCustomer(Customer customer);

}
