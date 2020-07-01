package com.JavaSpringBootReactBasic.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor // Lombok to create the Required Args Constructor
@CrossOrigin(origins="http://localhost:3000", maxAge = 3600) // Cross origin allowed for port 3000
@RestController // Instruct Spring Boot that this is the REST Controller
@RequestMapping("/api/users") // Link to access GET/POST/PUT/DELETE requests
public class UserController {

    private final UserService userService;



    @GetMapping("")// Access granted for Admin Role
    List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @GetMapping("/{id}")
    Optional<User> getUserById(@PathVariable String id){
        return this.userService.getUserById(id);
    }

    @PostMapping("/create") // Handle HTTP Post request to register new users
    public void createUser(){
        this.userService.createUser();
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        this.userService.deleteUser(id);
    }

    @PutMapping
    public void updateUser(@PathVariable User user){
        this.userService.updateUser(user);


    }


}
