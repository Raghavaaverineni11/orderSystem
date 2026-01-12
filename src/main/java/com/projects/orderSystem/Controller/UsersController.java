package com.projects.orderSystem.Controller;


import com.projects.orderSystem.Entity.Users;
import com.projects.orderSystem.Service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Data
@RestController
public class UsersController {

    @Autowired
    UserService  userService;

    @GetMapping("Users-Roles")
    public ResponseEntity<?>  getUserRoles(){

        List<Users>  us = userService.allUsers();
        return new ResponseEntity<>(us, HttpStatus.OK);

    }

    @GetMapping("findUsers")

}
