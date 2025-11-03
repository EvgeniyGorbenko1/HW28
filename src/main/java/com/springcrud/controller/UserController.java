package com.springcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.springcrud.model.User;
import com.springcrud.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public ModelAndView getUsers (ModelAndView modelAndView){
        List<User> users = userService.getAllUsers();
        modelAndView.setViewName("users");
        modelAndView.addObject("usersKey", users);
        return modelAndView;
}
    @PostMapping("/delete/{id}")
    public String deleteUserById (@PathVariable("id")int id){
        userService.deleteUser(id);
        return "redirect:/users";

    }

    @PostMapping("/update/{id}")
    public String updateUserById (@PathVariable("id")int id, @RequestParam("userName") String userName,
                                  @RequestParam("password") String password,
                                  @RequestParam("firstName") String firstName,
                                  @RequestParam("lastName") String lastName){
        userService.updateUser(userName, password, firstName, lastName, id);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String editUserById (@PathVariable("id")int id, Model model){
        User user = userService.findById(id);

        if (user == null) {
            // Перенаправляем на страницу ошибки или список пользователей
            return "redirect:/users?error=User not found";
        }
        model.addAttribute("user", user);
        return "edit-user";
    }
}
