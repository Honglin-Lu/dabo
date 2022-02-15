package tech.honglin.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.honglin.dashboard.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
