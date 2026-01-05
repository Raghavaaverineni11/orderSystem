package com.projects.orderSystem.Controller;


import com.projects.orderSystem.Entity.Users;
import com.projects.orderSystem.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authorization.method.AuthorizeReturnObject;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class PullRequestController {



    @Autowired
    private Users users;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsersRepository usersRepository;



    @GetMapping("/check-access")
    public ResponseEntity<String>  print(){
        return ResponseEntity.ok("Autehnticatred Succesfullt");
    }

    @PostMapping("/create-User")
    public ResponseEntity<?> saveUserDetails(@RequestBody Users users){

        if(users.getUsername()==null || users.getUsername().isBlank() || users.getPassword() == null || users.getPassword().isBlank()){
            return ResponseEntity.badRequest().body(Map.of("error", "username and password are required"));
        }

       // if(usersRepository.findByUsername(users.getUsername())!=null)



    }

    String teach="Nikhikl";
    





}
