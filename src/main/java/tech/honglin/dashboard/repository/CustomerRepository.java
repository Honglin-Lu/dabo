package tech.honglin.dashboard.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import tech.honglin.dashboard.entity.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

}
