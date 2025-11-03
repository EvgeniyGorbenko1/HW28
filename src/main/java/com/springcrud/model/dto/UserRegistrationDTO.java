package com.springcrud.model.dto;

import com.springcrud.annotation.CustomUserName;
import jakarta.validation.constraints.Pattern;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationDTO {
    @CustomUserName
    private String username;


    private String password;

    //@Pattern(regexp = "[A-z,А-я]{3,10}")
    private String firstName;

   // @Pattern(regexp = "[A-z,А-я]{3,10}")
    private String lastName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
