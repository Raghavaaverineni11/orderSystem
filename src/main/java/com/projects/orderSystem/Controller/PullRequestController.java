package com.projects.orderSystem.Controller;


import com.projects.orderSystem.Entity.Users;
import com.projects.orderSystem.Repository.UsersRepository;
import com.projects.orderSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authorization.method.AuthorizeReturnObject;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PullRequestController {




    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsersRepository usersRepository;


    @Autowired
    private UserService userService;



    @GetMapping("/check-access")
    public ResponseEntity<String>  print(){
        return ResponseEntity.ok("Autehnticatred Succesfullt");
    }

    @PostMapping("/create-User")
    public ResponseEntity<?> saveUserDetails(@RequestBody Users users) {
        try {
            Users saved = userService.createUser(users);
            return ResponseEntity.ok(Map.of(
                    "message", "User created successfully",
                    "id", saved.getId(),
                    "username", saved.getUsername(),
                    "role", saved.getRole()
            ));
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(Map.of("error", ex.getMessage()));
        }
    }

    String teach="Nikhikl";
    String date="jan 08";
    





}
