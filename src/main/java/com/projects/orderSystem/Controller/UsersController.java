package com.projects.orderSystem.Controller;


import com.projects.orderSystem.Entity.Users;
import com.projects.orderSystem.Repository.UsersRepository;
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

    @Autowired
    UsersRepository usersRepository;

    @GetMapping("find-Users")
    public ResponseEntity<?>  getUserRoles(){

        List<Users>  us = userService.allUsers();
        return new ResponseEntity<>(us, HttpStatus.OK);

    }

    @GetMapping("AdminUsers")
    public ResponseEntity<?>  getUsersbyRole()
    {
        List<Users> admins=usersRepository.findByRole("ROLE_ADMIN");

        return new ResponseEntity<>(admins,HttpStatus.OK);
    }
}
