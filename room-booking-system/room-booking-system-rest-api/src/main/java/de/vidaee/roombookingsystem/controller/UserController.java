package de.vidaee.roombookingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.vidaee.roombookingsystem.IUserRepository;
import de.vidaee.roombookingsystem.User;

@RestController
public class UserController {

    private final IUserRepository userRepository;

    @Autowired()
    public UserController(final IUserRepository userRepository){
        this.userRepository= userRepository;
    }


    @GetMapping("/users")
    public Iterable<User> list(){
        return this.userRepository.list();
    }
    
}
