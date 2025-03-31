package com.jwt.JwtAuthentication.services;

import com.jwt.JwtAuthentication.pojos.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(UUID.randomUUID().toString(), "John", "john@doe.com"));
        users.add(new User(UUID.randomUUID().toString(), "Mark", "mark@rem.com"));
        users.add(new User(UUID.randomUUID().toString(), "Julius", "julius@cay.com"));
        users.add(new User(UUID.randomUUID().toString(), "Garry", "gary@dus.com"));
    }

    public List<User> getUsers() {
        return users;
    }
}
