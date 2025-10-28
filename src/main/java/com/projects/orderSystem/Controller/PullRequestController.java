package com.projects.orderSystem.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PullRequestController {

    @GetMapping("/ListAllOrders")
    public ResponseEntity<?> getAllOrder(){
        return ResponseEntity.ok("String");
    }

}
