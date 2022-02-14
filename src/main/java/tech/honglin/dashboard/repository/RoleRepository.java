package tech.honglin.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.honglin.dashboard.base.ERole;
import tech.honglin.dashboard.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
