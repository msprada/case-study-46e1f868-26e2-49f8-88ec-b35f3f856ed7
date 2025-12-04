package de.vidaee.roombookingsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import de.vidaee.roombookingsystem.user.IUserRepository;
import de.vidaee.roombookingsystem.user.User;
import jakarta.inject.Inject;


@RestController
public class UserController {

    private final IUserRepository userRepository;

    @Inject()
    public UserController(final IUserRepository userRepository){
        this.userRepository= userRepository;
    }


    @GetMapping("/users")
    public List<User> list(){
        return new ArrayList<>();
    }
    
}
