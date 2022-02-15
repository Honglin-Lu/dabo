package tech.honglin.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.honglin.dashboard.entity.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findAll();

    Customer findById(int id);

    //Customer findByEmail(String email);

    Customer save(Customer customer);

    void deleteById(int id);




}
