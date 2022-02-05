package tech.honglin.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.honglin.dashboard.entity.Customer;
import tech.honglin.dashboard.repository.CustomerRepository;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    Page<Customer> getAllCustomer(Pageable pageable) {

        return customerRepository.findAll(pageable);
    }
}
