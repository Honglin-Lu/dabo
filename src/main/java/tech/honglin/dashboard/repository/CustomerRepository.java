package tech.honglin.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.honglin.dashboard.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
