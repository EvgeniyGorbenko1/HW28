package com.springcrud.service;


import org.springframework.stereotype.Service;
import com.springcrud.model.User;
import com.springcrud.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public void updateUser(String newUserName, String newPassWord, String newFirstName, String newLastName, int id) {
        userRepository.updateUser(newUserName, newPassWord, newFirstName, newLastName, id);
    }

    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }

    public User findById(int id) {
        return userRepository.findById(id);
    }
}
