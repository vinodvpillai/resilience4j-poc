package com.vinod.resilience.receiver.repository;

import com.vinod.resilience.receiver.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
