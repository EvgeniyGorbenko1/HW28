package com.springcrud.controller;

import com.springcrud.model.User;
import com.springcrud.model.dto.UserRegistrationDTO;
import com.springcrud.service.SecurityService;
import com.springcrud.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/security")
public class SecurityController{
    SecurityService securityService;
    UserService userService;

    public SecurityController(SecurityService securityService, UserService userService) {
        this.securityService = securityService;
        this.userService = userService;
    }
@PostMapping("/registration")
public String registration(@ModelAttribute UserRegistrationDTO userRegistrationDTO,
                           BindingResult bindingResult,
                           Model model){
Boolean result = securityService.registration(userRegistrationDTO);
if(result){
    List<User> users =userService.getAllUsers();
    model.addAttribute("usersKey", users);
    return "users";
}
return "users";
}
}
