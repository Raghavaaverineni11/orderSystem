package com.projects.orderSystem.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PullRequestController {


    @GetMapping("/check-access")
    public ResponseEntity<String>  print(){
        return ResponseEntity.ok("Autehnticatred Succesfullt");
    }





}
