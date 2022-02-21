package tech.honglin.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import tech.honglin.dashboard.entity.User;
import tech.honglin.dashboard.repository.UserRepository;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/users")
    User createOrSaveUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }

    @GetMapping("/users")
    Page<User> getUserList(@PageableDefault(value = 6) Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @DeleteMapping("/users/{id}")
    boolean deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return true;
    }

}
