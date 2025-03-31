package com.jwt.JwtAuthentication.controllers;

import com.jwt.JwtAuthentication.pojos.User;
import com.jwt.JwtAuthentication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    //http://localhost:8081/home/users
    @GetMapping("/users")
    public List<User> getUser() {
      return userService.getUsers();
}

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }

}
