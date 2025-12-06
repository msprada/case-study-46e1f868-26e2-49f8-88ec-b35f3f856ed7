package de.vidaee.roombookingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.vidaee.roombookingsystem.entitities.User;
import de.vidaee.roombookingsystem.repositories.IUserRepository;

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
