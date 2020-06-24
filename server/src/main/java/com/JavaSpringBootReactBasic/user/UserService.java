package com.JavaSpringBootReactBasic.user;

import lombok.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
@RequiredArgsConstructor // Lombok to create the Required Args Constructor
@Service // Instruct Spring Boot that this is the Service layer
class UserService {


    // Import Methods from other Class
    private final UserRepository userRepository; // Class from which methods are being imported


    // Get user by ID
    Optional<User> getUserById(String id) { // Generate function
        return this.userRepository.findById(id); // Call JPA function via the Repository
    }

    // Delete user
    void deleteUser(String id) { // Generate function
        userRepository.deleteById(id); // Call JPA function via the Repository
    }

    void createUser() {
    }

    List<User> getAllUsers() { // Generate function
        List<User> users = new ArrayList<>();
        userRepository.findAll() // Call JPA function via the Repository
                .forEach(users::add);
        return users;  //return list of users
    }
    // Update user
    void updateUser(User user) { // Generate function
        userRepository.save(user); // Call JPA function via the Repository
    }

}
