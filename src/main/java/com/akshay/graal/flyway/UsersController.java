package com.akshay.graal.flyway;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsersController {

    private final UsersRepository usersRepository;


    @GetMapping("/get/users")
    public List<Users> getUsers() {
        return usersRepository.findAll();
    }
}
