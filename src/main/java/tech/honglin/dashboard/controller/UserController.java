package tech.honglin.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import tech.honglin.dashboard.entity.User;
import tech.honglin.dashboard.repository.UserRepository;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/users")
    Page<User> getAllUsers(Pageable pageable) {
//        return userRepository.findByEmail("bbb@bbb.com", pageable);
//        return userRepository.findFirstByOrderByIdAsc();
        return userRepository.queryFirst3ByName("ccc", pageable);
    }

    @GetMapping(value = "/users/count")
    long getCount(Pageable pageable) {
        return userRepository.countByName("ccc");
    }

    @GetMapping("/str")
    String getStr() {
        return "this is str";
    }

    @GetMapping("/w")
    int error() {
        throw new RuntimeException("this is exception");
    }

    @PostMapping("/users")
    User createOrSaveUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }



}