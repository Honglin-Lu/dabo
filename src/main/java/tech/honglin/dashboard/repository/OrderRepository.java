package tech.honglin.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.honglin.dashboard.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}