package tech.honglin.dashboard.repository;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tech.honglin.dashboard.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
