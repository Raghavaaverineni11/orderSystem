package com.projects.orderSystem.Controller;


import com.projects.orderSystem.Service.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PullRequestController {

    @Autowired
    Booking bookingservice;

    @GetMapping("/ListAllOrders")
    public ResponseEntity<?> getAllOrder(){
        List<String> name=bookingservice.getNames();
        return ResponseEntity.ok().header("application","Json").body(name);
    }

}
