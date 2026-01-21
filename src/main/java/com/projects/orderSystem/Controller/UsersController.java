package com.projects.orderSystem.Controller;


import com.projects.orderSystem.Entity.Users;
import com.projects.orderSystem.Repository.UsersRepository;
import com.projects.orderSystem.Service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @DeleteMapping("Delete-User")
    public ResponseEntity<?>  deletAllUsers()
    {
        usersRepository.deleteAll();
        return ResponseEntity.ok("deleted all");
    }

    @GetMapping("finfbyID")
    public Optional<Users> getById(@RequestParam int id){
        return usersRepository.findById(id);
    }
}
