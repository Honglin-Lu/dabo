package tech.honglin.dashboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import tech.honglin.dashboard.entity.Customer;
import tech.honglin.dashboard.repository.CustomerRepository;


@RestController

public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")

    Page<Customer> getAllCustomer(@PageableDefault(value = 1) Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @GetMapping("/customers/{id}")
    Customer getCustomerById(@PathVariable int id){
        return customerRepository.findById(id);
    }

    @PostMapping("/customers")
    Customer newCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

//    @PutMapping("/customers/{id}")
//    Customer updateCustomer(@RequestBody Customer customer, @PathVariable int id){
//
//    }

    @DeleteMapping("/customers/{id}")
    void deleteCustomer(@PathVariable int id){
       customerRepository.deleteById(id);
    }
}
