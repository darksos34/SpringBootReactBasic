package com.JavaSpringBootReactBasic.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // Instruct Spring Boot that this is the Repository
public interface UserRepository extends JpaRepository<User, String> {

// needs to be conntected with the user controller
    //findById
    //findAllUsers

}
