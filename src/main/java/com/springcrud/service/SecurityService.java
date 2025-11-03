package com.springcrud.service;

import com.springcrud.model.User;
import com.springcrud.model.dto.UserRegistrationDTO;
import com.springcrud.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SecurityService {
    private final UserRepository userRepository;

    public SecurityService( UserRepository userRepository) {

        this.userRepository = userRepository;
    }

public Boolean registration (UserRegistrationDTO userRegistrationDTO) {
    User user = new User();
    user.setUserName(userRegistrationDTO.getUsername());
    user.setFirstName(userRegistrationDTO.getFirstName());
    user.setLastName(userRegistrationDTO.getLastName());
    user.setPassWord(userRegistrationDTO.getPassword());
    user.setCreatedAt(LocalDate.now());
    user.setUpdatedAt(LocalDate.now());

    try{
        return userRepository.addUser (user, userRegistrationDTO.getPassword()) > 0;
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    return false;
}
}
