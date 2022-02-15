package tech.honglin.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.honglin.dashboard.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
