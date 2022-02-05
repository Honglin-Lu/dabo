package tech.honglin.dashboard.repository;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import tech.honglin.dashboard.entity.User;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    //Page<String> findName(Pageable pageable);
    Long countByName(String name);

    Page<User> findByEmail(String email, Pageable pageable);

    User findFirstByOrderByIdAsc();

    Page<User> queryFirst3ByName(String name, Pageable pageable);
}
