package tech.honglin.dashboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.honglin.dashboard.entity.Customer;
import tech.honglin.dashboard.repository.CustomerRepository;


@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    Page<Customer> getAllCustomer(Pageable pageable) {
        Logger logger = LoggerFactory.getLogger(CustomerController.class);
        logger.info("hello this is log");
        return customerRepository.findAll(pageable);
    }
}
