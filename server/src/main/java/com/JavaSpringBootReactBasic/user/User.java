package com.JavaSpringBootReactBasic.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 *
 */
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table( name = "users",
uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email")
})
public class User{

    @Id // Database table key is the ID
    @GeneratedValue(generator = "uuid") // Generate UUID as ID
    @GenericGenerator(name = "uuid", strategy = "uuid2") // Create key value sequence
    private String id;

    private String username;
    private String email;
    private String firstName;
    private String lastName;

    @JsonIgnore
    @NotBlank // Password is required
    @Size(max = 125) // Password may consist of a maximum of 125 characters
    private String password;


    // All Args Constructor
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;

        System.out.println("Java 14");
    }

}
